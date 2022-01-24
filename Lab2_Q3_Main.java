import java.util.Scanner;
public class Lab2_Q3_Main {

        public static void main(String[] Strings) {


            long totalMilliseconds = System.currentTimeMillis(); //method of calling current time in millisecond
            long totalSeconds = totalMilliseconds/1000;
            long currentsecond =  totalSeconds%60;
            long totalMinutes = totalSeconds/60;
            long currentminute = totalMinutes%60;
            long totalHours = totalMinutes/60;
            long currenthour = totalHours%24;
            System.out.println("Current time is " + currenthour +":"+ currentminute+":"+ currentsecond+" gmt");

        }
    }
