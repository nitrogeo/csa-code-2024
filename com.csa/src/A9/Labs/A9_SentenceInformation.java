package A9.Labs;

import java.util.Scanner;

public class A9_SentenceInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your sentence: \n\n");
        String sent = scan.nextLine();

        System.out.println(wordCount(sent) + " words");
        System.out.println((consonantCount(sent) + vowelCount(sent)) + punctuationCount(sent) + wordCount(sent) - 1 + " characters");
        System.out.println(vowelCount(sent) + " vowels");
        System.out.println(consonantCount(sent) + " consonants");
        System.out.println(punctuationCount(sent) + " punctuation characters");

        System.out.println();
    }
    public static boolean isVowel(char character) {
        boolean vowelChk;
        String vowels = "aeiouAEIOU";
        if (vowels.contains("" + character)) {
            vowelChk = true;
        }
        else vowelChk = false;
        return vowelChk;
    }
    public static boolean isConsonant(char character) {
        boolean consChk;
        String cons = "qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXCVBNM";
        if (cons.contains("" + character)) {
            consChk = true;
        }
        else consChk = false;
        return consChk;
    }
    public static boolean isPunctuation(char character) {
        boolean puncCheck;
        String puncs = "\'!,.?;:\"";
        if (puncs.contains("" + character)) {
            puncCheck = true;
        }
        else puncCheck = false;
        return puncCheck;
    }

    // counts *******************************************************************************

    public static int consonantCount(String text) {
        int totalcons = 0;
        String cons = "qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXCVBNM";
        for(int iter = 0; iter < text.length(); iter++){
            if (cons.contains("" + text.charAt(iter))) {
                totalcons++;
            }
        }
        return totalcons;
    }
    public static int vowelCount(String text) {
        int totalvows = 0;
        String vowels = "aeiouAEIOU";
        for(int iter = 0; iter < text.length(); iter++){
            if (vowels.contains("" + text.charAt(iter))) {
                totalvows++;
            }
        }
        return totalvows;
    }
    public static int punctuationCount(String text) {
        // iter thru entire text and add to var each time one found as a match - silly me forgor its the same as vowel and cons count
        String puncs = "\'!,.?;:\"";
        int totalpuncs = 0;
        for (int iter = 0; iter < text.length(); iter++) {
            if (puncs.contains("" + text.charAt(iter))) {
                totalpuncs++;
            }
        }
        return totalpuncs;
    }
    public static int wordCount(String text) {
        // split text by spaces and return array length
        int totalwords = 0;
        String[] text2 = text.split(" ");
        totalwords = text2.length;
        return totalwords;
    }
}
