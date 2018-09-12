package com.example.tree;

public class Tree {

        Node root;

        public boolean insert(int value) {
            return insert(root, value);
        }

        public boolean insert(Node n, int value) {
            return false;
        }
//        public boolean insert(Node n, int toInsert) {
//            if(n.getValue() < toInsert) {
//
//            } else {
//
//            }
//        }

}
