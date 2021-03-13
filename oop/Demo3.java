package oop;

public class Demo3 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(2,4);
        r1.getprimeter();
    }
}
//图形类
abstract class Graph{
    public abstract double getArae();
    public abstract double getprimeter();
    public void sleep(){
        System.out.println("该睡着了！");
    }
}
//圆类
class Circle1 extends Graph{
    int r;
    public Circle1(int r){
        this.r=r;
    }
    public double getArae(){
        return Math.PI*r*r;
    }
    public double getprimeter(){
        return 2*r*Math.PI;
    }
}
//矩形类
class Rectangle extends Graph{
    int a,b;
    public Rectangle(int a,int b){
        this.a=a;
        this.b=b;
    }
    public double getArae(){
        return a*b;
    }
    public double getprimeter(){
        super.sleep();
        return 2*(a+b);
    }
    public void hard(){
        System.out.println("干得漂亮！");
        super.sleep();
    }
}



