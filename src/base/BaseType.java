package base;

/**
 * Java 的两大数据类型:
 * <p>
 * 内置数据类型
 * 引用数据类型
 * <p>
 * 内置数据类型:
 * 1. Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。
 * 引用类型:
 * 在Java中，引用类型的变量非常类似于C/C++的指针。
 * 引用类型指向一个对象，指向对象的变量是引用变量。
 * 这些变量在声明时被指定为一个特定的类型，比如 Employee、Puppy 等。变量一旦声明后，类型就不能被改变了。
 * *** 对象、数组都是引用数据类型 ***
 * 所有引用类型的默认值都是null。
 * 一个引用变量可以用来引用任何与之兼容的类型。
 * 例子：Site site = new Site("Runoob")。
 */

public class BaseType {
    public static void main(String[] args) {
        // byte 数据类型是8位、有符号的，以二进制补码表示的整数；
        //最小值是 -128（-2^7）；
        //最大值是 127（2^7-1）；
        //默认值是 0；
        //byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；
        byte a = 100;
        byte b = -50;
        System.out.println(a);
        System.out.println(b);

        //short 数据类型是 16 位、有符号的以二进制补码表示的整数
        //最小值是 -32768（-2^15）；
        //最大值是 32767（2^15 - 1）；
        //Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
        //默认值是 0；
        short s = 1000;
        short r = -20000;

        //int 数据类型是32位、有符号的以二进制补码表示的整数；
        //最小值是 -2,147,483,648（-2^31）；
        //最大值是 2,147,483,647（2^31 - 1）；
        //特别注意********  (一般地整型变量默认为 int 类型)
        //默认值是 0 ；
        int ia = 100000;
        int ib = -200000;

        //long 数据类型是 64 位、有符号的以二进制补码表示的整数；
        //最小值是 -9,223,372,036,854,775,808（-2^63）；
        //最大值是 9,223,372,036,854,775,807（2^63 -1）；
        //这种类型主要使用在需要比较大整数的系统上；
        //默认值是 0L；
        //"L"理论上不分大小写，但是若写成"l"容易与数字"1"混淆，不容易分辩。所以最好大写。
        long la = 100000L;
        long lb = -200000L;

        //float 数据类型是单精度、32位、符合IEEE 754标准的浮点数；
        //float 在储存大型浮点数组的时候可节省内存空间；
        //默认值是 0.0f；
        //浮点数不能用来表示精确的值，如货币；
        float f1 = 234.5f;

        //double 数据类型是双精度、64 位、符合 IEEE 754 标准的浮点数；
        //浮点数的默认类型为 double 类型；
        //double类型同样不能表示精确的值，如货币；
        //默认值是 0.0d；
        double d1 = 7D;
        double d2 = 7.;
        double d3 = 8.0;
        double d4 = 8.D;
        double d5 = 12.9867;
        // 7 是一个 int 字面量，而 7D，7. 和 8.0 是 double 字面量。

        // boolean数据类型表示一位的信息；
        //只有两个取值：true 和 false；
        //这种类型只作为一种标志来记录 true/false 情况；
        //默认值是 false；
        boolean one = true;

        //char 类型是一个单一的 16 位 Unicode 字符；
        //最小值是 \u0000（十进制等效值为 0）；
        //最大值是 \uffff（即为 65535）；
        //char 数据类型可以储存任何字符；
        // 默认值是 'u0000' 空格，不等于""空字符
        char letter = 'A';

        // byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE=" + (int) Character.MAX_VALUE);

        DefaultValue();

        // Java 常量
        //常量在程序运行时是不能被修改的。
        //在 Java 中使用 final 关键字来修饰常量，声明方式和变量类似：
        final double PI = 3.1415927;
        System.out.println("常量: " + PI);

        //byte、int、long、和short都可以用十进制、16进制以及8进制的方式来表示。
        // 当使用字面量的时候，前缀 0 表示 8 进制，而前缀 0x 代表 16 进制, 例如：

        int decimal = 100; // 十进制
        int octal = 0144;   // 8进制
        int hexa = 0x64;   // 16进制

        // Java的字符串常量也是包含在两个引号之间的字符序列。
        System.out.println("Hello World" +
                "two\nlines" +
                "\"This is in quotes\"");

        // 字符串常量和字符常量都可以包含任何Unicode字符。例如：
        char ca = '\u0001';
        String csa = "\u0001";

        System.out.println("字符： " + ca);
        System.out.println();
        System.out.println("字符串： " + csa);

        short sa = 1;
        short sb = 2;
        //那么 a+b 是什么类型？

        //答：在java的世界里，如果比int类型小的类型做运算，
        // java在编译的时候就会将它们统一强转成int类型。当是比int类型大的类型做运算，就会自动转换成它们中最大类型那个。

        //包装类过渡类型转换
        float f11 = 100.00f;
        Float F1 = new Float(f11);
        double dd1 = F1.doubleValue();//F1.doubleValue()为Float类的返回double值型的方法
        System.out.println(dd1);

        // 字符拼接 任何字符类型与字符串相加，结果都是拼接。
        String ss = null;
        ss += "hello";
        System.out.println(ss);  // 输出 nullhello
        String str = null;
        str = (new StringBuilder(String.valueOf(str))).append("hello").toString();
        System.out.println(str);

        Integer aclass = 1;
        Integer ac = Integer.valueOf(1);

        //自动类型转换
        //整型、实型（常量）、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。
        //转换从低级到高级。
        //低  ------------------------------------>  高
        //byte,short,char—> int —> long—> float —> double

        CovertType();
        AutoCovertType();
        QiangZhiCovertType();
    }

