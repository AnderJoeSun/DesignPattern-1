package com.myj.designpattern.DesignPattern.adapter.AdapterExample;

import java.util.ArrayList;

/**
 * Created by maoyujiao on 2019/8/26.
 *
 * 适配器模式在SpringMVC框架应用的源码剖析
 1) SpringMvc中的HandlerAdapter,就使用了适配器模式
 2) SpringMVC处理请求的流程回顾
 3) 使用HandlerAdapter 的原因分析:
 可以看到处理器的类型不同，有多重实现方式，那么调用方式就不是确定的，
 如果需要直接调用 Controller方法，需要调用的时候就得不断是使用if else来进行判断是哪一种子类然后执行。
 那么 如果后面要扩展Controller，就得修改原来的代码，这样违背了OCP原则。

 • Spring定义了一个适配接口，使得每一种Controller有一种对应的适配器实现类
 • 适配器代替controller执行相应的方法
 • 扩展Controller 时，只需要增加一个适配器类就完成了SpringMVC的扩展了,
 • 这就是设计模式的力量
 */

public class DispatcherServlet {
    ArrayList<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatcherServlet() {
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new AnnotationHandlerAdapter());
    }

    public void doDispatch(HandlerAdapter adapter){


    }

    public HandlerAdapter getHandler(Controller controller){
        for(HandlerAdapter adapter : handlerAdapters){
            if (adapter.support(controller)){
                return adapter;
            }
        }
        return null;
    }

    public void doDispatch(Controller controller){
        HandlerAdapter adapter = getHandler(controller);
        adapter.handler(controller);
    }

}
