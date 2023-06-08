package com.yohwan.study.xml;

import org.springframework.core.io.ClassPathResource;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SaxParser {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        //DomParser 보다 메모리를 덜 사용한다, visitor pattern 을 사용함, Simple Api for XML
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        saxParser.parse(new ClassPathResource("members.xml").getInputStream(), new MemberHandler());
    }

    static class MemberHandler extends DefaultHandler {

        private String text;

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            this.text = new String(ch, start, length);
        }

        @Override
        public void startDocument() throws SAXException {
            System.out.println("start parsing xml");
        }

        @Override
        public void endDocument() throws SAXException {
            System.out.println("end parsing xml");
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            System.out.println("element : " + qName);
            if(qName.equals("member")) {
                System.out.println(attributes.getValue("id"));
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if(qName.equals("username")) {
                System.out.println("username : " + text);
            }

            if(qName.equals("license")) {
                System.out.println("license : " + text);
            }
        }
    }
}
