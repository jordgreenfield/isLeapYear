import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter a valid year: ");
        Scanner s = new Scanner(System.in);
        if(!leapYear.isLeapYear(s.nextInt())){
            System.out.println("That is not a leap year");
        }else
            System.out.println("That is a leap year");
    }
}
