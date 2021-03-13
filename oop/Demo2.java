package oop;

import java.sql.SQLOutput;

public class Demo2 {
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.name="旺财";
        dog.eat();

        Shepp shepp=new Shepp();
        shepp.name="喜洋洋";
        shepp.eat();
    }
}
//动物类
class Animale{
    String name;
    public void eat(){
        System.out.println("吃");
    }
}
//狗类
class Dog extends Animale{
    public void eat(){
        System.out.print("用小舌头");
        super.eat();
    }
}
//羊类
class Shepp extends Animale{
    public void eat(){
        System.out.print("用牙齿");
        super.eat();
    }
}