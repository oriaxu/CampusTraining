/**
 * Created by jingyixu on 7/26/17.
 */
/*
牛牛从生物科研工作者那里获得一段字符串数据s,牛牛需要帮助科研工作者从中找出最长的DNA序列。DNA序列指的是序列中只包括'A','T','C','G'。牛牛觉得这个问题太简单了,就把问题交给你来解决。
例如: s = "ABCBOATER"中包含最长的DNA片段是"AT",所以最长的长度是2。
输入描述:
输入包括一个字符串s,字符串长度length(1 ≤ length ≤ 50),字符串中只包括大写字母('A'~'Z')。
输出描述:
输出一个整数,表示最长的DNA片段
输入例子1:
ABCBOATER
输出例子1:
2
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main4 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();

        int i = 0;
        int tmp = 0;
        int longest = 0;
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('T');
        set.add('C');
        set.add('G');

        while(i < str.length()){

            if(set.contains(str.charAt(i))){
                tmp ++;
            }
            else {
                if (tmp != 0){
                    longest = Math.max(longest,tmp);
                    tmp = 0;
                }
            }
            i ++;
            longest = Math.max(longest,tmp);
        }
        System.out.println(longest);
    }
}
