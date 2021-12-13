package base.string;

/**
 * String：字符串常量，字符串长度不可变。Java中String 是immutable（不可变）的。用于存放字符的数组被声明为final的，因此只能赋值一次，不可再更改。
 * <p>
 * StringBuffer：字符串变量（Synchronized，即线程安全）。如果要频繁对字符串内容进行修改，出于效率考虑最好使用 StringBuffer，
 * 如果想转成 String 类型，可以调用 StringBuffer 的 toString() 方法。Java.lang.StringBuffer 线程安全的可变字符序列。
 * 在任意时间点上它都包含某种特定的字符序列，但通过某些方法调用可以改变该序列的长度和内容。可将字符串缓冲区安全地用于多个线程。
 * <p>
 * StringBuilder：字符串变量（非线程安全）。在内部 StringBuilder 对象被当作是一个包含字符序列的变长数组。
 * <p>
 * 基本原则：
 * 如果要操作少量的数据用 String ；
 * 单线程操作大量数据用StringBuilder ；
 * 多线程操作大量数据，用StringBuffer。
 * <p>
 * String 长度大小不可变
 * StringBuffer 和 StringBuilder 长度可变
 * StringBuffer 线程安全 StringBuilder 线程不安全
 * StringBuilder 速度快
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);         //Runoob..
        sb.append("!");
        System.out.println(sb);         //Runoob..!
        sb.insert(8, "Java");
        System.out.println(sb);          //Runoob..Java!
        sb.delete(5, 8);
        System.out.println(sb);          //RunooJava!
        buffertest();
    }

    public static void buffertest() {
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
        System.out.println(sBuffer.reverse());
        System.out.println(sBuffer.delete(1, 2));
        System.out.println(sBuffer.insert(1, "ts"));
        System.out.println(sBuffer.replace(1, 2, "sb"));
        System.out.println(sBuffer.substring(1));
    }
}

//以下是 StringBuffer 类支持的主要方法：
//
//序号	方法描述
//1	public StringBuffer append(String s)
//将指定的字符串追加到此字符序列。
//2	public StringBuffer reverse()
// 将此字符序列用其反转形式取代。
//3	public delete(int start, int end)
//移除此序列的子字符串中的字符。
//4	public insert(int offset, int i)
//将 int 参数的字符串表示形式插入此序列中。
//5	insert(int offset, String str)
//将 str 参数的字符串插入此序列中。
//6	replace(int start, int end, String str)
//使用给定 String 中的字符替换此序列的子字符串中的字符。

//1	int capacity()
//返回当前容量。
//2	char charAt(int index)
//返回此序列中指定索引处的 char 值。
//3	void ensureCapacity(int minimumCapacity)
//确保容量至少等于指定的最小值。
//4	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
//将字符从此序列复制到目标字符数组 dst。
//5	int indexOf(String str)
//返回第一次出现的指定子字符串在该字符串中的索引。
//6	int indexOf(String str, int fromIndex)
//从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引。
//7	int lastIndexOf(String str)
//返回最右边出现的指定子字符串在此字符串中的索引。
//8	int lastIndexOf(String str, int fromIndex)
//返回 String 对象中子字符串最后出现的位置。
//9	int length()
// 返回长度（字符数）。
//10	void setCharAt(int index, char ch)
//将给定索引处的字符设置为 ch。
//11	void setLength(int newLength)
//设置字符序列的长度。
//12	CharSequence subSequence(int start, int end)
//返回一个新的字符序列，该字符序列是此序列的子序列。
//13	String substring(int start)
//返回一个新的 String，它包含此字符序列当前所包含的字符子序列。
//14	String substring(int start, int end)
//返回一个新的 String，它包含此序列当前所包含的字符子序列。
//15	String toString()
//返回此序列中数据的字符串表示形式。