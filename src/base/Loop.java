package base;

/**
 *
 */
public class Loop {
    public static void main(String[] args) {
        whileJob();
        dowhileJob(10);
        forJob();
        night2();
        peach();
    }

    /**
     * while( 布尔表达式 ) {
     * //循环内容
     * }
     */
    public static void whileJob() {
        int x = 0;
        while (x < 10) {
            System.out.println("while: " + x);
            x++;
        }
    }

    /**
     * do {
     * //代码语句
     * }while(布尔表达式);
     */
    public static void dowhileJob(int x) {
        do {
            System.out.println("do while: " + x);
            x++;
        } while (x < 20);
    }

    /**
     * for(初始化; 布尔表达式; 更新) {
     * //代码语句
     * }
     */
    public static void forJob() {
        for (int x = 1; x < 10; x=x+1) {
            System.out.println("for: " + x);
        }
        for (int x = 11; x < 20;) {
            System.out.println("for: " + x);
            x++;
        }
        int []numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ){
            // x 等于 30 时跳出循环
            if( x == 30 ) {
                break;
//                continue;
            }
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");
        String []names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
        System.out.print("\n");
    }


    public static void night2() {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                if ((i==3||i==4) && (j==3)){
                    System.out.print(" "+j+"*"+i+"="+i*j+" ");
                }else {
                    System.out.print(j+"*"+i+"="+i*j+" ");
                }
            }
            System.out.println();
        }
    }

    public static void peach(){
        // 方法一
        int sum1=1;
        for(int i=9;i>=1;i--){
            sum1=(sum1+1)*2;
        }
        System.out.println("sum1="+sum1);
        // 方法二
        int sum2=1;
        for (int i=1;i<=9;i++){
            sum2=(sum2+1)*2;
        }
        System.out.println("sum2="+sum2);
    }
}
