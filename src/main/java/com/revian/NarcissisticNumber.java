package com.revian;

import java.text.NumberFormat;
import java.text.ParsePosition;

public class NarcissisticNumber {
    public boolean checkNarcissistic(String number) {
        boolean isNarcissisticNumber = false;
        Double _sum = 0.0;

        if (checkIfInputIsNumber(number) && Integer.parseInt(number) >= 0) {
            char[] splitNumberString = number.toCharArray();

            for (char character : splitNumberString) {
                _sum += Math.pow(Double.parseDouble(""+character), 3);
            }

            if (_sum == Double.parseDouble(number))
                isNarcissisticNumber = true;
        }


        return isNarcissisticNumber;
    }

    private boolean checkIfInputIsNumber(String number) {
        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(number, pos);
        return (number.length() == pos.getIndex());
    }
}
