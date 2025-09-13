import java.util.Scanner;
// sum
public class q1(sum) {
    public static void main(String[] args) {
       System.out.println("Sum of three number");
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter num1 : ");
       float num1 = sc.nextFloat();
       System.out.print("Enter num2 : ");
       float num2 = sc.nextFloat();
       System.out.print("Enter num3 : ");
       float num3 = sc.nextFloat();
       float Sum = num1 + num2 + num3 ;
       System.out.println("Sum of three number is " + Sum);
    }
}