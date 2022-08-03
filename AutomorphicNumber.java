import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int digit = 0;
        int sq = 0;
       int temp = num;
       while (temp > 0){
           temp = temp /10;
           digit++;
       }
       sq = num * num;
       temp = sq % (int)Math.pow(10 , digit);

       if ( temp == num)
           System.out.println("AutomorphicNumber");
       else
           System.out.println("not AutomorphicNumber");
    }
}
