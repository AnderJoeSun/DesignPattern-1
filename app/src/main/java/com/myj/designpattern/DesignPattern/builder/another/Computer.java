package com.myj.designpattern.DesignPattern.builder.another;

/**
 * Created by maoyujiao on 2019/9/17.
 */

public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainborad;

    public Computer() {
        throw new RuntimeException("cannot init");
    }

    private Computer(Builder builder){
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        mainborad = builder.mainborad;
    }

    public static class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainborad;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder setMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder setMainborad(String mainborad) {
            this.mainborad = mainborad;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }


}
