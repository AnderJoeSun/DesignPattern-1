package com.myj.designpattern.DependenceInversion.improve;

/**
 * Created by maoyujiao on 2019/8/21.
 * 接口传递
 * 构造方法传递
 * setter传递
 * 电视功能管理类，电视 功能接口和电视接口
 */

public class DependencyPass {

    public static void main(String[] args) {
        //方式1
        OpenAndClose manager = new OpenAndClose();
        manager.open(new ChangHongTV());

        //方式2
//        OpenAndClose manager = new OpenAndClose(new ChangHongTV());
//        manager.open();
        //方式3
//        OpenAndClose manager = new OpenAndClose();
//        manager.setTV(new ChangHongTV());
//        manager.open();

    }

    interface ITV{
        public void play();
    }

    static class ChangHongTV implements ITV{

        @Override
        public void play() {
            System.out.println("长虹电视机，打开");
        }
    }


    //方式1 接口
    interface IOpenAndClose{
        public void open(ITV tv);
    }

    static class OpenAndClose implements IOpenAndClose{

        @Override
        public void open(ITV tv) {
            tv.play();
        }

    }



    //方法2 构造
//    interface IOpenAndClose {
//        public void open();
//    }
//

//    class OpenAndClose implements IOpenAndClose {
//        public ITV tv;
//
//        public OpenAndClose(ITV tv) {
//            this.tv = tv;
//        }
//
//        @Override
//        public void open() {
//            tv.play();
//        }
//    }



    //方法3 setter
//    interface IOpenAndClose{
//        public void open();
//        public void setTv(ITV tv);
//    }

//    class OpenAndClose implements IOpenAndClose{
//
//        private ITV tv;
//
//        @Override
//        public void open() {
//            tv.play();
//        }
//
//        @Override
//        public void setTv(ITV tv) {
//            this.tv = tv;
//        }
//    }


}
