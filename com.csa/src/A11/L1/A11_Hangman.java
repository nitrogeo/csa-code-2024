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
    public String allcons = "qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXCVBNM";
    public String alllets = "qweryiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    public String allpuncs = "<>!,.?;:‘\"'";
    public String testpuncs = "!,.?;:‘\"'";
    private int rightGuesses;

    // constructors
    public A11_Hangman() {
        this.sentences.add("I am Iron Man.");
        this.sentences.add("I've played these games before!");
        this.sentences.add("Nah, I'mma do my own thing.");
        this.sentences.add("x");
        this.sentences.add("Give me an OREO! >:(");
        this.sentences.add("I bought a property in Egypt.");
        this.sentences.add("Zip! Oliver! What are you doing?!");
        this.sentences.add("Better to assimilate than explain.");
        this.sentences.add("This is the story of how we all became heroes.");
        this.sentences.add("Nah, I'd win.");
        wrongGuesses = 0;
        int random = (int)(Math.random() * 10 + 1);
        this.sentence = this.sentences.get(random - 1);
    }

    public A11_Hangman(String sentence) {
        this.sentence = sentence;
        wrongGuesses = 0;
    }


    // methods
    public boolean won() {
        /*
        iter thru sentence. if all current iters NOT in vowels or cons, return false; else true

        tully:
        get letter
        if conslist or vowellist or space or punc then count++ (if guessed it or space or punc)
        if cont = size then true
        */
        for (int iter = 0; iter < sentence.length(); iter++) {
            char letter = sentence.charAt(iter);
            /*char letterlow = sentence.toLowerCase(charAt(iter));
            char lettercap = sentence.toUpperCase(charAt(iter));*/

            // if the current char is a letter
            if (Character.isLetter(letter)) {
                char uplett = Character.toUpperCase(letter);
                // if not guessed
                if (((!vowels.contains(uplett)) && (!consonants.contains(uplett)))) {
                    // check if uppercase
                    // check if uppercase
                    /*letter = Character.toUpperCase(letter);
                    if (((!vowels.contains(letter)) && (!consonants.contains(letter)))) {
                        return false;
                    }*/
                    return false;
                }
            }
        }
        return true;
    }
    public void printSentence() {
        String printable = "";
        for (int iter = 0; iter < this.sentence.length(); iter++) {
            char letter = this.sentence.charAt(iter);
            char uplett = Character.toUpperCase(letter);
            if ((vowels.contains(uplett)) || ((consonants.contains(uplett))) || ((allpuncs.contains("" + letter))) ) {
                printable += letter;
            }
            else if (letter == ' ') {
                printable += " ";
            }
            else printable += "-";
        }
        System.out.print(printable);
    }
    public int guessesLeft() {
        return MAX_GUESSES - wrongGuesses;
    }
    public boolean addGuessedLetter(char c) {
        char lowc = Character.toLowerCase(c);
        char upc = Character.toUpperCase(c);
        boolean addcheck = true;

        /*
        3. Returns true if c has not been guessed yet and is contained in the sentence.
        2. The method returns false if c is a space, punctuation, or has already been guessed.
        1. When it is the first time a letter is guessed it is added to vowels or consonants.
        */

        if ((c == ' ') || (allpuncs.contains("" + c)) || (vowels.contains(upc)) || (consonants.contains(upc))) {
            wrongGuesses++;
            return false;
        }

        // if letter AND new guess,,, add c to guesses (vowls or cons)...
        if (allvowels.contains("" + c) && (!vowels.contains(upc))) {
            vowels.add(upc);
        }
        else if (allcons.contains("" + c) && (!consonants.contains(upc))) {
            consonants.add(upc);
        }

        // if invalid guess return false
        // punc not wrong guess but still wont be added to vowels or cons


        // if new right guess, return true
        else if (sentence.toLowerCase().contains("" + lowc)) {
            /*if (allvowels.contains("" + c)) {
                vowels.add(upc);
            } else consonants.add(upc);*/
            /*rightGuesses++;*/
            return true;
        }
        /*
        if (sentence.contains("" + Character.toUpperCase(lowc))) {
            *//*if (allvowels.contains("" + c)) {
                vowels.add(upc);
            } else consonants.add(upc);*//*
            *//*rightGuesses++;*//*
            return true;
        }*/

        // if new wrong guess!!!!!!!!!! return false
        /*wrongGuesses++;*/
        return addcheck;
    }
    public void printGuessed() {
        System.out.println("Guessed vowels: " + vowels);
        System.out.println("Guessed consonants: " + consonants);
        if (guessesLeft() == 1) {
            System.out.println("You have " + guessesLeft() + " wrong guess left.");
        }
        else System.out.println("You have " + guessesLeft() + " wrong guesses left.");
    }
    public boolean isPunctuation (char c) {
        if (testpuncs.contains("" + c)) {
            return true;
        }
        return false;
    }
    public boolean isInSentence(char c) {
        if (this.sentence.toLowerCase().contains("" + Character.toLowerCase(c)) || (this.sentence.contains("" + toUpperCase(c))) ) {
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
