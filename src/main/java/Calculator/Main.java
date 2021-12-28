package Calculator;

import java.util.Scanner;

import static Calculator.Calculate.calculateNumbers;
import static Calculator.Converter.arabicToRoman;

public class Main {
    private static final String SEPARATOR = "|";

    public static void main(String[] args) throws CalculateException {
        Scanner scanner = new Scanner(System.in);
        var result=0;
        String firstArgument = scanner.next(Type.ARABIAN.getValue() + SEPARATOR + Type.ROMAN.getValue());
        String operation = scanner.next(ArithmeticOperation.OPERATION.getOperation());
        Boolean isRomanNumber = firstArgument.matches(Type.ROMAN.getValue());
        String secondArgument = scanner.next(isRomanNumber ? Type.ROMAN.getValue() : Type.ARABIAN.getValue());
        if (firstArgument.matches(Type.ROMAN.getValue()) && secondArgument.matches(Type.ROMAN.getValue())) {
            result = calculateNumbers(firstArgument, secondArgument, operation);
            if(result < 1) {
                throw  new CalculateException("В римской нумерации нет нуля и отрицательных чисел");
            }else {
                System.out.println(arabicToRoman(result));
            }
        }else {
            result = calculateNumbers(firstArgument, secondArgument, operation);
            System.out.println(result);
        }
    }
}
