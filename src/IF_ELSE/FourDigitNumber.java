package IF_ELSE;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the valid number:");
        int n = sc.nextInt();
        if( n > 999 && n < 10000){
            System.out.println("Number in four digit");
        }else{
            System.out.println("Not a four digit number");
        }
    }
}
