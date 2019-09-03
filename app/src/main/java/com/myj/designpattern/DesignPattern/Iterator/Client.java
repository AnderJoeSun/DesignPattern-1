package com.myj.designpattern.DesignPattern.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maoyujiao on 2019/9/2.
 */

public class Client {
    public static void main(String[] args){
        List<College> colleges = new ArrayList<>();
        colleges.add(new ComputerCollege());
        colleges.add(new InfoCollege());
        OutputImpl output = new OutputImpl(colleges);
        output.printCollege();
    }
}
