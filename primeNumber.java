import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primeCheck = scan.nextInt();
        int flag = 0;
        if(primeCheck == 1|| primeCheck == 0){
            System.out.println("not");
        }
        for(int i = 2; i < primeCheck; i++){
            if (primeCheck % i == 0){
                System.out.println("not");
                 flag = 1;
                break;
            }}if (flag == 0){
                System.out.println("prime");
            }

    }
}
