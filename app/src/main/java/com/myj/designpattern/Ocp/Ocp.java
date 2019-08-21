package com.myj.designpattern.Ocp;

/**
 * Created by maoyujiao on 2019/8/21.
 */

public class Ocp {
    public static void main(String[] args) {
        GraphEditor editor = new GraphEditor();
        editor.drawShape(new Circle());
        editor.drawShape(new Rectangle());

    }

    /**
     *新增绘制类型时修改的代码太多
     * 改进：把shape类做成抽象类，并提供一个抽象方法，让子类实现即可
     * 这样有新的shape时，只需要让图形类 extends Shape，并实现draw方法，使用方不需要修改
     */
    static class GraphEditor {
        public void drawShape(Shape s) {
            if (s.m_type == 1) {
                drawCircle(s);
            } else if (s.m_type == 2) {
                drawRectangle(s);
            }
        }

        public void drawCircle(Shape s) {
            System.out.println("绘制圆形");

        }

        public void drawRectangle(Shape s) {
            System.out.println("绘制矩形");
        }

    }

    static class Shape {
        int m_type;
    }

    static class Circle extends Shape {
        public Circle() {
            super.m_type = 1;
        }
    }

    static class Rectangle extends Shape {
        public Rectangle() {
            super.m_type = 2;
        }
    }


}
