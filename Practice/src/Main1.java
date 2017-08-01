/**
 * Created by jingyixu on 7/19/17.
 */
/*
老师想知道从某某同学当中，分数最高的是多少，现在请你编程模拟老师的询问。当然，老师有时候需要更新某位同学的成绩.
输入描述:
输入包括多组测试数据。
每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,分别代表学生的数目和操作的数目。
学生ID编号从1编到N。
第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩
接下来又M行，每一行有一个字符C（只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候, 表示这是一条询问操作，他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少
当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B。

对于每一次询问操作，在一行里面输出最高成绩.

示例1
输入
5 7
1 2 3 4 5
Q 1 5
U 3 6
Q 3 4
Q 4 5
U 4 5
U 2 9
Q 1 5
输出
5
6
5
9


本题关键：
    1. query和update的数组不需要记录，每次输入立即有输出
    2. 应该用while进行多组输入
    3. 对于Q， start和end的大小需要进行比较
 */
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args){
        int N; //student
        int M; //action
        Scanner keyboard = new Scanner(System.in);
        while(keyboard.hasNext()){
            N = keyboard.nextInt();
            M = keyboard.nextInt();
            int[] marks = new int[N];
            for (int i = 0; i < N; i ++){
                marks[i] = keyboard.nextInt();
            }

            String a = null;
            int b = 0;
            int c = 0;
            for (int i = 0; i < M && keyboard.hasNext(); i++){
                a = keyboard.next();
                b = keyboard.nextInt();
                c = keyboard.nextInt();

                if (a.equals("U")){
                    marks[b-1] = c;
                }
                else if(a.equals("Q")){
                    int end, begin;
                    end = Math.max(b, c);
                    begin = Math.min(b, c)-1;
                    int tmp = 0;
                    for (int j = begin; (j < end) && (j < marks.length); j++){
                        if (tmp < marks[j]) {
                            tmp = marks[j];
                        }
                    }
                    System.out.println(tmp);
                }
            }
        }
    }
}
