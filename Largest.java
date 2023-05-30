import java.util.Scanner;

// 2.Write a program to that will take 2 values from users
//  and use ternary operators to find largest number among them.
public class Largest {
    public static void main(String[] args) {
        System.out.println("Enter num1: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter num2: ");
        int b=sc.nextInt();
        int max=(a>b)?a:b;
        System.out.println("Largest number among "+a+ " and "+b+" is "+max);
    }
}
