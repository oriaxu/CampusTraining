package javaPractice;

/**
 * Created by jingyixu on 7/10/17.
 */
public class Page236_4 {
    public static void main(String[] args){
        String appendStr = appendTwoString("ABC","123");
        System.out.print(appendStr);
    }

    public static String appendTwoString(String str1, String str2){

        StringBuffer stringBuf = new StringBuffer();
        stringBuf.append(str1).append(str2);
        return stringBuf.toString();
    }


}
