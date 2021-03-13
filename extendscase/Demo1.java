package extendscase;

public class Demo1 {
    public static void main(String[] args){
        Student stu=new Student("莉莉");
        stu.study();
        stu.sleep();
    }
}
//父类
class Person {
    String name;
    int age;
    public  Person(){
    }

     Person(String name){
        this.name=name;
    }
    public void sleep(){
        System.out.println(name+"睡着了！");
    }
}
//子类
 class Student extends Person{
    int score;
    public Student(){
        super();
    }
    public Student(String name){
        this();
        this.name=name;
    }
    public void study(){
        System.out.println(name+"在学习！");
        System.out.println(name+"学完了！");
    }
 }


