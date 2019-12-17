package com.aiyuba.datastructalgorithm.recursive;

/**
 * Created by maoyujiao on 2019/10/31.
 *
 * for循环是执行一样的程序，递归也是执行一样的程序，所以两者可以互转
 */

public class RecursiveDemo {
    public static void main(String[] args){
        test(10);
        System.out.println("阶乘数据："+jiecheng(4));

    }

    private static void test(int n){
        if(n > 0){
            test(n-1);
        }
        System.out.println("数据n为："+n);
    }

    private static int jiecheng(int n){
//        int result = 1;
//        if(n > 1){
//            result = jiecheng(n-1);
//        }
//        return n * result;
        if(n == 1){
            return 1;
        } else {
            return n * jiecheng(n-1);
        }
    }
}