    public static void CovertType() {
        //数据类型转换必须满足如下规则：
        //1. 不能对boolean类型进行类型转换。
        //2. 不能把对象类型转换成不相关类的对象。
        //3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
        //4. 转换过程中可能导致溢出或损失精度，例如：
        int i = 128;
        byte b = (byte) i;
        System.out.println("数据类型转换:");
        System.out.println(i);
        System.out.println(b);
        //因为 byte 类型是 8 位，最大值为127，所以当 int 强制转换为 byte 类型时，值 128 时候就会导致溢出。
        //5. 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入，例如：
        int fa = (int) 23.7;
        int fb = (int) -45.89f;
        System.out.println(fa);
        System.out.println(fb);

    }

    //自动类型转换
    //必须满足转换前的数据类型的位数要低于转换后的数据类型，
    // 例如: short数据类型的位数为16位，就可以自动转换位数为32的int类型，
    // 同样float数据类型的位数为32，可以自动转换为64位的double类型。
    public static void AutoCovertType() {
        char c1 = 'a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于" + i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2 + 1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于" + i2);
        //char自动类型转换为int后的值等于97
        //char类型和int计算后的值等于66

        // 解析：c1 的值为字符 a ,查 ASCII 码表可知对应的 int 类型值为 97， A 对应值为 65，所以 i2=65+1=66。
    }

    // 强制类型转换
    //1. 条件是转换的数据类型必须是兼容的。
    //
    //2. 格式：(type)value type是要强制类型转换后的数据类型
    public static void QiangZhiCovertType() {
        int i1 = 123;
        byte b = (byte) i1;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于" + b);
        //int强制类型转换为byte后的值等于123
    }

    //隐含强制类型转换
    //1、 整数的默认类型是 int。
    //2. 小数默认是 double 类型浮点型，在定义 float 类型时必须在数字后面跟上 F 或者 f。


    static boolean bool;
    static byte by;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str;

    public static void DefaultValue() {
        System.out.println("Bool :" + bool);
        System.out.println("Byte :" + by);
        System.out.println("Character:" + ch);
        System.out.println("Double :" + d);
        System.out.println("Float :" + f);
        System.out.println("Integer :" + i);
        System.out.println("Long :" + l);
        System.out.println("Short :" + sh);
        System.out.println("String :" + str);
    }
}
