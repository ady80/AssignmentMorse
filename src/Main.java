import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your message in English or Morse:");
        String input = scanner.nextLine();

        if (isMorseCode(input)) {
            System.out.println("In English: " + Converter.fromMorse(input));
        } else {
            System.out.println("In Morse: " + Converter.toMorse(input));
        }
    }

    public static boolean isMorseCode(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != '*' && c != '-' && c != ' ') {
                return false; // Hittas ett ogiltigt tecken = inte morsekod
            }
        }
        return true; // Alla tecken är ok = morsekod
    }
}