import java.util.Scanner;

public class PrintThePatternGeeks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = n; i >= 1 ; i--){
            for (int j = n; j >=1; j-- ){
                for (int k = i; k>=1; k--){
                    System.out.print(j+" ");
                }
            }
            System.out.print("$");
        }
    }
}
