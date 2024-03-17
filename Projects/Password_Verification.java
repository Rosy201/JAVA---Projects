import java.util.Scanner;

public class Password_Verification {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String password = scan.next();

        while(true) { //This part I use "While" to repeat until create what was requested.
            do {
                if (password.length() >= 10) {
                    System.out.println("Senha cadastrada!!");
                    return;
                }
                System.out.println("Por favor, tem que ser no minino 10 letras:");
                password = scan.next();
            } while(password == "!" && password == "@" && password == "#" && password == "$" && password == "%" && password == "&" && password == "*" && password == "?");

            System.out.println("Refazer a senha e adicione caracteres especiais: ");
            password = scan.next();
        }
    }
}

