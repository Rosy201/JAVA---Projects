import java.util.Scanner;

public class Main {
    // the word "word" that will be encrypted
    // the word "key" that will be the offset of encrypt algorithm
    public static String cipherword(String word, int key) {
        word = word.toLowerCase();
        String cipherword = "";
        for (int i = 0; i < word.length(); i++) {
            if (i > 'z') {
                cipherword += (char) (word.charAt(i) - (26 - key));
            } else {
                cipherword += (char) (word.charAt(i) + key);
            }
        }
        return cipherword;
    }

    public static String decrypted(String word, int key) {
        word = word.toLowerCase();
        String cipherword = "";
        for (int i = 0; i < word.length(); i++) {
            if (i > 'z') {
                cipherword += (char) (word.charAt(i) + (26 - key));
            } else {
                cipherword += (char) (word.charAt(i) - key);
            }
        }
        return cipherword;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        int key;

        System.out.println("Type the Word: ");
        word = scan.next();
        System.out.println("Type the position that you want to encrypt: ");
        key = scan.nextInt();

        String code = cipherword(word, key);
        System.out.println("Cipherword : " + code);
        System.out.println("Decrypted : " + decrypted(code, key));
    }
}