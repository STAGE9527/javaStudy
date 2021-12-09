package base.numath;

import java.util.Random;

public class NumberMath {
    public static void main(String[] args) {
        Integer x = 5;
        x = x + 10;
        int a = x.shortValue();
        System.out.println(x);
        System.out.println(a);
        doMath();
        parse();
//        double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };
//        for (double num : nums) {
//            test(num);
//        }
    }

    public static void doMath() {
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI / 2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI / 3));
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI / 2));
        System.out.println(Math.PI);
    }

    private static void test(double num) {
        System.out.println("Math.floor(" + num + ")=" + Math.floor(num));  // 向下取整
        System.out.println("Math.round(" + num + ")=" + Math.round(num));  // 四舍五入
        System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));    // 向上取整
    }

    public static void parse() {

        Integer i11 = 128;  // 装箱，相当于 Integer.valueOf(128);
        int t = i11; //相当于 i1.intValue() 拆箱
        System.out.println("i1拆箱后: " + t);

        /**
         对于–128到127（默认是127）之间的值,被装箱后，会被放在内存里进行重用
         但是如果超出了这个值,系统会重新new 一个对象
         Java 会对 -128 ~ 127 的整数进行缓存，所以当定义两个变量初始化值位于 -128 ~ 127 之间时，两个变量使用了同一地址：
         */
        Integer i1 = 100; // 128
        Integer i2 = 100; // 128

        /**
         注意 == 与 equals的区别
         == 它比较的是对象的地址
         equals 比较的是对象的内容
         */
        if (i1 == i2) {
            System.out.println("true");
        } else {
            System.out.println("i1i2地址一样吗？ false");
        }

        if (i1.equals(i2)) {
            System.out.println("i1和i2对象的内容一样");
        }

        //int 是基本数据类型，int 变量存储的是数值。Integer 是引用类型，实际是一个对象，Integer 存储的是引用对象的地址。
//        Integer i = new Integer(100);
//        Integer j = new Integer(100);
//        System.out.print(i == j); //因为 new 生成的是两个对象，其内存地址不同。 false

        Integer in = 1000;
        double p = Math.random() + in;
        Double q = Math.random() + in;
        System.out.println(p);


        Random random = new Random();
        // 获取 0~3 范围内（包括 0 和 3 )的 int 类型的随机数
        int rd = random.nextInt(6);
        System.out.println("随机整数: " + rd);

        System.out.println(Math.round(rd));
    }
}
//1	xxxValue()
//将 Number 对象转换为xxx数据类型的值并返回。
//2	compareTo()
//将number对象与参数比较。
//3	equals()
//判断number对象是否与参数相等。
//4	valueOf()
//返回一个 Number 对象指定的内置数据类型
//5	toString()
//以字符串形式返回值。
//6	parseInt()
//将字符串解析为int类型。
//7	abs()
//返回参数的绝对值。
//8	ceil()
//返回大于等于( >= )给定参数的的最小整数，类型为双精度浮点型。
//9	floor()
//返回小于等于（<=）给定参数的最大整数 。
//10	rint()
//返回与参数最接近的整数。返回类型为double。
//11	round()
//它表示四舍五入，算法为 Math.floor(x+0.5)，即将原来的数字加上 0.5 后再向下取整，所以，Math.round(11.5) 的结果为12，Math.round(-11.5) 的结果为-11。
//12	min()
//返回两个参数中的最小值。
//13	max()
//返回两个参数中的最大值。
//14	exp()
//返回自然数底数e的参数次方。
//15	log()
//返回参数的自然数底数的对数值。
//16	pow()
//返回第一个参数的第二个参数次方。
//17	sqrt()
//求参数的算术平方根。
//18	sin()
//求指定double类型参数的正弦值。
//19	cos()
//求指定double类型参数的余弦值。
//20	tan()
//求指定double类型参数的正切值。
//21	asin()
//求指定double类型参数的反正弦值。
//22	acos()
//求指定double类型参数的反余弦值。
//23	atan()
//求指定double类型参数的反正切值。
//24	atan2()
//将笛卡尔坐标转换为极坐标，并返回极坐标的角度值。
//25	toDegrees()
//将参数转化为角度。
//26	toRadians()
//将角度转换为弧度。
//27	random()
//返回一个随机数。