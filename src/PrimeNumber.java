import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number upto: ");
        int number = sc.nextInt();
        System.out.println("Prime number upto "+number+" are :");
        for(int i = 2; i<number;i++){
            int digit = 0;
            for (int j = 1; j<=i;j++){
                if (i%j == 0){
                    digit ++;
                }
            }
            if(digit == 2) {
                System.out.print(i + " ");
            }
        }
    }
}