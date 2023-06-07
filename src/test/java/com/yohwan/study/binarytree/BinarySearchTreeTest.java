package com.yohwan.study.binarytree;

import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

    @Test
    void binaryTree() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(10);
        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(6);
        binarySearchTree.insert(15);
        binarySearchTree.insert(13);
        binarySearchTree.insert(11);
        binarySearchTree.insert(14);
        binarySearchTree.insert(16);

        binarySearchTree.inorder();
        binarySearchTree.postorder();
        binarySearchTree.preorder();

        binarySearchTree.dfs(new Node(16));
        binarySearchTree.bfs(new Node(16));
    }

}