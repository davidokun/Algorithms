package com.singletonapps.algorithms.characterCount;

import java.util.Scanner;

public class CharactersCount {

    /**
     * Given a String aabbccc, count the number of character and print it.
     * Example:
     * <p>
     * Input: aabbbc
     * Output: a2b3c1
     * <p>
     * If output.length > input.length then return input, otherwise print output.
     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        int count = 0;
        Character last = null;
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            Character currentChar = input.charAt(i);

            if (last == null || (currentChar.compareTo(last)) == 0) {
                count++;
                last = currentChar;
            }else {
                output.append(last).append(count);
                last = currentChar;
                count = 1;
            }

        }

        output.append(last).append(count);

        if (output.length() > input.length()) {
            System.out.println(input);
        } else {
            System.out.println(output);
        }



    }
}
