import java.util.Scanner;

/**
 * Created by anshu on 04/02/17.
 */
class FebruaryChallenge_CHEFAPAR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int p=0;p<t;p++){
            int n = scan.nextInt();
            int sum1=0,sum0=0;
            int zero=-1;
            boolean flag = false;
            for(int i=0;i<n;i++){
                int a = scan.nextInt();
                if(a==1){
                    sum1+=1;
                }
                else if(!flag){
                    flag=true;
                    sum0+=(n-i);
                }
            }
//            System.out.print(sum1+"  "+sum0);
            double ans = (n-sum1)*1000+(sum0*100);
            System.out.printf("%.0f \n",ans);
        }
    }
}
