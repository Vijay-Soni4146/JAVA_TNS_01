import java.util.Scanner;

// 3.write a program to take 3 values from user and find addition 
// and average of these values and grade them like if avg marks>90 then A 
// between 80 to 90 then B betweeen 70 to 80 then C otherwise D

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sub1 Marks");
        int sub1=sc.nextInt();
        System.out.println("Enter sub2 Marks");
        int sub2=sc.nextInt();
        System.out.println("Enter sub3 Marks");
        int sub3=sc.nextInt();
        int add=(sub1+sub2+sub3);
        int avg=(sub1+sub2+sub3)/3;
        System.out.println("Total Marks obtained: "+add);
        System.out.println("Average is "+avg);

        if(avg>90){
            System.out.println("Grade obtained is A");
        }else if(avg>=80 && avg<=90){
            System.out.println("Grade obtained is B");
        }else if(avg>=70 && avg<=80){
            System.out.println("Grade obtained is C");
        }else{
            System.out.println("Grade obtained is D");
        }
    }
}
