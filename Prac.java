package prac;
import java.util.Scanner;
 public class Prac{
     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
      int num1= 0 , num2 = 0, bigger;
         System.out.println("Enter the first number");
         num1 = sc.nextInt();
         System.out.println("Enter the second number");
         num2 = sc.nextInt();
         
         if (num1>num2){
             bigger = num1;
             System.out.println("The number is larger " + bigger);
         }
         else if (num1<num2){
             bigger = num2;
             System.out.println("The number is larger " + bigger);
         }
         else{
             System.out.println("The numbers are equal");
         }
     }
 }