import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int reverse  = n;

        while(reverse > 0){
           int  am = reverse % 10;
            reverse /= 10;

            count += am*am*am;
        }if (count == n){
            System.out.println("amstrong number");
        }else
            System.out.println("non amstrong number");
    }
}
