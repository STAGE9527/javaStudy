package obj.overRide;

class Animal{
    protected int myid = 1;
    protected int move(int i){
        System.out.println("动物可以移动");
        System.out.println(myid);
        return i+1;
    }

    public void bark1(){
        System.out.println("bark2222");
    }
}

class Dog extends Animal{
    protected int myid = 2;
    protected int move(int i){
        super.move(myid);
        System.out.println("狗可以跑和走");
        System.out.println(myid);
        return i-1;
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}

public class OverWriteTest{
    public static void main(String args[]){
        Animal a = new Animal(); // Animal 对象
        Animal b = new Dog(); // Dog 对象

        System.out.println(a.move(2));// 执行 Animal 类的方法
        System.out.println(b.move(2));//执行 Dog 类的方法
        b.bark1(); //?????

        // 重载
        int age = 10;
        String name = "ii";
        handle(age);
        handle(name);
        handle(name,age);
        handle(age,name);
    }

    public static void handle(int age) {
        System.out.println(age);
    }

    public static void handle(String name) {
        System.out.println(name);
    }

    public static void handle(int age,String name) {
        System.out.println("the age of "+name+" is "+age);
    }

    public static void handle(String name, int age) {
        System.out.println("the age of "+name+" is "+age);
    }
}