import java.util.HashMap;
import java.util.Map;

public class Converter {
    private static final Map<Character, String> toMorse = new HashMap<>();
    private static final Map<String, Character> fromMorse = new HashMap<>();

    static {
        // Bokstäver & Sifforr & Tecken
        toMorse.put('A', "*-");
        toMorse.put('B', "-***");
        toMorse.put('C', "-*-*");
        toMorse.put('D', "-**");
        toMorse.put('E', "*");
        toMorse.put('F', "**-*");
        toMorse.put('G', "--*");
        toMorse.put('H', "****");
        toMorse.put('I', "**");
        toMorse.put('J', "*---");
        toMorse.put('K', "-*-");
        toMorse.put('L', "*-**");
        toMorse.put('M', "--");
        toMorse.put('N', "-*");
        toMorse.put('O', "---");
        toMorse.put('P', "*--*");
        toMorse.put('Q', "--*-");
        toMorse.put('R', "*-*");
        toMorse.put('S', "***");
        toMorse.put('T', "-");
        toMorse.put('U', "**-");
        toMorse.put('V', "***-");
        toMorse.put('W', "*--");
        toMorse.put('X', "-**-");
        toMorse.put('Y', "-*--");
        toMorse.put('Z', "--**");
        toMorse.put('1', "*----");
        toMorse.put('2', "**---");
        toMorse.put('3', "***--");
        toMorse.put('4', "****-");
        toMorse.put('5', "*****");
        toMorse.put('6', "-****");
        toMorse.put('7', "--***");
        toMorse.put('8', "---**");
        toMorse.put('9', "----*");
        toMorse.put('0', "-----");
        toMorse.put('.', "*-*-*-");
        toMorse.put(',', "--**--");
        toMorse.put('?', "**--**");
        toMorse.put(' ', " ");


        // Skapa omvänd mappning
        toMorse.forEach((key, value) -> fromMorse.put(value, key));
    }

    public static String toMorse(String text) {
        String morse = "";
        for (char c : text.toUpperCase().toCharArray()) {
            String code = toMorse.getOrDefault(c, "?");
            morse += code + "";
        }
        return morse;
    }

    public static String fromMorse(String morseCode) {
        String text = "";
        for (String code : morseCode.split(" ")) {
            Character letter = fromMorse.getOrDefault(code, '?');
            text += "" + letter;
        }
        return text;
    }
}