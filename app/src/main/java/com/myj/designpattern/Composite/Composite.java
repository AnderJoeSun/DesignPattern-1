package com.myj.designpattern.Composite;

/**
 * Created by maoyujiao on 2019/8/21.
 * 合成复用原则
 * 基本介绍
 原则是尽量使用合成/聚合的方式，而不是使用继承


 * B用A类里的2个方法：1如果是继承，会让B和A的耦合性增强，（is - a）2.依赖，将A
 * 传进来(has - a） 3.B中的新增属性A，有一个set方法（聚合） 4.定义属性A时直接new A（组合）
 *
 * 设计原则核心思想:松耦合
 1) 找出应用中可能需要变化之处，把它们独立出来，
 不要和那些不需要变化的代 码混在一起。
 2) 针对接口编程，而不是针对实现编程。
 3) 为了交互对象之间的松耦合设计而努力
 */

public class Composite {
}
