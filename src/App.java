import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    static void convertCtoF() {
        System.out.print("Enter Celsius degree: ");
        double cDegree = sc.nextDouble();
        System.out.println("Your F degree is: " + ((cDegree*1.8)+32));
    }

    static void convertCmtoKm () {
        System.out.print("Write the centimeter: ");
        double cm = sc.nextDouble();
        System.out.printf("To kilometer is: " + (cm/1000));
    }
    public static void main(String[] args) {
        convertCtoF();
        convertCmtoKm();
    }
    
}
