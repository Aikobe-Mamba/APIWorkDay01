package oop;

public class Demo1 {
    public static void main(String[] args) {
        int r;
        Circle[] c1=new Circle[10];
        for(int i=0;i<c1.length;i++){
            r=(int)(Math.random()*16 +5);
            c1[i]=new Circle(r);
            System.out.println(i+1+"个圆的面积为："+c1[i].getArea());
        }
    }
}
class Circle{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public double getArea( ) {
        return Math.PI*radius*radius;
    }
}


