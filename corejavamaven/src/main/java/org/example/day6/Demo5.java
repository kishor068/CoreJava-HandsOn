package org.example.day6;
//Accept a email and check if email is valid or not using Regex.
//Check if the third character of a string is numeric.

public class Demo5 {
    public static void main(String[] args) {
        String s1="abH3333333ello";
        s1=s1.toUpperCase();
        System.out.println(s1);

        // ^ start of string and also stands for negation
        // . any character
        // {value} number of times to be repeated/can occur
        // \\d or [0-9]  digits
        // * character of any length

        boolean charDigit=s1.matches("^.{2}\\d.*");
        System.out.println(charDigit);
//        boolean charDigit2=s1.matches("^.{2}[0-9].*");
        boolean charDigits1=s1.matches("^.[^0-9]*"); //No digits.
        System.out.println(charDigits1);

    }
}
