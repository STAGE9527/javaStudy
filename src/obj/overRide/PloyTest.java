package obj.overRide;

import obj.interfacetest.C;

class Father {
    public int a;
    Father(){
        System.out.println("AAAA");
    }

    Father(int ai) {
        a = ai;
    }
    public void func1(){
        func2();
    }

    public void func2(){
        System.out.println("Father func2");
    }
}

class Child extends Father{
    Child() {
        a = 100;
    }
    public void func1(int a){
        System.out.println("Child1: " +a);
    }

    public void func2(){
        System.out.println("Child func2");
    }
}

public class PloyTest {
    public static void main(String[] args){
        //父类引用   指向     子类对象
        Father child = new Child();
        System.out.println(child.a);
        child.func1(); // Child func2
        child.func2(); // Child func2

        Child child2 = new Child();
        child2.func1(2); // Child1: 2
        child2.func2(); // Child func2

        Father f = new Father();
        f.func1();  // Father func2
        f.func2();  // Father func2
    }
}
