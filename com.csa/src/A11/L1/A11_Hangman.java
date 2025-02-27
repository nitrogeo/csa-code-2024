package A11.L1;

import java.util.ArrayList;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class A11_Hangman {
    // attributes
    public static final int MAX_GUESSES = 6;
    // non public final ones
    private int wrongGuesses;
    private ArrayList<String> sentences = new ArrayList<>();
    private String sentence;
    private ArrayList<Character> vowels = new ArrayList<>();;
    private ArrayList<Character> consonants = new ArrayList<>();;

    public String allvowels = "aeiouAEIOU";
    public String allcons = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    public String allpuncs = "!,.?;:‘\"\'";

    // constructors
    public A11_Hangman() {
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
        this.sentence = this.sentences.get(random);
    }

    public A11_Hangman(String sentence) {
        this.sentence = sentence;
        wrongGuesses = 0;
    }


    // methods
    public boolean won() {
        if ((allvowels.contains("" + sentence)) || (allcons.contains("" + sentence))) {
            return true;
        }
        return false;
    }
    public void printSentence() {
        String printable = "";
        for (int iter = 0; iter < this.sentence.length(); iter++) {
            if ((vowels.contains(this.sentence.charAt(iter))) || ((consonants.contains(this.sentence.charAt(iter)))) || ((allpuncs.contains("" + this.sentence.charAt(iter)))) ) {
                printable += this.sentence.charAt(iter);
            }
            else if (this.sentence.charAt(iter) == ' ') {
                printable += " ";
            }
            else printable += "-";
        }
    }
    public int guessesLeft() {
        return MAX_GUESSES - wrongGuesses;
    }
    public boolean addGuessedLetter(char c) {
        if (((vowels.contains(c)) || (consonants.contains(c))) && (allpuncs.contains("" + c))) {
            return true;
        }
        return false;
    }
    public void printGuessed() {
        System.out.println("Guessed vowels: " + vowels);
        System.out.println("Guessed consonants: " + consonants);
        System.out.println("You have " + guessesLeft() + "wrong guesses left.");
    }
    public boolean isPunctuation (char c) {
        if (allpuncs.contains("" + c)) {
            return true;
        }
        return false;
    }
    public boolean isInSentence(char c) {
        if (this.sentence.contains("" + toLowerCase(c)) || (this.sentence.contains("" + toUpperCase(c))) ) {
            return true;
        }
        return false;
    }
    public boolean isVowel(char c) {
        if (allvowels.contains("" + c)) {
            return true;
        }
        return false;
    }
}
