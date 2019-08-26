package com.myj.designpattern.DesignPattern.adapter.AdapterExample;

/**
 * Created by maoyujiao on 2019/8/26.
 */

public class client {
    public static void main(String[] args){
        DispatcherServlet servlet = new DispatcherServlet();
//        Controller controller = new HttpController();
        Controller controller = new SimpleController();
        servlet.doDispatch(controller);
    }
}
