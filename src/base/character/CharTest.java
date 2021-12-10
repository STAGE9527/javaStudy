package base.character;

import java.util.Random;

public class CharTest {
    public static void main(String[] args) {
        Character s = 'a';

        System.out.println(Character.isLetter(s)); // 是否是字母     true
        System.out.println(Character.isDigit(s)); // 是否是数字      false
        System.out.println(Character.isWhitespace(s)); // 是否是一个空白字符     false
        System.out.println(Character.isUpperCase(s)); // 是否是一个大写字母      false
        System.out.println(Character.isLowerCase(s)); // 是否是一个小写字母   true
        System.out.println(Character.toLowerCase(s)); // 指定字母的小写形式  a
        System.out.println(Character.toUpperCase(s)); // 指定字母的大写形式  A

        String str = Character.toString(s);
        System.out.println("字符串 " + str); // 返回字符的字符串形式，字符串的长度仅为1
//        new Random().nextInt(1);
        System.out.println("访问\"菜鸟教程!\"");
        genCase();
        // test2();
    }

    public static void test2() {
        char ch = 'a';

        // Unicode 字符表示形式
        char uniChar = '\u039A';

        // 字符数组
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        // 原始字符 'a' 装箱到 Character 对象 ch 中
        Character ch1 = 'a';

        // 原始字符 'x' 用 test 方法装箱
        // 返回拆箱的值到 'c'
        char c = ch1.charValue();
        System.out.println(uniChar);
        System.out.println(ch);
        System.out.println(c);

    }

    public static void genCase() {
        String sr1 = "I Like JAVA ! I learn Java everyday.";
        String sr2 = "";
        String sr3 = "";

        for (int i = 0; i < sr1.length(); i++) {//获取字符串的长度用的是length();
            if (Character.isUpperCase(sr1.charAt(i))) {//先将String类型的字符串转换成char类型                                                                            再获取每一个字符元素，用charAt(i)实现
                sr2 += sr1.charAt(i) + " ";//提取大写字母
            }

            if (Character.isLowerCase(sr1.charAt(i))) {
                sr3 += sr1.charAt(i) + " ";//提取小写字母
            }
        }

        System.out.println("大写字母有：" + sr2);
        System.out.println("小写字母有：" + sr3);
    }

}
//1	isLetter()
//是否是一个字母
//2	isDigit()
//是否是一个数字字符
//3	isWhitespace()
//是否是一个空白字符
//4	isUpperCase()
//是否是大写字母
//5	isLowerCase()
//是否是小写字母
//6	toUpperCase()
//指定字母的大写形式
//7	toLowerCase()
//指定字母的小写形式
//8	toString()