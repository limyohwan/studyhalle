package com.yohwan.study.queue;

import com.yohwan.study.linkedlist.ListNode;

import java.util.EmptyStackException;

public class ListNodeQueue {
    private ListNode head;
    private int size = 0;
    public void add(int element) {
        ListNode nodeToAdd = new ListNode(element);

        if(head == null) {
            head = nodeToAdd;
            size = 1;
            return;
        }

        ListNode temp = head;
        for(int i = 1; i < size; i++){
            temp = temp.next;
        }
        temp.next = nodeToAdd;
        size++;
    }

    public int remove() {
        if(size == 0) {
            throw new EmptyStackException();
        }

        ListNode temp = head;
        int result = temp.val;
        if(temp.next != null){
            head = temp.next;
        }else{
            head = null;
        }
        size--;
        return result;
    }

    public int element() {
        if(size == 0) {
            throw new EmptyStackException();
        }

        return head.val;
    }

    public int getSize(){
        return this.size;
    }
}
