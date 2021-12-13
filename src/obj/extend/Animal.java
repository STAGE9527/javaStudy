package obj.extend;
/**
 * 类的继承格式
 * class 父类 {
 * }
 *
 * class 子类 extends 父类 {
 * }
 * 继承的特性
 * 子类拥有父类非 private 的属性、方法。
 *
 * 子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
 *
 * 子类可以用自己的方式实现父类的方法。
 *
 * Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如 B 类继承 A 类，C 类继承 B 类，所以按照关系就是 B 类是 C 类的父类，A 类是 B 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。
 *
 * 提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）。
 * */

public class Animal {
    private String name;
    private int id;
    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是"         + id + "号" + name + ".");
    }
}

//super 与 this 关键字
//super关键字：我们可以通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。
//
//this关键字：指向自己的引用。
class Penguin extends Animal {
    public Penguin(String myName, int myid) {
        super(myName, myid);
    }
}

class Mouse extends Animal {
    public Mouse(String myName, int myid) {
        super(myName, myid);
    }
}

class AnimalTest {
    void eat() {
        System.out.println("animal : eat");
    }
}

class PenguinTest extends AnimalTest {
    void eat(){
        System.out.println("eat ");
    }
    void eatTest() {
        this.eat();   // this 调用自己的方法
        super.eat();  // super 调用父类方法
    }
}



