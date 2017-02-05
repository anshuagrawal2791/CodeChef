import java.util.Scanner;

/**
 * Created by anshu on 05/02/17.
 */
class FebruaryChallenge_KBIGNUMB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int p=0;p<t;p++){
            double a = scan.nextDouble();
            double n = scan.nextDouble();
            int m = scan.nextInt();

            String number = "";
            for(double i=0;i<n;i++){
                number=number.concat((int)a+"");
            }
//            System.out.println("---"+number);
//            while(number.length()>9){
////                System.out.println(number);
//                String x = number.substring(0,9);
//                number = number.substring(9,number.length());
//                double y = Double.parseDouble(x)%m;
////                System.out.println("y - "+y);
//                number = (int)y+number;
//            }
//            System.out.printf("%.0f \n",Double.parseDouble(number)%m);

            int ans=0;
            for(int i=0;i<number.length();i++){
                ans=(ans*10 + Integer.parseInt(number.substring(i,i+1)))%m;
            }
            System.out.println(ans);
        }
    }
}
