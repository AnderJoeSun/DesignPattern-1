package com.aiyuba.datastructalgorithm.SparseArray;

/**
 * Created by maoyujiao on 2019/10/23.
 */

import java.io.*;

public class SparseArrToMapdata {

    public static void main(String[] args) throws IOException {
        /***
         * 一、稀疏数组转为文件map.data 为了验证正确性，请用记事本打开此文件
         */
        //稀疏数组的给定，那简单的：1代表黑子，2代表蓝子
        int sparseArr[][] = new int [3][3];
        sparseArr[0][0] =11;
        sparseArr[0][1] =11;
        sparseArr[0][2] =2;
        sparseArr[1][0] =4;
        sparseArr[1][1] =5;
        sparseArr[1][2] =1;
        sparseArr[2][0] =7;
        sparseArr[2][1] =8;
        sparseArr[2][2] =0;
        //1.创建源
        File dest = new File("d:\\map.data");
        //2.选择流:之所以选择字符流进行操作，主要由于其比字节流分割字符相比有分割方便的方法
        Writer os = null;
        os = new FileWriter(dest);
        //3.进行数据的拷贝,其中\t，即table符号，作为数字的分隔符（主要是数字的位数在此例中是不确定的）
        for (int i = 0; i < sparseArr.length; i++) {
            for (int j = 0; j < 3; j++) {
                os.write(sparseArr[i][j]+"\t");
            }
            os.write("\r\n");
        }
        //4.释放资源
        os.close();

        /**
         * 二、将本地文件map.data转换为稀疏数组
         */

        //1.创建源
        File src = new File("d:\\map.data");
        //2.选择流
        BufferedReader in = new BufferedReader(new FileReader(src));
        //3.1进行数据的搬移，但是数组首要考虑的事情是数组要多大？
        int row =0;//用于创建要创建的二维稀疏数组的大小确定
        String line; //一行数据
        //逐行读取，并将每个数组放入到数组中
        while ((line = in.readLine()) != null) {
            row++;
        }
        int sparseArr2[][] = new int [row][3];
        //3.2文本数据转移到稀疏数组中
        int rowtmp = 0;
        //由于读取完毕整个文本文档，所以不妨”重启“流
        in.close();
        in = new BufferedReader(new FileReader(src));
        while ((line = in.readLine()) != null) {
            String[] temp = line.split("\t");
            for (int j = 0; j < temp.length; j++) {
                sparseArr2[rowtmp][j]=Integer.parseInt(temp[j]);
            }
            rowtmp++;
        }
        //4.关闭流
        in.close();
        //验证文件读取是否正确
        for(int[]temp1:sparseArr2) {
            for (int temp2 : temp1) {
                System.out.printf("%d\t", temp2);
            }
            System.out.println();
        }
    }
}



