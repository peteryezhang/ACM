//TODO
import java.util.*;

public class ParamResolve {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) { 
            String[] strs = sc.nextLine().split("\\.");
            if(strs == null || strs.length != 4){
                System.out.println("NO");
                break;
            }
            int i;
            for(i = 0; i < strs.length; i++){
                char[] cs = strs[i].toCharArray();
                int j;
                for(j = 0; j < cs.length; j++){
                    if(cs[j] < '0' || cs[j] > '9')
                        break;
                }
                // 如果有非数字字符，则输出"NO"
                if(j != cs.length){
                    System.out.println("NO");
                    break;
                }else{
                    int num = Integer.valueOf(strs[i]);
                    // 如果数字范围不在[0,255]，则输出"NO"
                    if(num < 0 || num > 255){
                        System.out.println("NO");
                        break;
                    }
                }
            }
            if(i == strs.length){
                System.out.println("YES");
            }
        }
        sc.close();
    }
}