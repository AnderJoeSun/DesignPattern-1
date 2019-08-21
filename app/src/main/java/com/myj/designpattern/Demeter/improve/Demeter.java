package com.myj.designpattern.Demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maoyujiao on 2019/8/21.
 *
 * 基本介绍
 1) 一个对象应该对其他对象保持最少的了解
 2) 类与类关系越密切，耦合度越大
 3) 迪米特法则(Demeter Principle)又叫"最少知道原则"，即一个类对自己依赖的类知道的
 越少越好。也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内
 部。对外除了提供的public 方法，不对外泄露任何信息
 4) 迪米特法则还有个更简单的定义:只与直接的朋友通信
 5) 直接的朋友:每个对象都会与其他对象有耦合关系，
 只要两个对象之间有耦合关系， 我们就说这两个对象之间是朋友关系。
 耦合的方式很多，依赖，关联，组合，聚合 等。其中，我们称出现成员变量，
 方法参数，方法返回值中的类为直接的朋友，而 出现在局部变量中的类不是直接的朋友。
 也就是说，""陌生的类最好不要以局部变量 的形式出现在类的内部""。

 迪米特法则注意事项和细节
 1) 迪米特法则的核心是降低类之间的耦合
 2) 但是注意:由于每个类都避免了依赖，因此迪米特法则只是要求降低
 类间(对象间)耦合关系， 并不是要求完全没有依赖关系
 */

public class Demeter {
    public  static void main(String[] args){
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());

    }

    static class Employee{
        String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    static class CollegeEmployee{
        String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    static class CollegeManager{
        public List<CollegeEmployee> getAllEmployee() {
            List<CollegeEmployee> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                CollegeEmployee employee = new CollegeEmployee();
                employee.setId("学院员工id"+i);
                list.add(employee);
            }
            return list;
        }

        public void printEmployee(){
            List<CollegeEmployee> list1 = this.getAllEmployee();
            for(CollegeEmployee e:list1){
                System.out.println("学院员工id"+e.getId());
            }
        }

    }


    static class SchoolManager{

        public List<Employee> getAllEmployee() {
            List<Employee> list = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                Employee employee = new Employee();
                employee.setId("学院员工id"+i);
                list.add(employee);
            }
            return list;
        }

        void printAllEmployee(CollegeManager sub){

            //改进分析：讲输出学院员工的方法封装到 CollegeManager
           sub.printEmployee();

            List<Employee> list2 = this.getAllEmployee();
            for(Employee e:list2){
                System.out.println("学校员工id"+e.getId());
            }
        }

    }

}
