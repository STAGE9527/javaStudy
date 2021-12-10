package base.array;

import java.util.Arrays;

/**
 * dataType[] arrayRefVar;   // 首选的方法
 * 或
 * dataType arrayRefVar[];  // 效果相同，但不是首选方法
 * <p>
 * arrayRefVar = new dataType[arraySize];
 * dataType[] arrayRefVar = new dataType[arraySize];
 * 数组的元素是通过索引访问的。数组索引从 0 开始，所以索引值从 0 到 arrayRefVar.length-1。
 * <p>
 * type[][] typeName = new type[typeLength1][typeLength2];
 * String[][] str = new String[3][4];
 */
public class ArrayTest {
    public static void main(String[] args) {
        doubleTest(12);
        foeeach();
        int[] myList = new int[]{1, 2, 4, 6, 8};

        System.out.println("元素6在myList中的位置：Arrays.binarySearch(myList, 6)：" + "\t" + Arrays.binarySearch(myList, 6));//3
        // 填充数组 相当于修改数组
        Arrays.fill(myList, myList.length - 1, myList.length, 5);
        System.out.println("填充数组：Arrays.fill(array, 5)：");
        printArray(myList);
        System.out.println();
        int[] newList = reverse(myList);
        int[] array2 = newList.clone();
        System.out.println("克隆后数组元素是否相等:Arrays.equals(array1, array2):" + "\t" + Arrays.equals(newList, array2));
        printArray(newList);
        System.out.println();
        manyArrTest();
        maopao();


        int[] a = {10, 20, 30, 40, 50};
        a = Arrays.copyOf(a, a.length + 1);
        String newstr = "";
        for (int i = 0; i < a.length; i++) {
            newstr += a[i] + "\t";
        }
        System.out.println(newstr);
    }

    public static void doubleTest(int size) {
        // size 数组大小
        // 定义数组
        double[] myList = new double[size];
//        int[] m = new int[1];
//        m[0] = 1;
//        System.out.println(m);
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        // 对整个数组进行排序
        Arrays.sort(myList);
        System.out.println("myList[10]： " + myList[10]);
        System.out.println("总和为： " + total);
        //myList[10]： 0.0
        //总和为： 11367.373

        test();
    }

    public static void test() {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // 打印所有数组元素
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);
        // 查找最大元素
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);
    }

    /**
     * for(type element: array)
     * {
     * System.out.println(element);
     * }
     */
    public static void foeeach() {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        Arrays.sort(myList, 1, 2);

        // 打印所有数组元素
        for (double element : myList) {
            System.out.println(element);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    public static void manyArrTest() {
        String[][] s = new String[2][];
        s[0] = new String[2];
        s[1] = new String[3];
        s[0][0] = new String("Good");
        s[0][1] = new String("Luck");
        s[1][0] = new String("to");
        s[1][1] = new String("you");
        s[1][2] = new String("!");
        System.out.println(s[0].length);
        System.out.println(s[1].length);
        for (int i = 0; i < s[0].length; i++) {
            for (int j = 0; j < s[1].length; j++) {
                if (i == 0 && j == 2) {
                    continue;
                } else {
                    System.out.println(s[i][j] + "");
                }
            }
        }

        String str = "helloworld";
        char[] data = str.toCharArray();// 将字符串转为数组
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + "  ");
            data[x] -= 32;
            System.out.print(data[x] + "  ");
        }
        System.out.println(new String(data));
    }

    public static void maopao() {
        int arr[] = {26, 15, 29, 66, 99, 88, 36, 77, 111, 1, 6, 8, 8};
        for (int i = 0; i < arr.length - 1; i++) {//外层循环控制排序趟数
            for (int j = 0; j < arr.length - i - 1; j++) {
                //内层循环控制每一趟排序多少次
                // 把小的值交换到前面
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print("第" + (i + 1) + "次排序结果：");
            //列举每次排序的数据
            for (int a = 0; a < arr.length; a++) {
                System.out.print(arr[a] + "\t");
            }
            System.out.println("");
        }
        System.out.println("最终排序结果：");
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }
}


/*

序号	方法和说明
1	public static int binarySearch(Object[] a, Object key)
用二分查找算法在给定数组中搜索给定值的对象(Byte,Int,double等)。数组在调用前必须排序好的。如果查找值包含在数组中，则返回搜索键的索引；否则返回 (-(插入点) - 1)。
2	public static boolean equals(long[] a, long[] a2)
如果两个指定的 long 型数组彼此相等，则返回 true。如果两个数组包含相同数量的元素，并且两个数组中的所有相应元素对都是相等的，则认为这两个数组是相等的。换句话说，如果两个数组以相同顺序包含相同的元素，则两个数组是相等的。同样的方法适用于所有的其他基本数据类型（Byte，short，Int等）。
3	public static void fill(int[] a, int val)
将指定的 int 值分配给指定 int 型数组指定范围中的每个元素。同样的方法适用于所有的其他基本数据类型（Byte，short，Int等）。
4	public static void sort(Object[] a)
对指定对象数组根据其元素的自然顺序进行升序排列。同样的方法适用于所有的其他基本数据类型（Byte，short，Int等）。
* */