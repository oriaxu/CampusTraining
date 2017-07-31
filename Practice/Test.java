import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jingyixu on 6/28/17.
 */
public class Test{
    public static void page99_4(){
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        try {
            System.out.println("请输入一个1至10的数字, 并按enter键");
            int input = Integer.parseInt(reader.readLine());
            if ((input < 0) || (input > 10)){
                System.out.println("输入的数字不正确");
                return;
            }
            switch (input){
                case 1:
                    System.out.print("壹");
                    break;
                case 2:
                    System.out.print("贰");
                    break;
                case 3:
                    System.out.print("叁");
                    break;
                case 4:
                    System.out.print("肆");
                    break;
                case 5:
                    System.out.print("伍");
                    break;
                case 6:
                    System.out.print("陆");
                    break;
                case 7:
                    System.out.print("麒");
                    break;
                case 8:
                    System.out.print("捌");
                    break;
                case 9:
                    System.out.print("玖");
                    break;
                case 10:
                    System.out.print("拾");
                    break;
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void main(String[] args){
        page99_4();
    }
}
