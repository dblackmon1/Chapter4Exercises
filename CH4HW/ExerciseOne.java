package CH4HW;

import java.util.InputMismatchException;

public class ExerciseOne {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean con = true;
        do {
            try {
                System.out.println("Please enter two Integers");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int sum = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is equal to: " + sum);
                System.out.println("Thank you and good bye");
                con = false;
            } catch (InputMismatchException e) {
                System.out.println(e + "Please try again");
                input.next();

            }
        }while(con);
    }

}
