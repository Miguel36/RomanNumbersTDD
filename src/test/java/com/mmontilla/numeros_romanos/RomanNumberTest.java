package com.mmontilla.numeros_romanos;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class RomanNumberTest {

    private RomanNumber romanNumber = new RomanNumber();

    @Test
    public void convertNumberOneToRoman() {
        String romano = romanNumber.convertToRoman(1);
        assertEquals(romano, "I");
    }

    @Test
    public void convertNumberTwoToRoman() {
        String romano = romanNumber.convertToRoman(2);
        assertEquals(romano, "II");
    }

    @Test
    public void convertNumberThreeToRoman() {
        String romano = romanNumber.convertToRoman(3);
        assertEquals(romano, "III");
    }

    @Test
    public void convertNumberFourToRoman() {
        String romano = romanNumber.convertToRoman(4);
        assertEquals(romano, "IV");
    }

    @Test
    public void convertNumberFiveToRoman() {
        String romano = romanNumber.convertToRoman(5);
        assertEquals(romano, "V");
    }

    @Test
    public void convertNumberSixToRoman() {
        String romano = romanNumber.convertToRoman(6);
        assertEquals(romano, "VI");
    }

    @Test
    public void convertNumberSevenToRoman() {
        String romano = romanNumber.convertToRoman(7);
        assertEquals(romano, "VII");
    }

    @Test
    public void convertNumberEightToRoman() {
        String romano = romanNumber.convertToRoman(8);
        assertEquals(romano, "VIII");
    }

    @Test
    public void convertNumberNineToRoman() {
        String romano = romanNumber.convertToRoman(9);
        assertEquals(romano, "IX");
    }

    @Test
    public void convertNumberTenToRoman() {
        String romano = romanNumber.convertToRoman(10);
        assertEquals(romano, "X");
    }

    @Test
    public void convertNumberElevenToRoman() {
        String romano = romanNumber.convertToRoman(11);
        assertEquals(romano, "XI");
    }

    @Test
    public void convertNumberTwelveToRoman() {
        String romano = romanNumber.convertToRoman(12);
        assertEquals(romano, "XII");
    }

    @Test
    public void convertNumberTheerteenToRoman() {
        String romano = romanNumber.convertToRoman(13);
        assertEquals(romano, "XIII");
    }

    @Test
    public void convertNumberFourteenToRoman() {
        String romano = romanNumber.convertToRoman(14);
        assertEquals(romano, "XIV");
    }

    @Test
    public void convertNumberFifteenToRoman() {
        String romano = romanNumber.convertToRoman(15);
        assertEquals(romano, "XV");
    }

    @Test
    public void convertNumberSixteenToRoman() {
        String romano = romanNumber.convertToRoman(16);
        assertEquals(romano, "XVI");
    }

    @Test
    public void convertNumberSeventeenToRoman() {
        String romano = romanNumber.convertToRoman(17);
        assertEquals(romano, "XVII");
    }

    @Test
    public void convertNumberEighteenToRoman() {
        String romano = romanNumber.convertToRoman(18);
        assertEquals(romano, "XVIII");
    }

    @Test
    public void convertNumberNineteenToRoman() {
        String romano = romanNumber.convertToRoman(19);
        assertEquals(romano, "XIX");
    }

    @Test
    public void convertNumberTwentyToRoman() {
        String romano = romanNumber.convertToRoman(20);
        assertEquals(romano, "XX");
    }

    @Test
    public void verifyVeintenaRomanNumbers() {
        List<Integer> naturalNumbers = Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27, 28, 29);

        List<String> romanos = naturalNumbers
                .stream()
                .map(number -> romanNumber.convertToRoman(number))
                .collect(Collectors.toList()
        );
        assertEquals(romanos.get(0), "XX");
        assertEquals(romanos.get(1), "XXI");
        assertEquals(romanos.get(2), "XXII");
        assertEquals(romanos.get(3), "XXIII");
        assertEquals(romanos.get(4), "XXIV");
        assertEquals(romanos.get(5), "XXV");
        assertEquals(romanos.get(6), "XXVI");
        assertEquals(romanos.get(7), "XXVII");
        assertEquals(romanos.get(8), "XXVIII");
        assertEquals(romanos.get(9), "XXIX");
    }

    @Test
    public void verifyDecenasRomanNumbers() {
        List<Integer> naturalNumbers = Arrays.asList(40, 50, 60, 70, 80, 90, 88, 67);

        List<String> romanos = naturalNumbers
                .stream()
                .map(number -> romanNumber.convertToRoman(number))
                .collect(Collectors.toList()
                );
        assertEquals(romanos.get(0), "XL");
        assertEquals(romanos.get(1), "L");
        assertEquals(romanos.get(2), "LX");
        assertEquals(romanos.get(3), "LXX");
        assertEquals(romanos.get(4), "LXXX");
        assertEquals(romanos.get(5), "XC");
        assertEquals(romanos.get(6), "LXXXVIII");
        assertEquals(romanos.get(7), "LXVII");
    }

    @Test
    public void verifyRomanNumbers() {
        List<Integer> naturalNumbers = Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800, 900, 3234);

        List<String> romanos = naturalNumbers
                .stream()
                .map(number -> romanNumber.convertToRoman(number))
                .collect(Collectors.toList()
                );
        assertEquals(romanos.get(0), "C");
        assertEquals(romanos.get(1), "CC");
        assertEquals(romanos.get(2), "CCC");
        assertEquals(romanos.get(3), "CD");
        assertEquals(romanos.get(4), "D");
        assertEquals(romanos.get(5), "DC");
        assertEquals(romanos.get(6), "DCC");
        assertEquals(romanos.get(7), "DCCC");
        assertEquals(romanos.get(8), "CM");
        assertEquals(romanos.get(9), "MMMCCXXXIV");
    }
}
