import java.util.Scanner;
public class Lab2_Q2_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] numbers = new float [3];
        float sum = 0;
        System.out.println("enter 3 numbers: ");
        for(int i=0; i<3; i++)
        {
            //reading array elements from the user
            numbers[i]= input.nextFloat();
        }

        for (int i = 0; i < numbers.length; i++)
        {
            sum = sum+numbers[i];
        }

        double average = sum / 3;

        System.out.println("the Average of " +numbers[0] +","+numbers[1]+","+numbers[2]+ " is "+average);
        input.close();
    }
}
