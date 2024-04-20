/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omwas
 */

public class parenthesis {

public static void main(String[] args) {
    // Question1
        // input parenthesis you would like to test
        String S = "";
        System.out.println(isvalid(S));
}
     public static boolean isvalid(String s) {
        int parenthesesCount = 0;
        int squareBracketsCount = 0;
        int curlyBracesCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(') {
                parenthesesCount++;
            } else if (currentChar == ')') {
                parenthesesCount--;
            }

            if (parenthesesCount < 0) {
                return false;
            }

            if (currentChar == '[') {
                squareBracketsCount++;
            } else if (currentChar == ']') {
                squareBracketsCount--;
            }
            if (squareBracketsCount < 0) {
                return false;
            } else if (currentChar == '{') {
                curlyBracesCount++;
            } else if (currentChar == '}') {
                curlyBracesCount--;
            }

            if (curlyBracesCount < 0) {
                return false;
            }

        }

        return parenthesesCount == 0
                && squareBracketsCount == 0
                && curlyBracesCount == 0;
    }

}
    

