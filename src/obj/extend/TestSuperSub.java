package obj.extend;

public class TestSuperSub {
    public static void main(String args[]) {
        System.out.println("------SubClass 类继承------");
        SubClass sc1 = new SubClass();
        SubClass sc2 = new SubClass(100);
        SubClass sc22 = new SubClass(1, 2);
        System.out.println("------SubClass2 类继承------");
        SubClass2 sc3 = new SubClass2();
        SubClass2 sc4 = new SubClass2(200);
    }
}

// 构造器
//子类是不继承父类的构造器（构造方法或者构造函数）的，它只是调用（隐式或显式）。
// 如果父类的构造器带有参数，则必须在子类的构造器中显式地通过 super 关键字调用父类的构造器并配以适当的参数列表。
//如果父类构造器没有参数，则在子类的构造器中不需要使用 super 关键字调用父类构造器，系统会自动调用父类的无参构造器。
class SuperClass {
    private int n;

    SuperClass() {
        System.out.println("SuperClass()");
    }

    SuperClass(int n) {
        System.out.println("SuperClass(int n)");
        this.n = n;
    }

    //1、final 修饰类中的属性或者变量
    //无论属性是基本类型还是引用类型，final 所起的作用都是变量里面存放的"值"不能变。
    //final 修饰属性，声明变量时可以不赋值，而且一旦赋值就不能被修改了。对 final 属性可以在三个地方赋值：声明时、初始化块中、构造方法中，总之一定要赋值
    //2、final修饰类中的方法
    //作用：可以被继承，但继承后不能被重写。
    //3、final修饰类
    //作用：类不可以被继承。
    final public static void TestFun() {
        System.out.println("test func");
    }

}

// SubClass 类继承
class SubClass extends SuperClass {
    private int n;

    SubClass() { // 自动调用父类的无参数构造器
        // super(); //系统会自动隐式先调用父类的无参构造函数 super(); //必须是第一行，否则不能编译
        System.out.println("SubClass");
    }

    // 'TestFun()' cannot override 'TestFun()' in 'obj.extend.SuperClass'; overridden method is final
//    public static void TestFun(){
//        System.out.println("test func");
//    }

    public SubClass(int n) {
        super(300);  // 调用父类中带有参数的构造器  //必须是第一行，否则不能编译
        System.out.println("SubClass(int n):" + n);
        this.n = n;
        super.TestFun();
    }

    public SubClass(int a, int b) {
        super(a); //如果子类构造方法第一行显式调用了父类构造方法，系统就不再调用无参的super()了。
        System.out.println("SubClass--有参构造方法--" + b);
    }
}

// SubClass2 类继承
class SubClass2 extends SuperClass {
    private int n;

    SubClass2() {
        super(300);  // 调用父类中带有参数的构造器
        System.out.println("SubClass2");
    }

    public SubClass2(int n) { // 自动调用父类的无参数构造器
        System.out.println("SubClass2(int n):" + n);
        this.n = n;
    }
}