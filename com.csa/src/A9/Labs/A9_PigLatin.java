package A9.Labs;

import java.util.Scanner;

public class A9_PigLatin {
    // move 1st part of word until vowel THEN add ay to end of each words after the 1st letter BUT: ********************************
    // y is vowel if not first letter and is the first "vowel", get to it before another vowel

    // weekend days dont count as late in csa
    // prac sets done at home

    /* Basic Rules **********************************************************************************************
    if the word starts with a consonant then move the leading consonants to the end of the word and then add “ay” to the end of the word
    If the word starts with a vowel add “way” to the end of the word

    Special Case Rules
    When a y is the first letter treat it as a consonant. Treat all y’s after the first letter of a word as vowels
    If the word's first vowel is a ‘u’ and the letter before it is a ‘q’, move everything up to and including the u to the end of the word and then add “ay”
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence:\n\n");
        String sent = scan.nextLine();

        System.out.println("Sentence in pig latin: " + convertSentence(sent));
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
    public static String convertSingleWord(String word) {
        String pigword = "";
        int totalcons = 0;
        // cons movement + "ay" to end
        String cons = "qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXCVBNM";
        if (cons.contains("" + word.charAt(0))) {
            totalcons++;
            for(int iter = 0; iter < word.length(); iter++){
                // qu check ONLY:
                // if the current letter (iter) isnt the last letter AND its q AND the letter after it is u, totalcons is 2 and "qu" is moved, not just "q"
                if (iter < word.length() - 1 && word.charAt(iter) == 'q' && word.charAt(iter + 1) == 'u') {
                    totalcons = iter + 2;
                    break;
                }
                // y check + cons check (stops at vowel)
                // if iter is after the first letter and iter is y OR if iter is a vowel, totalcons is INCREASED by being matched to iter esactly (totalcons++ doesnt work)
                else if (iter > 0 && word.charAt(iter) == 'y'|| isVowel(word.charAt(iter))){
                    totalcons = iter;
                    break;
                }
                // remove first iters: substring starting at totalcons' index and move totalcons indexes to end of word with concat
            }
            pigword = word.substring(totalcons);
            // totalcons MUST BE THE LETTER AFTER THE FIRST VOWEL SO THE LAST CONSONANT before the VOWEL is MOVED
            pigword += word.substring(0, totalcons) + "ay";
            }
        // IF FIRST LETTER IS VOWEL = just add "way" to end
        else {
            pigword = word + "way";
        }
        return pigword;
    }
    public static String convertSentence(String sentence) {
        // split sentence at spaces and make into array. then convert each word in the array, combine them into a sentence, and add spaces between them
        String pigsenten = "";
        String[] arraysenten = sentence.split(" ");
        for (String iter: arraysenten) {
            pigsenten += convertSingleWord(iter) + " ";
        }
        return pigsenten;
    }
}
