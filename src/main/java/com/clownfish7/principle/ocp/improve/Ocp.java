package com.clownfish7.principle.ocp.improve;

/**
 * @author yzy
 * @classname Ocp
 * @description TODO
 * @create 2019-07-25 11:41
 */
public class Ocp {

    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }

}

//这是一个用于绘图的类 [使用方]
class GraphicEditor {
    //接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s) {
       s.draw();
    }
}

//Shape类，基类
abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

//新增画三角形
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println(" 绘制三角形 ");
    }
}

