import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        int [] values = new int [5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");

        for (int i = 0; i < values.length; i++) {

            values [i] = scanner.nextInt();

        }

        int largetNumber = values[0];
        int smallestNumber = values[0];
        int sum = values[0];

        for (int i =0; i < values.length; i++){
            if(values[i] > largetNumber) {
                largetNumber = values[i];
            }
            if(values[i] < smallestNumber) {
                smallestNumber = values[i];
            }
            sum = sum + values[i];
        }
        double average = (double) sum / values.length;
        System.out.println("Largest number is " +  largetNumber);
        System.out.println("Smallest number is " + smallestNumber);
        System.out.println("Average is " + average);
    }



}
