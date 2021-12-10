package base.string;

import java.util.ArrayList;
import java.util.List;

public class StringTest {

    public static void main(String[] args) {
        // 创建字符串最简单的方式如下:
        // 注意:String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了（详看笔记部分解析）。

        //如果需要对字符串做很多修改，那么应该选择使用 StringBuffer & StringBuilder 类。
        String s = "Google";
        System.out.println("s = " + s);

        s = "Runoob";
        System.out.println("s = " + s);
        //Google
        //Runoob
        //从结果上看是改变了，但为什么门说String对象是不可变的呢？
        //原因在于实例中的 s 只是一个 String 对象的引用，并不是对象本身，
        // 当执行 s = "Runoob"; 创建了一个新的对象 "Runoob"，而原来的 "Google" 还存在于内存中。

        String str = "Stage";
        String s1 = "Stage9527";              // String 直接创建
        String s2 = "Stage95277";              // String 直接创建
        String s3 = s1;                    // 相同引用
        String s4 = new String("Stage9527b");   // String 对象创建
        String s5 = new String("Stage9527c");   // String 对象创建
        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        char[] helloArray = {'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        String helloString2 = new String(helloArray, 0, helloArray.length - 1);
        System.out.println(helloString);
        System.out.println(helloString2);
        String st = new String("stage.");
        int len = st.length();
        System.out.println("st: " + st);

        System.out.println("st lenght: " + len);

        String st2 = st.concat("9527");
        System.out.println("st2: " + st2);
        int len2 = st2.length();
        System.out.println("st2 lenght: " + len2);

        System.out.println("st2是否包含s");
        System.out.println(st2.contains("s")); //true
        System.out.println(st2.isEmpty());  // false
        System.out.println("st2.toCharArray(): "+st2.toCharArray());


        test();

        test2();
        cancattest();
//        System.out.printf("浮点型变量的值为 " +
//                "%f, 整型变量的值为 " +
//                " %d, 字符串变量的值为 " +
//                "is %s", floatVar, intVar, stringVar);
    }

    public static void test() {
        String arr[] = {"First", "Second", "Third", "four"};
        String a = "HelloWorld";
        List<String> list = new ArrayList<String>();
        list.add(a);
        list.add(arr[0]);
        System.out.println("数组array的长度为" + arr.length);
        System.out.println("字符串a的长度为" + a.length());
        System.out.println("list中元素个数为" + list.size());
        System.out.println();
    }

    public static void test2() {
        String a = "a";
        String b = "b";
        String c = a + b;
        String cc = new StringBuffer().append(a).append(b).toString();
        System.out.println(c);
        System.out.println("c"+cc);
        String str1 = "hello world";
        String str2 = new String("hello world");
        String str3 = "hello world";
        String str4 = new String("hello world");
        System.out.println("hello world: str1==str2 ==>");
        System.out.println(str1 == str2);   // false
        System.out.println("hello world: str1==str3 ==>");
        System.out.println(str1 == str3); // true
        System.out.println("hello world: str2==str4 ==>");
        System.out.println(str2 == str4);   //false
        System.out.println("hello world: str2.equals(str4) ==>");
        System.out.println(str2.equals(str4));   //true
        //String str1 = "hello world"; 和 String str3 = "hello world"; 都在编译期间生成了字面常量和符号引用，
        // 运行期间字面常量 "hello world" 被存储在运行时常量池（当然只保存了一份）。
        // 通过这种方式来将 String 对象跟引用绑定的话，JVM 执行引擎会先在运行时常量池查找是否存在相同的字面常量，
        // 如果存在，则直接将引用指向已经存在的字面常量；否则在运行时常量池开辟一个空间来存储该字面常量，并将引用指向该字面常量。　
        //众所周知，通过 new 关键字来生成对象是在堆区进行的，而在堆区进行对象生成的过程是不会去检测该对象是否已经存在的。
        // 因此通过 new 来创建对象，创建出的一定是不同的对象，即使字符串的内容是相同的。


//        String s1 = "abc";            // 常量池
//        String s2 = new String("abc");     // 堆内存中
//        System.out.println(s1==s2);        // false   两个对象的地址值不一样。
//        System.out.println(s1.equals(s2)); // true

        //java 中常量优化机制，编译时 s1 已经成为 abc 在常量池中查找创建，s2 不需要再创建。
//        String s1="a"+"b"+"c";
//        String s2="abc";
//        System.out.println(s1==s2);             // true
//        System.out.println(s1.equals(s2));      // true

        //先在常量池中创建 ab ，地址指向 s1, 再创建 abc ，指向 s2。
        // 对于 s3，先创建StringBuilder（或 StringBuffer）对象，
        // 通过 append 连接得到 abc ,再调用 toString() 转换得到的地址指向 s3。
        // 故 (s3==s2) 为 false。
        String s1 = "ab";
        String s2 = "abc";
        String s3 = s1 + "c";
        System.out.println(s3 == s2);         // false
        System.out.println(s3.equals(s2));  // true
    }

    public static void cancattest(){
        System.out.println();
        String str1 = "a".concat("b").concat("c");
        String str2 = "a"+"b"+"c";
        String str3 = "abc";
        String str4 = new String("abc");
        System.out.println(str1 == str2); //运行结果为false
        System.out.println(str1 == str3); //运行结果为false
        System.out.println(str2 == str4); //运行结果为false

        System.out.println(str2 == str3); //运行结果为ture
        System.out.println(str1.equals(str4)); //运行结果为true


        // 因为 == 比较的是两个对象的地址值，equals() 比较的是字面值。
        // 那么 concat 方法和 + 号的区别在这里有体现了，我们查看concat方法的源码可以看到，
        // 它是通过复制数组在通过 char 数组进行拼接生成一个新的对象，所以地址值会有变动，而 + 号不会
    }
}

//SN(序号)	方法描述
//1	char charAt(int index)
//返回指定索引处的 char 值。
//2	int compareTo(Object o)
//把这个字符串和另一个对象比较。
//3	int compareTo(String anotherString)
//按字典顺序比较两个字符串。
//4	int compareToIgnoreCase(String str)
//按字典顺序比较两个字符串，不考虑大小写。
//5	String concat(String str)
//将指定字符串连接到此字符串的结尾。
//6	boolean contentEquals(StringBuffer sb)
//当且仅当字符串与指定的StringBuffer有相同顺序的字符时候返回真。
//7	static String copyValueOf(char[] data)
//返回指定数组中表示该字符序列的 String。
//8	static String copyValueOf(char[] data, int offset, int count)
//返回指定数组中表示该字符序列的 String。
//9	boolean endsWith(String suffix)
//测试此字符串是否以指定的后缀结束。
//10	boolean equals(Object anObject)
//将此字符串与指定的对象比较。
//11	boolean equalsIgnoreCase(String anotherString)
//将此 String 与另一个 String 比较，不考虑大小写。
//12	byte[] getBytes()
// 使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
//13	byte[] getBytes(String charsetName)
//使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
//14	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
//将字符从此字符串复制到目标字符数组。
//15	int hashCode()
//返回此字符串的哈希码。
//16	int indexOf(int ch)
//返回指定字符在此字符串中第一次出现处的索引。
//17	int indexOf(int ch, int fromIndex)
//返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。
//18	int indexOf(String str)
// 返回指定子字符串在此字符串中第一次出现处的索引。
//19	int indexOf(String str, int fromIndex)
//返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。
//20	String intern()
// 返回字符串对象的规范化表示形式。
//21	int lastIndexOf(int ch)
// 返回指定字符在此字符串中最后一次出现处的索引。
//22	int lastIndexOf(int ch, int fromIndex)
//返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。
//23	int lastIndexOf(String str)
//返回指定子字符串在此字符串中最右边出现处的索引。
//24	int lastIndexOf(String str, int fromIndex)
// 返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。
//25	int length()
//返回此字符串的长度。
//26	boolean matches(String regex)
//告知此字符串是否匹配给定的正则表达式。
//27	boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
//测试两个字符串区域是否相等。
//28	boolean regionMatches(int toffset, String other, int ooffset, int len)
//测试两个字符串区域是否相等。
//29	String replace(char oldChar, char newChar)
//返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
//30	String replaceAll(String regex, String replacement)
//使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
//31	String replaceFirst(String regex, String replacement)
// 使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
//32	String[] split(String regex)
//根据给定正则表达式的匹配拆分此字符串。
//33	String[] split(String regex, int limit)
//根据匹配给定的正则表达式来拆分此字符串。
//34	boolean startsWith(String prefix)
//测试此字符串是否以指定的前缀开始。
//35	boolean startsWith(String prefix, int toffset)
//测试此字符串从指定索引开始的子字符串是否以指定前缀开始。
//36	CharSequence subSequence(int beginIndex, int endIndex)
// 返回一个新的字符序列，它是此序列的一个子序列。
//37	String substring(int beginIndex)
//返回一个新的字符串，它是此字符串的一个子字符串。
//38	String substring(int beginIndex, int endIndex)
//返回一个新字符串，它是此字符串的一个子字符串。
//39	char[] toCharArray()
//将此字符串转换为一个新的字符数组。
//40	String toLowerCase()
//使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
//41	String toLowerCase(Locale locale)
// 使用给定 Locale 的规则将此 String 中的所有字符都转换为小写。
//42	String toString()
// 返回此对象本身（它已经是一个字符串！）。
//43	String toUpperCase()
//使用默认语言环境的规则将此 String 中的所有字符都转换为大写。
//44	String toUpperCase(Locale locale)
//使用给定 Locale 的规则将此 String 中的所有字符都转换为大写。
//45	String trim()
//返回字符串的副本，忽略前导空白和尾部空白。
//46	static String valueOf(primitive data type x)
//返回给定data type类型x参数的字符串表示形式。
//47	contains(CharSequence chars)
//判断是否包含指定的字符系列。
//48	isEmpty()
//判断字符串是否为空。
