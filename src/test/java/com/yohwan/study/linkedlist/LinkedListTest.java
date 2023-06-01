package com.yohwan.study.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    void linkedListAdd(){
        LinkedList linkedList = new LinkedList();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);

        ListNode headNode = linkedList.add(null, node1, 0);
        headNode = linkedList.add(headNode, node2, 1);
        headNode = linkedList.add(headNode, node3, 2);
        headNode = linkedList.add(headNode, node4, 3);
        headNode = linkedList.add(headNode, node5, 4);
        headNode = linkedList.add(headNode, node6, 5);
        headNode = linkedList.add(headNode, node7, 6);
        headNode = linkedList.add(headNode, node8, 7);

        System.out.println(linkedList.getSize());
        System.out.println(linkedList.contains(headNode, node1));
        System.out.println(linkedList.contains(headNode, node2));
        System.out.println(linkedList.contains(headNode, node3));
        System.out.println(linkedList.contains(headNode, node4));
        System.out.println(linkedList.contains(headNode, node5));
        System.out.println(linkedList.contains(headNode, node6));
        System.out.println(linkedList.contains(headNode, node7));
        System.out.println(linkedList.contains(headNode, node8));


        headNode = linkedList.remove(headNode, 7);
        headNode = linkedList.remove(headNode, 6);
        headNode = linkedList.remove(headNode, 5);
        headNode = linkedList.remove(headNode, 4);
        headNode = linkedList.remove(headNode, 3);
        headNode = linkedList.remove(headNode, 2);
        headNode = linkedList.remove(headNode, 1);

        System.out.println(linkedList.contains(headNode, node1));
        System.out.println(linkedList.contains(headNode, node2));
        System.out.println(linkedList.contains(headNode, node3));
        System.out.println(linkedList.contains(headNode, node4));
        System.out.println(linkedList.contains(headNode, node5));
        System.out.println(linkedList.contains(headNode, node6));
        System.out.println(linkedList.contains(headNode, node7));
        System.out.println(linkedList.contains(headNode, node8));
        System.out.println(linkedList.getSize());

    }
}