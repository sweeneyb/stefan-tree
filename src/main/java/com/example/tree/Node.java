package com.example.tree;

public class Node {

    public int value = 0;
    public Node leftChild;
    public Node rightChild;

    public Node(int value, Node leftChild, Node rightChild) {
        this.value = value;
        this.rightChild = rightChild;
        this.leftChild = leftChild;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public int getValue() {
        return value;
    }

    public void addChildLeft(int value) {

    }

    public void addChildRight(int value) {

    }

    public boolean addChild ( int value)
    {
        if(this.leftChild!=null && this.rightChild!= null) {
            return false;
        }
        if ( this.value < value) {
            if(this.rightChild != null) {
                return false;
            }
            this.rightChild = new Node(value, null, null);
        } else {
            if(this.leftChild != null) {
                return false;
            }
            leftChild = new Node(value, null, null);
        }
        return true;

    }
}

