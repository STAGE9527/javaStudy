package base;

public class Ifyou {
    public static void main(String[] args) {
        ifone();
        ifelse();
        ifmanyelse();
        stub();
        System.out.println();
        Ifyou a = new Ifyou();
        float b = 11;// 根据行数，判断是否可以组成菱形。
        // 如果是基数行可以输入对应的菱形，如果是偶数行则输出"你输入的数据不能形成菱形结构";
        a.prit1(b);
        a.prit2(b);
//        int r = 35;                          //赋值并执行draw方法
//        a.draw(r);
    }

    public static void stub() {
        System.out.println("输出200以内能被7整除但是不能被4整除的数字");
        int k = 1;// 一个计数器，后面用于控制每行打印的个数
        // 用for循环进行200以内的循环
        for (int i = 0; i <= 200; i++) {
            // if语句判断是否为题目中的条件，如果满足，则打印
            if (i % 7 == 0 && i % 4 != 0) {
                System.out.print(i + "\t");
                // 每次循环都将计数器+1
                k++;
                // 如果计数器大于6就换行，并且将计数器归一，重新进入下一次循环计数
                if (k > 6) {
                    System.out.println();
                    k = 1;
                }
            }
        }
    }

    /**
     * if(布尔表达式)
     * {
     * //如果布尔表达式为true将执行的语句
     * }
     */
    public static void ifone() {
        int x = 1;
        if (x == 1) {
            System.out.println(x);
        }
    }

    /**
     * if(布尔表达式){
     * //如果布尔表达式的值为true
     * }else{
     * //如果布尔表达式的值为false
     * }
     */
    public static void ifelse() {
        int x = 30;
        if (x < 20) {
            System.out.println("小于20");
        } else {
            System.out.println("大于20");
        }
    }

    /**
     * if(布尔表达式 1){
     * //如果布尔表达式 1的值为true执行代码
     * }else if(布尔表达式 2){
     * //如果布尔表达式 2的值为true执行代码
     * }else if(布尔表达式 3){
     * //如果布尔表达式 3的值为true执行代码
     * }else {
     * //如果以上布尔表达式都不为true执行代码
     * }
     */
    public static void ifmanyelse() {
        int x = 30;
        if (x == 10) {
            System.out.print("Value of X is 10");
        } else if (x == 20) {
            System.out.print("Value of X is 20");
        } else if (x == 30) {
            System.out.print("Value of X is 30\n");
        } else {
            System.out.print("这是 else 语句");
        }
    }

    /**
     * if(布尔表达式 1){
     * ////如果布尔表达式 1的值为true执行代码
     * if(布尔表达式 2){
     * ////如果布尔表达式 2的值为true执行代码
     * }
     * }
     */
    public static void ifif() {
        int x = 30;
        int y = 10;

        if (x == 30) {
            if (y == 10) {
                System.out.print("X = 30 and Y = 10");
            }
        }
    }

    public void prit1(float c) {
        float p = c / 2;// 升序排序
        float d;// 声明行数变量
        float e;// 声明打印*号的变量
        float f;// 声明打印空格的变量
        float r;// 声明升序排序
        float s = c % 2;// 取模
        if (s == 0) {
            System.out.println("你输入的数据不能形成菱形结构");
        } else {
            for (d = 1; d <= p; d++) {
                for (f = p; f >= d; f--) {
                    System.out.print(" ");
                }
                for (e = 1; e <= d * 2 - 1; e++) {
                    if (e == 1 || e == d * 2 - 1) {
                        System.out.print("*");// 如果是第一个数和最后一个数，就输入*
                    } else {
                        System.out.print(" ");// 否则输入空格
                    }
                }
                System.out.println();
            }
        }
    }

    // 下面是打印倒序的代码
    public void prit2(float m) {
        float i;// 声明行数变量
        float j;// 声明打印*号的变量
        float k;// 声明打印空格数的变量
        float n = m / 2 + 1;// 倒序排序
        float o = m % 2;// m取模
        if (o == 0) {
            System.out.print("");
        } else {
            for (i = 1; i <= n; i++)// 行数循环；
            {
                // 打印*号前打印空格；
                for (k = 0; k < i - 1; k++) {
                    System.out.print(" ");
                }

                // 下面打印*号个数的循环；
                for (j = (n - k) * 2 - 2; j >= 1; j--)// 打印*号个数的循环；
                {
                    if (j == (n - k) * 2 - 2 || j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // 打印完*号换行打印；
                System.out.println();
            }
        }
    }

    int a, b;    //a是要生成的菱形行数
    int h;      //h是方法中的参数，也是行数
    int i, j;    //i j是循环结构参数

    public void draw(int h) {
        for (i = 1; i <= h; i++) {         //逐行打印
            for (j = 1; j <= h; j++) {       //每行打印个数与行数保持一致
                //下面语句是菱形四条边的函数，在边上的坐标点，打印*，否则打印空格
                if (j == (h + 3) / 2 - i || j == (h - 1) / 2 + i || j == i - (h - 1) / 2 || j == (3 * h + 1) / 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();        //第 i 行打印完换行
        }
    }
}
