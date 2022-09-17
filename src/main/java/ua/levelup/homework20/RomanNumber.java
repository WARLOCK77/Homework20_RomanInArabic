package ua.levelup.homework20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Списочный класс, перечисляющий значения римских чисел в десятичном формате
 * @version 1.0
 * @author Savchenko Dmitriy
  */


public enum RomanNumber {
    I(1), IV(4), V(5), IX(9), X(10),
    XL(40), L(50), XC(90), C(100),
    CD(400), D(500), CM(900), M(1000);

    private final int value;

    RomanNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    /**
     * Метод позволяющий получить явное значение римских цифр
     * @return List из значений римских цифр
     */
    public static List getReverse() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((RomanNumber e) -> e.value).reversed())
                .collect(Collectors.toList());
    }
}
