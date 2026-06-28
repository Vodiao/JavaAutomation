package lesson_2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double MILES_TO_KILOMETERS = 1.609;

        System.out.println("Miles → Kilometers");
        double miles = sc.nextDouble();
        System.out.println("Kilometers: " + miles * MILES_TO_KILOMETERS);
        System.out.println("Kilometers → Miles");
        double kilometers = sc.nextDouble();
        System.out.println("Miles: " + kilometers / MILES_TO_KILOMETERS);
    }
}
