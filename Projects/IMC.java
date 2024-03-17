import java.util.Scanner;

public class IMC {
    public static double imc(double Weight, double Height){ //This function will see your IMC.
        double result;
        result = (Weight/(Height * Height));

        if (result < 18.5){
            System.out.println("Under Weight!!");
        } else if (result > 18.5 && result < 24.99) {
            System.out.println("Normal Weight!");
        } else if (result > 25 && result < 29.99) {
            System.out.println("OverWeight!!");
        } else {
            System.out.println("Obese!!!!");
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Height;
        double Weight;

        System.out.println("Type your Height: ");
        Height = scan.nextDouble();
        System.out.println("Type your Weight: ");
        Weight = scan.nextDouble();

        double result = imc(Weight, Height);//This part is to put the function IMC already with result.
        System.out.println("Your IMC is: " + result);
    }
}