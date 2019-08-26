package com.myj.designpattern.DesignPattern.adapter.AdapterExample;

/**
 * Created by maoyujiao on 2019/8/26.
 */

public interface Controller {

}

class HttpController implements Controller{
    public void doHttpHandler(){
        System.out.println("http...");
    }
}

class SimpleController implements Controller{
    public void doSimpleHandler(){
        System.out.println("simple...");
    }
}

class AnnotationController implements Controller{
    public void doAnnotationHandler(){
        System.out.println("annotation...");
    }
}
