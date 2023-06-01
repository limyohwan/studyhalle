package com.yohwan.study.stack;

import com.yohwan.study.linkedlist.ListNode;

import java.util.EmptyStackException;

public class ListNodeStack {
    private ListNode head;
    private int size = 0;
    public void push(int element) {
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

    public int pop() {
        if(size == 0) {
            throw new EmptyStackException();
        }

        ListNode temp = head;
        for(int i = 0; i < size-1; i++){
            temp = temp.next;
        }
        int result = temp.val;
        temp = null;
        size--;
        return result;
    }

    public int getSize(){
        return this.size;
    }
}
