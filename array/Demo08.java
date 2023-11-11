package com.mypackage.array;

public class Demo08 {
    public static void main(String[] args) {
        //1.创建一个二维数组  11*11
        // 0：没有棋子   1：黑棋  2：白棋
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;
        //一、输出原始的数组
        System.out.println("输出原始数组：");

        printArray2(array1);


        System.out.println("=============================");


        //二、转换为稀疏数组来保存
        //1.先获取有效值的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array1[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println("有效值的个数："+sum);

        //2.再写出稀疏数组的第0行
        int[][] array2= new int[sum+1][3];
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;

        //3.遍历二维数组，将非零的值放进稀疏数组中，写出稀疏数组第0行以下的数
        /*二维数组的第一个括号代表行数，也就是竖着的长度；
        第二个括号代表列数，也就是横着的长度
        array.length代表的是二维数组的行数
        array[i].length才是代表它的列数*/
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0){
                    count ++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];
                }
            }
        }
        /*原数组如下：
        0	0	0	0	0	0	0	0	0	0	0
        0	0	1	0	0	0	0	0	0	0	0
        0	0	0	2	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        */
        /*在某一行中，遇到一个不为0的数，count++。
        比如：在第1行第2列中也就是i=1、j=2时就遇到了第一个不为0的数，
        那么此时count++变成1，稀疏数组的第1行的每个数就有了着落，
        稀疏数组的第1行第0列，也就是array2[1][0]，它的值就是原数组的行数，也就是1；
        稀疏数组的第1行第1列，也就是array2[1][1]，它的值就是原数组的列数，也就是2；
        稀疏数组的第1行第2列，也就是array2[1][2]，它的值就是原数组的此位置的值，也就是1。
        */
        /*依次类推，得出稀疏数组如下：
                            11	11	2
                            1	2	1
                            2	3	2
        */

        //4.输出稀疏数组
        System.out.println("输出稀疏数组：");

        printArray2(array2);


        System.out.println("=================");


        //三、将稀疏数组还原
        System.out.println("还原稀疏数组：");
        //1.先读取稀疏数组
        int[][] array3= new int[array2[0][0]][array2[0][1]];
        /*
        array[0][0]就是原数组的行数，array[0][1]就是原数组的列数。
        这一步读取稀疏数组，可以将原数组的长宽读取回来
        */
        //2.给其中的元素还原它的值
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }
        /*
        int i = 1，把i初始化为1，是因为稀疏数组的第1行开始才是有效值，
        稀疏数组的第0行是行数列数以及有效值个数。
        以上面的稀疏数组为例：
                            11	11	2
                            1	2	1
                            2	3	2
        */
        /*
        i = 1时，array3[array[1][0]][array2[1][1]] = array2[1][2];
        也就是，array3[1][2] = 1;
        同样的，array3[2][3] = 2;
        这样，原数组的两个有效值就被填充回去了，
        我们只需要吧有效值的位置填充一下就行，
        剩下的位置直接默认被0填充满。
        */
        //3.打印
        System.out.println("输出还原的数组：");

        printArray2(array3);
    }


    //创建一个用来打印数组的方法，节省代码量
    public static void printArray2(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
}
