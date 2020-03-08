package com.mmontilla.numeros_romanos;

import java.util.Arrays;
import java.util.List;

public class RomanNumber {

    private static final List<String> romanSymbols = Arrays.asList("I", "V", "X", "L", "C", "D", "M");

    public String convertToRoman(Integer mNaturalNumber) {
        char[] charNumbers = mNaturalNumber.toString().toCharArray();

        int inc = 0;
        String resultado = "";
        for (int i = charNumbers.length -1; i >= 0 ; i--) {
            String roman = genericMethod(Character.getNumericValue(charNumbers[i]), 0 + inc, 1 + inc, 2 + inc);

            resultado = roman + resultado;
            inc += 2;
        }
        return resultado;
    }

    private String genericMethod(int unitType, int x, int y, int z) {
        switch (unitType) {
            case 4:
                return romanSymbols.get(x) + romanSymbols.get(y);
            case 9:
                return romanSymbols.get(x) + romanSymbols.get(z);
        }
        if (unitType <= 3) {
            return concatenarRoman(1, unitType, "", romanSymbols.get(x));
        }
        if (unitType <= 8) {
            return concatenarRoman(6, unitType, romanSymbols.get(y), romanSymbols.get(x));
        }
        return null;
    }

    private String concatenarRoman(int startCount, int naturalNumber, String startRomanNumber, String numberToConcatenar) {
        StringBuilder romanNumberBuilder = new StringBuilder(startRomanNumber);
        for (int i = startCount; i <= naturalNumber; i++) {
            //Esto es igual a decir: result += "I";
            romanNumberBuilder.append(numberToConcatenar);
        }
        startRomanNumber = romanNumberBuilder.toString();
        return startRomanNumber;
    }
}
