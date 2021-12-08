/**
 * 类方法的详细使用说明
 *
 * @param 参数1 参数1的使用说明
 * @return 返回结果的说明
 * @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
 * <p>
 * main 是一个程序的入口，一个 java 程序运行必须而且有且仅有一个 main 方法。
 * 编译: javac HelloWorld.java
 * 运行: java HelloWorld
 * <p>
 * String[] args 还有一种等价的写法： String... args
 * 注意：三个参数之间用空格隔开！
 * 如果要输出空格怎么办？
 * 只需要在包含空格的参数上，使用双引号 "" 即可。
 */

/*
大小写敏感：Java 是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。
类名：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 MyFirstJavaClass 。
方法名：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
源文件名：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 .java。（如果文件名和类名不相同则会导致编译错误）。
主方法入口：所有的 Java 程序由 public static void main(String[] args) 方法开始执行。

所有的标识符都应该以字母（A-Z 或者 a-z）,美元符（$）、或者下划线（_）开始
首字符之后可以是字母（A-Z 或者 a-z）,美元符（$）、下划线（_）或数字的任何字符组合
关键字不能用作标识符
标识符是大小写敏感的
合法标识符举例：age、$salary、_value、__1_value
非法标识符举例：123abc、-salary

访问控制修饰符 : default, public , protected, private
非访问控制修饰符 : final, abstract, static, synchronized

 (1) 由字母、数字、下划线、$组成，不能以数字开头。
 (2) 大小写敏感。
 (3) 不得使用java中的关键字和保留字。
关键字：都是小写的，jdk1.2多了strictfp(经准浮点型)，关键字 jdk1.4多了assert(断言)关键字，jdk1.5多了enum(枚举) 关键字。

true、false、null 严格说不应该算关键字，应称其为保留字更合适。

习惯：

 (1) 标识符要符合语义信息。
 (2) 包名所有字母小写。
 (3) 类名每个单词首字母大写，其它小写，如：TarenaStudent。
 (4) 变量和方法：第一个单词小写，从第二个单词开始首字母大写，如：tarenaStudent。
 (5) 常量：所有字母大写，每个单词之间用 _ 连接。
* */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

//        $ java HelloWorld aaa 1 "c cc"
//        aaa
//        1
//        c cc
    }
}
