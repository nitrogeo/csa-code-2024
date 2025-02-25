/*
package A11.L1;

import java.util.ArrayList;

public class A11_HangmanMain {
    // attributes
    public static final int MAX_GUESSES = 6;
    // non public final ones
    private int wrongGuesses;
    private ArrayList<String> sentences;
    private String sentence;
    private ArrayList<Character> vowels;
    private ArrayList<Character> consonants;

    public String allvowels = "AEIOU";
    public String allcons = "QWERTYUIOPASDFGHJKLZXCVBNM";
    public String allpuncs = " ,<.>/?;:'\"[{]}\\|!@#$%^&*()-_=+`~";

    // constructors
    void A11_Hangman() {
        this.sentences.add("I am Iron Man.");
        this.sentences.add("I've played these games before!");
        this.sentences.add("Nah, I'mma do my own thing.");
        this.sentences.add("x");
        this.sentences.add("Check Steam.");
        this.sentences.add("I bought a property in Egypt.");
        this.sentences.add("Arc on Windows begins today.");
        this.sentences.add("Better to assimilate than explain.");
        this.sentences.add("You can be a hero too, kid.");
        this.sentences.add("Nah, I'd win.");
        wrongGuesses = 0;
        int random = (int)(Math.random() * 10 + 1);
        */
/*this.sentence = this.sentence.get(random);*//*

    }
    */
/*void A11_Hangman(String sentence) {
         = sentence;
        wrongGuesses = 0;
    }*//*


    // methods
    boolean won() {
        if ((allvowels.contains("" + sentence)) || (allcons.contains("" + sentence))) {
            return true;
        }
        return false;
    }
    void printSentence() {

    }
    int guessesLeft() {
        return MAX_GUESSES - wrongGuesses;
    }
    boolean addGuessedLetter(char c) {
        if ((vowels.contains(c)) || (consonants.contains(c)) && (allpuncs.contains())) {
            return true;
        }
    }
    void printGuessed() {

    }
    boolean isPunctuation (char c) {

    }
    boolean isInSentence(char c) {

    }
    boolean isVowel(char c) {

    }
}
*/
