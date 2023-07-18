package com.yohwan.study.codingtest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] solution(int[][] data) {

        List<Integer> answerList = new ArrayList<>();

        LinkedList<Document> documentQueue = createDocumentQueue(data);

        Document document = setInitDocument(answerList, documentQueue);

        int time = setInitTime(document);

        while(!documentQueue.isEmpty()) {
            int nextDocumentId = calculateNextDocumentId(documentQueue, time);
            Document nextDocument = documentQueue.remove(nextDocumentId);
            time += nextDocument.page;
            answerList.add(nextDocument.id);
        }

        return answerListToArray(answerList);
    }

    private int[] answerListToArray(List<Integer> answerList) {
        int[] answer = new int[answerList.size()];

        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    private int calculateNextDocumentId(LinkedList<Document> documentQueue, int time) {
        int nextDocumentId = 0;
        int minimumPage = 100000;

        for(int i = 0; i < documentQueue.size(); i++) {
            Document foundDocument = documentQueue.get(i);

            if(foundDocument.isGreaterThan(time)) {
                break;
            }

            if(foundDocument.isEqualTo(time)) {
                nextDocumentId = i;
                break;
            }

            if(foundDocument.isLessThan(minimumPage)){
                minimumPage = foundDocument.page;
                nextDocumentId = i;
            }
        }
        return nextDocumentId;
    }

    private int setInitTime(Document document) {
        return document.page + document.requestTime;
    }

    private Document setInitDocument(List<Integer> answerList, LinkedList<Document> documentQueue) {
        Document document = documentQueue.poll();
        answerList.add(document.id);
        return document;
    }

    private LinkedList<Document> createDocumentQueue(int[][] data) {
        LinkedList<Document> documentQueue = new LinkedList<>();
        for(int i = 0; i < data.length; i++) {
            documentQueue.add(new Document(data[i][0], data[i][1], data[i][2]));
        }
        return documentQueue;
    }

    class Document {
        int id;
        int requestTime;
        int page;

        Document(int id, int requestTime, int page) {
            this.id = id;
            this.requestTime = requestTime;
            this.page = page;
        }

        boolean isEqualTo(int time) {
            return this.requestTime == time;
        }

        boolean isGreaterThan(int time) {
            return this.requestTime > time;
        }

        boolean isLessThan(int page) {
            return this.page < page;
        }
    }
}
