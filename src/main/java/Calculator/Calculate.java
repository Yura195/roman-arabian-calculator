package Calculator;

import static Calculator.Converter.romanToArabic;
import static java.lang.Integer.parseInt;

public class Calculate {
    static int calculateNumbers(String firstNumber, String secondNumber, String operation) throws CalculateException {
        int firstArgument = 0;
        int secondArgument = 0;
        int result =0;
        if (firstNumber.matches(Type.ROMAN.getValue()) != secondNumber.matches(Type.ROMAN.getValue())) {
            throw new CalculateException("Нужно ввести либо 2 арабских,либо 2 римских числа");
        }
        if (firstNumber.matches(Type.ROMAN.getValue()) && secondNumber.matches(Type.ROMAN.getValue())) {
            firstArgument = romanToArabic(firstNumber);
            secondArgument = romanToArabic(secondNumber);
        }else {
            firstArgument = parseInt(firstNumber);
            secondArgument = parseInt(secondNumber);
        }

        switch (operation) {
            case "+":
                result = firstArgument + secondArgument;
                break;
            case "-":
                 result = firstArgument - secondArgument;
                 break;
            case "*":
                 result = firstArgument * secondArgument;
                 break;
            case "/":
                result = firstArgument / secondArgument;
                break;
            default:
                throw new CalculateException("нет такой арифметической операции");
        }

        return result;
    }
}
