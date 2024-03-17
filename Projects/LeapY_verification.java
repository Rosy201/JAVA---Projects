import java.util.Scanner;

public class LeapY_verification {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year;

        System.out.println("Type the Year: ");
        year= scan.nextInt();

        if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){ // Here i needed to use
            //o % to calculate o year that can be divided by 4, 100 and 400 to know that
            // year is a leayyear or not.
            System.out.println("The Year " + year + " is a LeapYear");
        }else{
            System.out.println("Is not a LeapYear");
        }
    }
}