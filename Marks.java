/* Write a program to calculate percentage of a given student in CBCE board exam.
 His marks from 5 subject must me token as input from the user (marks are out of 100) */
 import java.util.Scanner;

 public class Marks {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Taking input for marks
         System.out.println("Enter marks Of Subject (out of 100):");
         System.out.print("1) ");
         int sub1 = sc.nextInt();
         System.out.print("2) ");
         int sub2 = sc.nextInt();
         System.out.print("3) ");
         int sub3 = sc.nextInt();
         System.out.print("4) ");
         int sub4 = sc.nextInt();
         System.out.print("5) ");
         int sub5 = sc.nextInt();
 
         // Calculating total marks
         int total = sub1 + sub2 + sub3 + sub4 + sub5;
         System.out.println("Total Marks Obtained: " + total);
 
         // Calculating percentage
         double percentage = (total / 500.0) * 100;
         System.out.println("Your percentage is " + percentage + "%");
 
         sc.close();
     }
 }
 