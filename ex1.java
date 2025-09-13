import java.util.Scanner;
public class ex1{
    public static void main(String[] args){
          System.out.println("taking marks from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks is");
        double total =sc.nextDouble();
        System.out.println("Enter marks for 5 subject");
        System.out.println("Enter marks for maths");
        int a = sc.nextInt();
        System.out.println("Enter marks for English");
        int b = sc.nextInt();
        System.out.println("Enter marks for Physics");
        int c = sc.nextInt();
        System.out.println("Enter marks for Chemistry");
        int d = sc.nextInt();
        System.out.println("Enter marks for Hindi");
        int e = sc.nextInt();
        int Sum = a + b + c + d + e;
        // System.out.println("obatain marks is");
        System.out.println("Sum of total number =" + Sum);
         System.out.println("Enter obtained marks is");
        double obtained = sc.nextDouble();
         double percentage = (obtained/total) * 100;
        //  System.out.println("Total percentage is");
        System.out.println(" Total percentage is =" + percentage + "%");
        
        
    }
    
    
}