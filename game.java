import java.util.Random;
import java.util.*;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Code will Start : ");
        System.out.println("Chose 0 for Rock , 1 for Paper , and 2 for Scissor : ");
        System.out.print("Chose number : ");
        int userInput = sc.nextInt();
        if(userInput<0){
            System.out.println("Please check the Condition");
        }else if (userInput == 0) {
            System.out.println("Your Choice is : Rock");
        }else if (userInput == 1) {
            System.out.println("Your Choice is : Paper");
        }else if (userInput == 2) {
            System.out.println("Your Choice is : Scissor");
        }else{
            System.out.println("Please check the Condition");
        }
        // Input for computer//
        Random random = new Random();
        int computerInput = random.nextInt( 3);
          if(computerInput<0){
            System.out.println("Please check the Condition");
        }else if (computerInput == 0) {
            System.out.println("Computer Choice is : Rock");
        }else if (computerInput == 1) {
            System.out.println("Computer Choice is : Paper");
        }else if (computerInput == 2) {
            System.out.println("Computer Choice is : Scissor");
        }else{
            System.out.println("Please check the Condition");
        }

        // check condition to win //
        if (userInput == computerInput) {
            System.out.println("Game is : Draw");
        }else if (userInput == 0 && computerInput == 2 || userInput==1 && computerInput==0 || userInput == 2 && computerInput == 1) {
            System.out.println("Game : You Win");
        }else if (userInput<0 || userInput<3 || computerInput<0 || computerInput<3) {
            System.out.println("Please check the condition");
        }
        else{
             System.out.println("Game : Computer Win");
        }
        sc.close();
    }
}
