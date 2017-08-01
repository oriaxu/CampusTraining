package javaPractice;

/**
 * Created by jingyixu on 7/10/17.
 */
public class Exercise3 {
    public static void main(String[] args){
        String str = "OOPS";
        noUse(str);
        System.out.println(str);
    }

    public static void noUse(String str){
        str = "O" + str;
    }
}
