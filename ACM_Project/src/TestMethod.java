import java.util.Scanner;

public class TestMethod {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            float sum = 0;
            int negnum = 0;
            int posnum = 0;
            for(int i=0;i<N;i++){
                int num = sc.nextInt();
                if(num<0)
                    negnum++;
                else if(num>0){
                    sum += num;
                    posnum++;
                }
            }
            float aver = sum/posnum;
            System.out.print(negnum+" ");
            System.out.printf("%.1f\n",aver);
        }
    }
}
