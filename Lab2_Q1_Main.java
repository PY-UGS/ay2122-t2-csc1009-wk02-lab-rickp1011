import java.util.Scanner;
/**
 * Java program to calculate area of a circle
 */
public class Lab2_Q1_Main {

    public static void main(String[] args) {
        System.out.print("Enter radius of circle: ");
        Scanner sn = new Scanner(System.in);
        Double radius = sn.nextDouble();

        Double area = Math.PI * radius * radius;
        System.out.println("the  area  for the circle of radius "+ radius + " is " + area);
    }
}
