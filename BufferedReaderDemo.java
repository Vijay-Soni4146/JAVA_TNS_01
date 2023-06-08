import java.io.*;
import java.util.Scanner;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Hello "+name);

        // InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        try {
            System.out.print("Enter your age: ");
            String ageString = br.readLine();
            int age = Integer.parseInt(ageString);
            System.out.println("You are " + age + " years old.");
        } catch (Exception e) {
            e.printStackTrace();
        }


        
        // Creating object of class inside main() method
        
        // BufferedReader br = new BufferedReader(
        //     new InputStreamReader(System.in));
 
        // System.out.println("Enter an integer");
 
        // // Taking integer input
        // int a = Integer.parseInt(br.readLine());
 
        // System.out.println("Enter a String");
 
        // String b = br.readLine();
        
        // // Printing input entities above
        // System.out.printf("You have entered:- " + a
        //                   + " and name as " + b);

    }

}


