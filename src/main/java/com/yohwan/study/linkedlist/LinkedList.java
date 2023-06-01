package com.yohwan.study.linkedlist;

public class LinkedList {
    private int size = 0;

    public int getSize() {
        return size;
    }

    ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        ListNode node = head;

        if(size < position){
            return null;
        }

        if (head == null) {
            node = nodeToAdd;
            head = node;
        } else {
            for (int i = 1; i < position; i++) {
                node = node.next;
            }
            nodeToAdd.next = node.next;
            node.next = nodeToAdd;
        }

        size++;

        return head;
    }

    ListNode remove(ListNode head, int positionToRemove){
        ListNode node = head;

        if(size <= positionToRemove || head == null){
            return null;
        }

        if(positionToRemove == 0){
            node = node.next;
            head = node;
        } else{
            for(int i = 1; i < positionToRemove; i++){
                node = node.next;
            }
            node.next = node.next.next;
        }

        size--;

        return head;
    }

    boolean contains(ListNode head, ListNode nodeToCheck){
        ListNode node = head;
        boolean check = false;

        if(head == null){
            return false;
        }

        do{
            if(node.val == nodeToCheck.val && node.next == nodeToCheck.next){
                check = true;
                break;
            }
            node = node.next;
        }while(node != null);

        return check;
    }
}
