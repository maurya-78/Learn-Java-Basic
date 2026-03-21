package IF_ELSE;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        if( n % 2 == 0){
            System.out.println("Your number is Even number:");
        }else {
            System.out.println("Your number is Odd number:");
        }
    }
}
