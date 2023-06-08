package com.yohwan.study.xml;

import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DomParser {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new ClassPathResource("members.xml").getInputStream());
        //모든 다큐먼트를 다 가지고와서 xml 파일이 크면 메모리를 많이 잡아먹게됨
        NodeList members = document.getElementsByTagName("member");
        for(int i = 0; i < members.getLength(); i++) {
            Node node = members.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String id = element.getAttribute("id");
                System.out.println(id);
                NodeList child = element.getChildNodes();
                for (int j = 0; j < child.getLength(); j++) {
                    Node childNode = child.item(j);
                    if(childNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element childElement = (Element) childNode;
                        String textContent = childElement.getTextContent();
                        System.out.println(childElement.getNodeName() + " : " + textContent);
                    }
                }
            }
        }
    }
}
