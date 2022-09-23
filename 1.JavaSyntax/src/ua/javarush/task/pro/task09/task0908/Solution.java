package ua.javarush.task.pro.task09.task0908;

/* 
Двійково-шістнадцятковий конвертер
*/

import java.util.regex.Pattern;

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює шістнадцятковому числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює двійковому числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        if (binaryNumber == null | Pattern.matches(".*[^0-1].*", binaryNumber)) {
            return "";
        }
        if (binaryNumber.length() % 4 != 0) {
            int addZeros = binaryNumber.length() % 4;
            for (int i = 0; i < addZeros; i++){
                binaryNumber = "0" + binaryNumber;
            }
        }

        int decimalNumber = 0;
        for (int j = 0; j < binaryNumber.length()/4; j++) {
            for (int i = 0, k = 3; i < 4; i++, k--) {
                int value = Character.getNumericValue(binaryNumber.charAt( (j*4) + i));
                decimalNumber += value * Math.pow(2, k);
            }
            hexNumber = hexNumber + HEX.charAt(decimalNumber);
            decimalNumber = 0;
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        if (hexNumber == null | !Pattern.matches(".*[0-9a-f].*", hexNumber)) {
            return "";
        }
        else {
            int decimalNumber = 0;
            for (int i = 0; i < hexNumber.length(); i++){
                decimalNumber = 16 * decimalNumber + HEX.indexOf(hexNumber.charAt(i));
            }
            while (decimalNumber != 0) {
                binaryNumber = decimalNumber % 2 + binaryNumber;
                decimalNumber = decimalNumber / 2;
            }
            return binaryNumber;
        }
    }
}
