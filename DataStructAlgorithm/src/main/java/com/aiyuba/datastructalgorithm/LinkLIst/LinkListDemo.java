package com.aiyuba.datastructalgorithm.LinkLIst;

import java.util.Stack;

/**
 * Created by maoyujiao on 2019/10/28.
 */

public class LinkListDemo {

    public static void main(String[] args){
        LinkList linkList = new LinkList();
//        linkList.addNode(new LinkNode(5,"女儿"));
//        linkList.addNode(new LinkNode(3,"爸爸"));
//        linkList.addNode(new LinkNode(1,"奶奶"));
//        linkList.addNode(new LinkNode(1,"奶奶"));

        linkList.addOrderList(new LinkNode(8,"女儿"));
        linkList.addOrderList(new LinkNode(5,"女儿"));
        linkList.addOrderList(new LinkNode(3,"爸爸"));
        linkList.addOrderList(new LinkNode(1,"奶奶"));
//        linkList.printList();
//        linkList.reverseLinkList();
//        linkList.printList();
//        System.out.println(linkList.getLastKNode(2).toString());
//        linkList.reversePrintList();
        LinkList linkList1 = new LinkList();
        linkList1.addOrderList(new LinkNode(9,"女儿"));
        linkList1.addOrderList(new LinkNode(4,"女儿"));
        linkList1.addOrderList(new LinkNode(2,"爸爸"));
//        linkList1.printList(linkList1.headNode);
        linkList.printList(linkList.mergeOrderLinklist(linkList1.headNode,linkList.headNode));

    }

}
 class LinkList{
    public LinkNode headNode = new LinkNode(0,"头节点");

    public void addOrderList(LinkNode node){
        LinkNode temp = headNode;
        boolean flag = false;
        while (true){
            if(temp.next == null){
                break;
            }

            if(temp.next.num > node.num){
                break;
            }else if(temp.next.num == node.num){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println("节点已经存在，不能添加");
        }else {
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void addNode(LinkNode node){
        LinkNode temp = headNode;
        while (true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void printList(LinkNode linkNode){
        if(linkNode.next == null){
            System.out.println("链表为空");
        }
        LinkNode temp = linkNode.next;
        while (true){
            if(temp == null){
                break;
            }
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }

    public void reverseLinkList(){
        //new一个链头节点，遍历原链表得到节点后数据前插. 保存当前节点的下一个节点
        LinkNode node = new LinkNode(0,"");
        LinkNode temp = headNode.next;
        LinkNode next ;
        if(headNode == null || headNode.next == null){
            return ;
        }
        while (true){
            if(temp == null){
                break;
            }
            next = temp.next;
            temp.next = node.next;
            node.next = temp;
            temp = next;
        }
        headNode.next = node.next;
    }

    public LinkNode getLastKNode(int k){

        int length = 0;
        LinkNode temp = headNode.next;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        if(length == 0 || length < k){
            return null;
        }
        System.out.println("链表长度"+length);
        temp = headNode.next;
        for (int i = 0; i <length - k ; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void reversePrintList(){
        //逆序打印是不可逆的，不太合适
        //方式2：利用栈这种结构
        if(headNode.next == null){
            return;
        }
        Stack<LinkNode> stack = new Stack<>();
        LinkNode temp = headNode.next;
        while (temp != null){
            stack.push(temp);
            temp = temp.next;
        }

        while (!stack.empty()){
            System.out.println(stack.pop());
        }

    }

     /**
      * 合并有序链表
      * 1.new一个头节点，并有一个当前节点
      * 2。遍历比较2个，找最小的一个
      * 3。将剩余的某个链表整个复制过去
      */
     public LinkNode mergeOrderLinklist(LinkNode node1,LinkNode node2){
         LinkNode head = new LinkNode(0,"");
         LinkNode curNode = head;
         LinkNode temp1 = node1.next;
         LinkNode temp2 = node2.next;

         while (temp1 != null && temp2 != null){
             if(temp1.num > temp2.num){
                 curNode.next = temp2;
                 temp2 = temp2.next;
             } else {
                 curNode.next = temp1;
                 temp1 = temp1.next;
             }
             curNode = curNode.next;
         }
         if(temp1 != null){
             curNode.next = temp1;
         }
         if(temp2 != null){
             curNode.next = temp2;
         }
         return head;
     }

}


class LinkNode{
    public int num;
    public String name;
    public LinkNode next;

    public LinkNode(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "LinkNode{" +
                "num=" + num +
                ", name='" + name+"}" ;
    }
}