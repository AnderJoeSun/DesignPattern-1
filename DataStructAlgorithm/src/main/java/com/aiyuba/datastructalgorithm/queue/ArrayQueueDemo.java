package com.aiyuba.datastructalgorithm.queue;

import java.util.Queue;
import java.util.Scanner;

/**
 * Created by maoyujiao on 2019/10/23.
 */

public class ArrayQueueDemo {

    public static void main(String[] args){
        boolean loop = true;
        ArrayQueue queue = new ArrayQueue(4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("a 添加到队列");
        System.out.println("r 取出队列");
        System.out.println("p 打印队列");
        System.out.println("g 获取队列头元素");
        System.out.println("e 退出循环");
        while (loop){
            char type = scanner.next().charAt(0);
            switch (type){
                case 'a':
                    queue.addQueue(scanner.nextInt());
                    break;
                case 'r':
                    queue.removeQueue();
                    break;
                case 'p':
                    queue.printQueue();
                    break;
                case 'g':
                    System.out.printf("对头数据为：%d",queue.peek());
                    break;
                case 'e':
                    loop = false;
                    scanner.close();
                    break;
            }
        }
        System.out.println("退出程序");

    }

}
 class ArrayQueue{
    private int[] a;
    private int front; //指向头元素的前一个
    private int rear;//指向尾元素
    private int maxSize;

    public ArrayQueue(int size) {
        a = new int[size];
        front = -1;
        rear = -1;
        maxSize = size;
    }

     public boolean isFull(){
        return rear == maxSize - 1;
    }

     public boolean isEmpty(){
        return rear == front;
    }

     public void addQueue(int value){
        if(isFull()){
            throw new RuntimeException("队列已满，不能添加");
        }
        rear++;
        a[rear] = value;

    }

     public int removeQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，不能获取");
        }
        front++;
        return a[front];

    }

     public int peek(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，不能获取");
        }
        return a[front + 1];
    }

     public void printQueue(){
        if(isEmpty()){
            System.out.println("队列为空");
            return;
        }

        for (int i = front; i < rear; i++) {
            System.out.printf("a[%d] = %d\n",i+1,a[i+1]);
        }

    }
}
