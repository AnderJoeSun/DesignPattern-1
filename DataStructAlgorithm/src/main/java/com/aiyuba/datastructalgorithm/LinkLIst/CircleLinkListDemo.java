package com.aiyuba.datastructalgorithm.LinkLIst;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maoyujiao on 2019/10/29.
 */

public class CircleLinkListDemo {

    public static void main(String[] args){
        CircleLinkList linkList = new CircleLinkList();
        linkList.addNode(new Node(1,"1"));
        linkList.addNode(new Node(2,"2"));
        linkList.addNode(new Node(3,"3"));
        linkList.addNode(new Node(4,"4"));
        linkList.addNode(new Node(5,"5"));
        linkList.addNode(new Node(6,"6"));
        linkList.addNode(new Node(7,"7"));
        linkList.addNode(new Node(8,"8"));
        linkList.addNode(new Node(9,"9"));
        linkList.addNode(new Node(10,"10"));

    }

}

/**
 * 无头节点
 */
class CircleLinkList {
    private Node head;

    public void addNode(Node node) {
        head.next = node;
        node.next = head;
    }

    public void getLength(){

    }

    public void getKNode(int start,int k){
        int count = 0;
        Node curNode = head;
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < start; i++) {
            curNode = curNode.next;
        }


        while (curNode.next != null){
            if(count == k){
                list.add(curNode);
                curNode = curNode.next;
                count = 0;
                break;
            }
            curNode = curNode.next;
            count++;

        }
    }
}

class Node {
    public int no;
    public String name;
    public Node next;

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
