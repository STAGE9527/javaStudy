package base.regex;
import java.util.regex.*;

public class RegexTest {

    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoobkkk";
    private static String REPLACE = "-";

    private static String REGEX1 = "dog";
    private static String INPUT1 = "The dog says meow. " +
            "All dogs say meow.";
    private static String REPLACE1 = "cat";

    public static void main(String[] args) {

        // get a matcher object
        Pattern p = Pattern.compile(REGEX1);
        Matcher m = p.matcher(INPUT1);
        INPUT1 = m.replaceAll(REPLACE1);
        System.out.println(INPUT1);

//        Pattern p = Pattern.compile(REGEX);
//        // 获取 matcher 对象
//        Matcher m = p.matcher(INPUT);
//        StringBuffer sb = new StringBuffer();
//        while(m.find()){
//            m.appendReplacement(sb,REPLACE);
//        }
//        m.appendTail(sb);
//        System.out.println(sb.toString());

        String content = "I am noob " +
                "from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);

        testregex();
    }

    public static void testregex(){
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }
}
