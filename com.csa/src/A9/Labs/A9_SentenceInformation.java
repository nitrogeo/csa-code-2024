package A9.Labs;

import java.util.Scanner;

public class A9_SentenceInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your sentence:");
        String sent = scan.nextLine();
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
        String vowels = "aeiouAEIOU";
        if (!vowels.contains("" + character)) {
            consChk = true;
        }
        else consChk = false;
        return consChk;
    }
    public static boolean isPunctuation(char character) {
        boolean puncCheck;
        String puncs = "!,.?;:";
        if (!puncs.contains("" + character)) {
            puncCheck = true;
        }
        else puncCheck = false;
        return puncCheck;
    }
    public static int consonantCount(String text) {
        int totalcons = 0;
        String vowels = "aeiouAEIOU";
        for(int iter = 0; iter < text.length(); iter++){
            if (!vowels.contains("" + text.charAt(iter))) {
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
    public static int wordCount(String text) {
        // split text by spaces and return array length
        int totalwords = 0;
        String vowels = "aeiouAEIOU";
        for(int iter = 0; iter < text.length(); iter++){
            if (vowels.contains("" + text.charAt(iter))) {
                totalwords++;
            }
        }
        return totalwords;
    }
}
