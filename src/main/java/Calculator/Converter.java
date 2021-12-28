package Calculator;

import java.util.List;

public class Converter {
    static int romanToArabic(String number) {
        return 1 + List.of("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X").indexOf(number);
    }

    static String arabicToRoman(int number) {
        return String.join("",
                number == 100 ? "C" : "",
                new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}[number % 100 / 10],
                new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}[number % 10]
        );
    }
}
