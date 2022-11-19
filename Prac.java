package prac;
import java.util.Scanner;
 public class Prac{
     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
       // Calculate and print the product of three integer  
//         int num1;
//         int num2;
//         int num3;
//         System.out.println("Enter the First Number: ");
//         num1 = sc.nextInt();
//         System.out.println("Enter the Second Number: ");
//         num2 = sc.nextInt();
//         System.out.println("Enter the Third Number: ");
//         num3 = sc.nextInt();
//         
//         int total = num1+num2+num3;
//         System.out.println("The product of three integer are " +total);

      //  Coverts Fahrenheit degree to Celsius
          double celsius;
          double tempinfahrenheit= 0.0;
          System.out.println("Enter the Fahrenheit Value: ");
          tempinfahrenheit= sc.nextDouble();
          
          celsius = (tempinfahrenheit - 32.0) * 5.0/9.0;
          System.out.println(celsius);
     }
 }