package base.function;

/**
 * 修饰符 返回值类型 方法名(参数类型 参数名){
 * ...
 * 方法体
 * ...
 * return 返回值;
 * }
 * 方法包含一个方法头和一个方法体。下面是一个方法的所有部分：
 * <p>
 * 修饰符：修饰符，这是可选的，告诉编译器如何调用该方法。定义了该方法的访问类型。
 * 返回值类型 ：方法可能会返回值。returnValueType 是方法返回值的数据类型。有些方法执行所需的操作，但没有返回值。在这种情况下，returnValueType 是关键字void。
 * 方法名：是方法的实际名称。方法名和参数表共同构成方法签名。
 * 参数类型：参数像是一个占位符。当方法被调用时，传递值给参数。这个值被称为实参或变量。参数列表是指方法的参数类型、顺序和参数的个数。参数是可选的，方法可以不包含任何参数。
 * 方法体：方法体包含具体的语句，定义该方法的功能。
 * 如：
 * public static int age(int birthday){...}
 * 参数可以有多个：
 * static float interest(float principal, int year){...}
 * <p>
 * 变量作用域
 * 变量的范围是程序中该变量可以被引用的部分。
 * 方法内定义的变量被称为局部变量。
 * 局部变量的作用范围从声明开始，直到包含它的块结束。
 * 局部变量必须声明才可以使用。
 * 方法的参数范围涵盖整个方法。参数实际上是一个局部变量。
 */
public class FunTest {
    public int a;

    public static void main(String[] args) {
        int max = max(1, 2);
        System.out.println(max);
        int larger = max1(1, 2);
        System.out.println(larger);
        System.out.println(max1(21, 2));

        printGrade(78.5);

        nPrintln("sss", 10);

        swap(1, 10);

        double dmax = max(1.8, 2.1);
        System.out.println(dmax);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }

        FunTest ft = new FunTest();

        FunTest ft2 = new FunTest(100);

        // 调用可变参数的方法
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
        printMax(1,2,3);


        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);

        c2 = c3 = null;
        System.gc(); //调用Java垃圾收集器

        try{
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");

    }

    //在方法声明中，在指定参数类型后加一个省略号(...) 。
    //typeName... parameterName
    //一个方法中只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在它之前声明。
    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }

    //构造方法没有返回值
    FunTest(int i) {
        System.out.println("pagram: " + i);
    }

    FunTest() {
        a = 10;
        System.out.println("构造函数: " + a);
    }

    public static void swap(int a, int b) {
        System.out.println("进入 swap 方法");
        System.out.println("交换前 a 的值为：" + a + "，b 的值：" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后 a 的值为 " + a
                + "，b 的值：" + b);

    }

    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        } else if (score >= 80.0) {
            System.out.println('B');
        } else if (score >= 70.0) {
            System.out.println('C');
        } else if (score >= 60.0) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }

    //方法的重载  创建另一个有相同名字但参数不同的方法
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }

    public static int max1(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}

// Java 允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做 finalize( )，它用来清除回收对象。
//例如，你可以使用 finalize() 来确保一个对象打开的文件被关闭了。
//在 finalize() 方法里，你必须指定在对象销毁时候要执行的操作。
//关键字 protected 是一个限定符，它确保 finalize() 方法不会被该类以外的代码调用。
//当然，Java 的内存回收可以由 JVM 来自动完成。如果你手动使用，则可以使用上面的方法。
class Cake extends Object {
    private int id;
    public Cake(int id) {
        this.id = id;
        System.out.println("Cake Object " + id + "is created");
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        System.out.println("Cake Object " + id + "is disposed");
    }
}