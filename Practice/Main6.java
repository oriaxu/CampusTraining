/**
 * Created by jingyixu on 7/26/17.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Map<Character,Integer> map= new HashMap<Character,Integer>();
        for(int i = 0; i < str.length(); i++){

            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        int oddNumber = 0;
        for(Character key: map.keySet()){
            if(map.get(key)%2 == 1){
                oddNumber ++;
            }
        }
        System.out.print(oddNumber);
    }
}
