/*
 * 作者：小白同学
 链接：https://www.nowcoder.com/discuss/30113
 来源：牛客网

 牛牛喜欢彩色的东西,尤其是彩色的瓷砖。牛牛的房间内铺有L块正方形瓷砖。每块砖的颜色有四种可能:红、绿、蓝、黄。给定一个字符串S,
 如果S的第i个字符是'R', 'G', 'B'或'Y',那么第i块瓷砖的颜色就分别是红、绿、蓝或者黄。    牛牛决定换掉一些瓷砖的颜色,
 使得相邻两块瓷砖的颜色均不相同。请帮牛牛计算他最少需要换掉的瓷砖数量。
 */

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int i = 0;
        int count = 0;
        while (i < str.length() - 1){
            if (str.charAt(i) == str.charAt(i+1)){
                count ++;
                i = i + 2;
            }else {
                i++;
            }

        }
        System.out.println(count);
    }
}
