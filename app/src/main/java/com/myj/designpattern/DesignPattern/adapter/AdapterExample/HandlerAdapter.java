package com.myj.designpattern.DesignPattern.adapter.AdapterExample;

/**
 * Created by maoyujiao on 2019/8/26.
 */

public interface HandlerAdapter {
    public boolean support(Object handler);
    public void handler(Object handler);
}

 class SimpleHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean support(Object handler) {
        return (handler instanceof SimpleController);

    }

    @Override
    public void handler(Object handler) {
        ((SimpleController)handler).doSimpleHandler();

    }
}

class HttpHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean support(Object handler) {
        return (handler instanceof HttpController);

    }

    @Override
    public void handler(Object handler) {
        ((HttpController)handler).doHttpHandler();

    }
}

class AnnotationHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean support(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handler(Object handler) {
        ((AnnotationController)handler).doAnnotationHandler();
    }
}



