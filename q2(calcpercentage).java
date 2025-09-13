import java.util.Scanner;
// calucting percentage using marks

public class q2(calcpercentage) {
    public static void main(String[] args) {
       System.out.println("calcuting percentage");
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter total marks : ");
       float total = sc.nextFloat(); 
       System.out.print("Enter marks in math : ");
       float maths = sc.nextFloat();
          System.out.print("Enter marks in chemistry : ");
       float chem = sc.nextFloat();
          System.out.print("Enter marks in physics : ");
       float phy = sc.nextFloat();
       float sum = maths + chem + phy ;
       System.out.println("total marks is " + sum);
       double per = (sum/total) * 100;
       System.out.println("your percentage is " + per + "%");

    }
}