package ua.levelup.homework20;

import java.util.List;
import java.util.Scanner;

/**
 * Конвертация римских чисел в десятичные
 * @version 1.0
 * @author Savchenko Dmitriy
 */

public class RomanInDecimal {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите римское число");
        String input = scanner.nextLine();
        System.out.println("Десятичное число: "+romanToDecimal(input));
    }

    /**
     * Метод, переводящий римские числа в десятичные;
     * @param input String из римского числа для преобразования;
     * @return десятичное число соответствующее римскому;
     */
    public static int romanToDecimal(String input) {
        String romanNumber = input.toUpperCase();
        int result = 0;
        List romanNumbers = RomanNumber.getReverse();
        int i = 0;
        while ((romanNumber.length() > 0) && (i < romanNumbers.size())) {
            RomanNumber symbol = (RomanNumber) romanNumbers.get(i);
            if (romanNumber.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumber = romanNumber.substring(symbol.name().length());
            } else {
                i++;
            }
        }
        if (romanNumber.length() > 0) {
            throw new IllegalArgumentException(input + " некорректное римское число");
        }
        return result;
    }
}
