import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 10 == 7 || num % 7 == 0 ){
            System.out.println("BuzzNumber");
        }else
            System.out.println(" not BuzzNumber");
    }
}
