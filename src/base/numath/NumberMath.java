package base.numath;

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
        System.out.println("Math.floor(" + num + ")=" + Math.floor(num));
        System.out.println("Math.round(" + num + ")=" + Math.round(num));
        System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));
    }

    public static void parse(){

         Integer i11 = 128;  // 装箱，相当于 Integer.valueOf(128);
         int t = i11; //相当于 i1.intValue() 拆箱
         System.out.println("i1拆箱后: "+t);

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
        if(i1==i2) {
            System.out.println("true");
        } else {
            System.out.println("i1i2地址一样吗？ false");
        }

        if(i1.equals(i2)){
            System.out.println("i1和i2对象的内容一样");
        }

        //int 是基本数据类型，int 变量存储的是数值。Integer 是引用类型，实际是一个对象，Integer 存储的是引用对象的地址。
        Integer i = new Integer(100);
        Integer j = new Integer(100);
        System.out.print(i == j); //因为 new 生成的是两个对象，其内存地址不同。 false
    }
}
