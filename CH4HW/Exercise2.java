package CH4HW;

public class Exercise2 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean continueInput = true;
        do {


            try {
                double[] values = new double[50];
                for (int i = 0; i < values.length; i++) {
                    values[i] = Math.random();
                }
                System.out.println("Input an index number within range");
                int indexNumber = input.nextInt();
                System.out.println("You entered the  index number " + indexNumber);
                System.out.println("The number of the index " + indexNumber + " is " + values[indexNumber]);
                continueInput = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e + "Please try again");
            }
        }while(continueInput);
    }
}
