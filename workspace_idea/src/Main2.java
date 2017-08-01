/*
链接：https://www.nowcoder.com/questionTerminal/2baa6aba39214d6ea91a2e03dff3fbeb
来源：牛客网

开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
处理： 
1、 记录最多8条错误记录，循环记录，对相同的错误记录（净文件名称和行号完全匹配）只记录一条，错误计数增加； 
2、 超过16个字符的文件名称，只记录文件的最后有效16个字符； 
3、 输入的文件可能带路径，记录文件名称不能带路径。

输入描述:
一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。

输出描述:
将所有的记录统计并将结果输出，格式：文件名 代码行数 数目，一个空格隔开，如：

示例1
输入
E:\V1R2\product\fpgadrive.c   1325
输出
fpgadrive.c 1325 1
 */
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;
public class Main2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Map <String, Integer> map = new LinkedHashMap<String, Integer>();
        while(in.hasNext()){
            String file = in.next();
            int line = in.nextInt();
            String[] arr = file.split("\\\\"); //根据\切割
            String fileName = arr[arr.length - 1];
            if (fileName.length() > 16)
                fileName = fileName.substring(fileName.length() - 16);
            String key = fileName + " " + line;
            if (map.containsKey(key))
            map.put(key, map.get(key) + 1);
            else {
                map.put(key, 1);
            }
        }
        int count = 0;
        for (String string : map.keySet()) {
            count++;
            if (count > (map.keySet().size() - 8)) //输出最后八个记录
                System.out.println(string + " " + map.get(string));
        }
    }
}





