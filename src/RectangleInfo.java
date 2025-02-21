import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double height = 0;
        double width = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.println("Please enter the height: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. You've entered: " + trash);
                System.out.println("please re-enter your input. ");
            }
        } while (!done);
            done = false;
                do {
        System.out.println("Enter the width of the rectangle: ");
        if (in.hasNextDouble()) {
            width = in.nextDouble();
            in.nextLine();
            done = true;
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input. You've entered: " + trash);
            System.out.println("please re-enter your input. ");
        }
    } while (!done);
    double area = width * height;
    double perimeter = 2 * (width * height);
    double diagonal = Math.sqrt(width * width + height * height);

    System.out.printf("\nResults:\n", area);
    System.out.printf("Area: %.2f\n", area);
    System.out.printf("Perimeter: %.2f\n", perimeter);
    System.out.printf("Diagonal: %.2f\n", diagonal);
        }
    }



