package com.myj.designpattern.Demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maoyujiao on 2019/8/21.
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

    }

    //分析，直接朋友有那些：Employee，CollegeManager
//    不是直接朋友 CollegeEmployee，而是一个陌生类，违反类迪米特法则
    // 已局部变量的方式出现，需改进
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

            List<CollegeEmployee> list1 = sub.getAllEmployee();
            for(CollegeEmployee e:list1){
                System.out.println("学院员工id"+e.getId());
            }

            List<Employee> list2 = this.getAllEmployee();
            for(Employee e:list2){
                System.out.println("学校员工id"+e.getId());
            }
        }

    }

}
