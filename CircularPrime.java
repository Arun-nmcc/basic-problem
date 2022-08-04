import java.util.Scanner;

public class CircularPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primeCheck = scan.nextInt();
        byte flag = (byte) primeCheck(primeCheck);
        if(flag == 0){
        int temp =primeCheck;
        int count = 0;
        while (temp > 0){
            temp /= 10;
            count++;

        }
        count--;
        temp = primeCheck ;
        int reverse = 0 ;
        int count1 = count;

        while(count1 > 0){

            reverse = (int) (temp / Math.pow(10 , count));


            reverse = (int) (reverse  + (temp %  Math.pow(10 , count)) * 10);

            flag = (byte) primeCheck(reverse);
            temp =  reverse;

            if (flag == 1){
                break;
            }
            count1 --;

        }if (flag == 0){
                System.out.println("circular prime");
            }else
                System.out.println("prime but not circular prime");


    }}

    static int  primeCheck(int num){
        int flag = 0;
        if(num == 1|| num == 0){
            System.out.println("not");
        }
        for(int i = 2; i < num; i++){
            if (num % i == 0){
                System.out.println("not");
                flag = 1;
                break;
            }}
        return flag;
    }
}
