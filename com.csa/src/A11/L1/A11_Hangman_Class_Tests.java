package A11.L1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class A11_Hangman_Class_Tests
{
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    @Test(timeout = 250)
    public void test1() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Hangman"));
            Method isVowel = classRef.getMethod("isVowel", char.class);
            Object check = classRef.getConstructor().newInstance();

            String chars = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ\"\'!?.,;:0987654321 <>()";
            boolean[] answers = new boolean[chars.length()];
            answers[0]=true;
            answers[4]=true;
            answers[8]=true;
            answers[14]=true;
            answers[20]=true;
            answers[25]=true;
            answers[29]=true;
            answers[33]=true;
            answers[39]=true;
            answers[45]=true;
            for(int x=0; x<chars.length(); x++)
            {
                if(answers[x])
                    Assert.assertTrue("isVowel("+chars.charAt(x)+") failed to produce true",(Boolean)isVowel.invoke(check,chars.charAt(x)));
                else
                    Assert.assertFalse("isVowel("+chars.charAt(x)+") failed to produce false",(Boolean)isVowel.invoke(check,chars.charAt(x)));

            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }


    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Hangman"));
            Method isPunctuation = classRef.getMethod("isPunctuation", char.class);
            Object check = classRef.getConstructor().newInstance();

            String chars = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ\"\'!?.,;:0987654321 <>()";

            for(int x=0; x<chars.length(); x++)
            {
                if(x>50 && x<59)
                    Assert.assertTrue("isPunctuation("+chars.charAt(x)+") failed to produce true",(Boolean)isPunctuation.invoke(check,chars.charAt(x)));
                else
                    Assert.assertFalse("isPunctuation("+chars.charAt(x)+") failed to produce false",(Boolean)isPunctuation.invoke(check,chars.charAt(x)));

            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Hangman"));
            Method isVowel = classRef.getMethod("isInSentence", char.class);
            String sentence="This is a test.";
            Object check = classRef.getConstructor(String.class).newInstance(sentence);

            String chars = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ\"\'!?.,;:0987654321 <>()";
            boolean[] answers = new boolean[chars.length()];
            answers[chars.indexOf("a")]=true;
            answers[chars.indexOf("A")]=true;
            answers[chars.indexOf("t")]=true;
            answers[chars.indexOf("T")]=true;
            answers[chars.indexOf("H")]=true;
            answers[chars.indexOf("h")]=true;
            answers[chars.indexOf("i")]=true;
            answers[chars.indexOf("I")]=true;
            answers[chars.indexOf("s")]=true;
            answers[chars.indexOf("S")]=true;
            answers[chars.indexOf("e")]=true;
            answers[chars.indexOf("E")]=true;
            answers[chars.indexOf(".")]=true;
            answers[chars.indexOf(" ")]=true;
            for(int x=0; x<chars.length(); x++)
            {
                if(answers[x])
                    Assert.assertTrue("isInSentence("+chars.charAt(x)+") failed to produce true when the sentence was "+sentence,(Boolean)isVowel.invoke(check,chars.charAt(x)));
                else
                    Assert.assertFalse("isInSentence("+chars.charAt(x)+") failed to produce true when the sentence was "+sentence,(Boolean)isVowel.invoke(check,chars.charAt(x)));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Hangman"));
            Method isVowel = classRef.getMethod("isInSentence", char.class);
            String sentence="Quizzes are fun to take!";
            Object check = classRef.getConstructor(String.class).newInstance(sentence);

            String chars = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ\"\'!?.,;:0987654321 <>()";
            boolean[] answers = new boolean[chars.length()];
            answers[chars.indexOf("q")]=true;
            answers[chars.indexOf("Q")]=true;
            answers[chars.indexOf("u")]=true;
            answers[chars.indexOf("U")]=true;
            answers[chars.indexOf("i")]=true;
            answers[chars.indexOf("I")]=true;
            answers[chars.indexOf("z")]=true;
            answers[chars.indexOf("Z")]=true;
            answers[chars.indexOf("e")]=true;
            answers[chars.indexOf("E")]=true;
            answers[chars.indexOf("s")]=true;
            answers[chars.indexOf("S")]=true;
            answers[chars.indexOf("a")]=true;
            answers[chars.indexOf("A")]=true;
            answers[chars.indexOf("r")]=true;
            answers[chars.indexOf("R")]=true;
            answers[chars.indexOf("f")]=true;
            answers[chars.indexOf("F")]=true;
            answers[chars.indexOf("n")]=true;
            answers[chars.indexOf("N")]=true;
            answers[chars.indexOf("t")]=true;
            answers[chars.indexOf("T")]=true;
            answers[chars.indexOf("o")]=true;
            answers[chars.indexOf("O")]=true;
            answers[chars.indexOf("k")]=true;
            answers[chars.indexOf("K")]=true;
            answers[chars.indexOf("!")]=true;
            answers[chars.indexOf(" ")]=true;
            for(int x=0; x<chars.length(); x++)
            {
                if(answers[x])
                    Assert.assertTrue("isInSentence("+chars.charAt(x)+") failed to produce true when the sentence was "+sentence,(Boolean)isVowel.invoke(check,chars.charAt(x)));
                else
                    Assert.assertFalse("isInSentence("+chars.charAt(x)+") failed to produce true when the sentence was "+sentence,(Boolean)isVowel.invoke(check,chars.charAt(x)));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // add guess and guesses left
    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Hangman"));
            Method addGuessedLetter = classRef.getMethod("addGuessedLetter", char.class);
            Method guessesLeft = classRef.getMethod("guessesLeft");
            String sentence="This is a test.";

            String chars = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ\"\'!?.,;:0987654321 <>()";
            ArrayList<Character> correctLetters = new ArrayList<>();
            correctLetters.add('a');
            correctLetters.add('t');
            correctLetters.add('h');
            correctLetters.add('i');
            correctLetters.add('s');
            correctLetters.add('e');

            ArrayList<Character> showNoneLetters = new ArrayList<>();
            showNoneLetters.add(' ');
            showNoneLetters.add('.');

            for(int t=0; t<20; t++) {
                Object check = classRef.getConstructor(String.class).newInstance(sentence);

                ArrayList<Character> guessed = new ArrayList<>();
                int left=6;
                String message = "when the sentence was \"" + sentence + "\" and the previous guesses were " + guessed;
                for (int x = 0; x < 10; x++) {

                    char letter = Character.toLowerCase(chars.charAt((int)(Math.random()*chars.length())));


                    if (correctLetters.contains(letter) && !guessed.contains(letter)) {
                        Assert.assertTrue("addGuessed(" + letter + ") failed to produce true "+message, (Boolean) addGuessedLetter.invoke(check, letter));
                    }
                    else {
                        Assert.assertFalse("addGuessed(" + letter + ") failed to produce false "+message, (Boolean) addGuessedLetter.invoke(check, letter));
                        left--;
                    }

                    if(!guessed.contains(letter))
                        guessed.add(letter);

                    message = "when the sentence was \"" + sentence + "\" and the previous guesses were " + guessed;

                    Assert.assertEquals("guessesLeft() failed to be correct "+message, left,((Integer)(guessesLeft.invoke(check))).intValue());

                    if(left==0)
                        break;

                }
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // add guess and guesses left
    @Test(timeout = 250)
    public void test6() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Hangman"));
            Method addGuessedLetter = classRef.getMethod("addGuessedLetter", char.class);
            Method guessesLeft = classRef.getMethod("guessesLeft");
            String sentence="Quizzes are fun to take!";

            String chars = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ\"\'!?.,;:0987654321 <>()";
            ArrayList<Character> correctLetters = new ArrayList<>();
            correctLetters.add('q');
            correctLetters.add('u');
            correctLetters.add('i');
            correctLetters.add('z');
            correctLetters.add('e');
            correctLetters.add('s');
            correctLetters.add('a');
            correctLetters.add('r');
            correctLetters.add('f');
            correctLetters.add('n');
            correctLetters.add('t');
            correctLetters.add('o');
            correctLetters.add('k');

            ArrayList<Character> showNoneLetters = new ArrayList<>();
            showNoneLetters.add(' ');
            showNoneLetters.add('!');

            for(int t=0; t<20; t++) {
                Object check = classRef.getConstructor(String.class).newInstance(sentence);

                ArrayList<Character> guessed = new ArrayList<>();
                int left=6;
                String message = "when the sentence was \"" + sentence + "\" and the previous guesses were " + guessed;
                for (int x = 0; x < 10; x++) {

                    char letter = Character.toLowerCase(chars.charAt((int)(Math.random()*chars.length())));


                    if (correctLetters.contains(letter) && !guessed.contains(letter)) {
                        Assert.assertTrue("addGuessed(" + letter + ") failed to produce true "+message, (Boolean) addGuessedLetter.invoke(check, letter));
                    }
                    else {
                        Assert.assertFalse("addGuessed(" + letter + ") failed to produce false "+message, (Boolean) addGuessedLetter.invoke(check, letter));
                        left--;
                    }

                    if(!guessed.contains(letter))
                        guessed.add(letter);

                    message = "when the sentence was \"" + sentence + "\" and the previous guesses were " + guessed;

                    Assert.assertEquals("guessesLeft() failed to be correct "+message, left,((Integer)(guessesLeft.invoke(check))).intValue());

                    if(left==0)
                        break;

                }
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // 2 wrong won tests
    @Test(timeout = 250)
    public void test7() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Hangman"));
            Method addGuessedLetter = classRef.getMethod("addGuessedLetter", char.class);
            Method won = classRef.getMethod("won");
            String sentence="Quizzes are fun to take!";
            Object check = classRef.getConstructor(String.class).newInstance(sentence);

            ArrayList<Character> guessed = new ArrayList<>();
            guessed.add('A');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('Q');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('u');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('i');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('z');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('x');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            Assert.assertFalse("won() failed to produce false when the sentence was \"" + sentence +
                    "\" and the previous guesses were " + guessed,(Boolean)won.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test8() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Hangman"));
            Method addGuessedLetter = classRef.getMethod("addGuessedLetter", char.class);
            Method won = classRef.getMethod("won");
            String sentence="tEstinG TeSTING! ! ?";
            Object check = classRef.getConstructor(String.class).newInstance(sentence);

            ArrayList<Character> guessed = new ArrayList<>();
            guessed.add('t');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('e');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('I');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('s');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('g');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            Assert.assertFalse("won() failed to produce false when the sentence was \"" + sentence +
                    "\" and the previous guesses were " + guessed,(Boolean)won.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // 2 wrong won tests
    @Test(timeout = 250)
    public void test9() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Hangman"));
            Method addGuessedLetter = classRef.getMethod("addGuessedLetter", char.class);
            Method won = classRef.getMethod("won");
            String sentence="Quizzes are fun to take!";
            Object check = classRef.getConstructor(String.class).newInstance(sentence);

            ArrayList<Character> guessed = new ArrayList<>();
            guessed.add('Q');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('x');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('I');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('u');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('z');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('y');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('E');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('R');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('A');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('M');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('f');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('N');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('K');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('s');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('t');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('o');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            Assert.assertTrue("won() failed to produce true when the sentence was \"" + sentence +
                    "\" and the previous guesses were " + guessed,(Boolean)won.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
    @Test(timeout = 250)
    public void test10() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Hangman"));
            Method addGuessedLetter = classRef.getMethod("addGuessedLetter", char.class);
            Method won = classRef.getMethod("won");
            String sentence="tEstinG TeSTING! ! ?";
            Object check = classRef.getConstructor(String.class).newInstance(sentence);

            ArrayList<Character> guessed = new ArrayList<>();
            guessed.add('t');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('e');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('I');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('s');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('g');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            guessed.add('n');
            addGuessedLetter.invoke(check, guessed.get(guessed.size()-1));
            Assert.assertTrue("won() failed to produce true when the sentence was \"" + sentence +
                    "\" and the previous guesses were " + guessed,(Boolean)won.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
