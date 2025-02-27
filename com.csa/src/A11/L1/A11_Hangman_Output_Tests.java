package A11.L1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class A11_Hangman_Output_Tests
{
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    public TestingOutputStream testingOutputStream = new TestingOutputStream();

    @Before
    public void setup()
    {
        System.setOut(testingOutputStream);

    }

    public String unifyLineSeperators(String line)
    {
        return line.replaceAll("\\n|\\r\\n", System.getProperty("line.separator")).trim();
    }

    @Test(timeout = 250)
    public void testIO1() throws Exception{
        String input =  "1\n" +
                "I think Computer Science is fun!\n" +
                "i\n" +
                "a\n" +
                "u\n" +
                "o\n" +
                "e\n" +
                "r\n" +
                "s\n" +
                "t\n" +
                "u\n" +
                "v\n" +
                "f\n" +
                "n\n" +
                "x\n" +
                "z\n" +
                "h\n" +
                "k\n" +
                "c\n" +
                "m\n" +
                "q";

        String expected =   "-Menu-\n" +
                "1. Enter Sentence\n" +
                "2. Random Sentence\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter a sentence:\n" +
                "\n" +
                "- ----- -------- ------- -- ---!\n" +
                "\n" +
                "Guessed vowels: []\n" +
                "Guessed consonants: []\n" +
                "You have 6 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "I --i-- -------- --i---- i- ---!\n" +
                "\n" +
                "Guessed vowels: [I]\n" +
                "Guessed consonants: []\n" +
                "You have 6 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Incorrect guess.\n" +
                "\n" +
                "I --i-- -------- --i---- i- ---!\n" +
                "\n" +
                "Guessed vowels: [I, A]\n" +
                "Guessed consonants: []\n" +
                "You have 5 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "I --i-- ----u--- --i---- i- -u-!\n" +
                "\n" +
                "Guessed vowels: [I, A, U]\n" +
                "Guessed consonants: []\n" +
                "You have 5 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "I --i-- -o--u--- --i---- i- -u-!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O]\n" +
                "Guessed consonants: []\n" +
                "You have 5 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "I --i-- -o--u-e- --ie--e i- -u-!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O, E]\n" +
                "Guessed consonants: []\n" +
                "You have 5 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "I --i-- -o--u-er --ie--e i- -u-!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O, E]\n" +
                "Guessed consonants: [R]\n" +
                "You have 5 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "I --i-- -o--u-er S-ie--e is -u-!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O, E]\n" +
                "Guessed consonants: [R, S]\n" +
                "You have 5 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "I t-i-- -o--uter S-ie--e is -u-!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O, E]\n" +
                "Guessed consonants: [R, S, T]\n" +
                "You have 5 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Incorrect guess.\n" +
                "\n" +
                "I t-i-- -o--uter S-ie--e is -u-!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O, E]\n" +
                "Guessed consonants: [R, S, T]\n" +
                "You have 4 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Incorrect guess.\n" +
                "\n" +
                "I t-i-- -o--uter S-ie--e is -u-!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O, E]\n" +
                "Guessed consonants: [R, S, T, V]\n" +
                "You have 3 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "I t-i-- -o--uter S-ie--e is fu-!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O, E]\n" +
                "Guessed consonants: [R, S, T, V, F]\n" +
                "You have 3 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "I t-in- -o--uter S-ien-e is fun!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O, E]\n" +
                "Guessed consonants: [R, S, T, V, F, N]\n" +
                "You have 3 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Incorrect guess.\n" +
                "\n" +
                "I t-in- -o--uter S-ien-e is fun!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O, E]\n" +
                "Guessed consonants: [R, S, T, V, F, N, X]\n" +
                "You have 2 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Incorrect guess.\n" +
                "\n" +
                "I t-in- -o--uter S-ien-e is fun!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O, E]\n" +
                "Guessed consonants: [R, S, T, V, F, N, X, Z]\n" +
                "You have 1 wrong guess left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "I thin- -o--uter S-ien-e is fun!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O, E]\n" +
                "Guessed consonants: [R, S, T, V, F, N, X, Z, H]\n" +
                "You have 1 wrong guess left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "I think -o--uter S-ien-e is fun!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O, E]\n" +
                "Guessed consonants: [R, S, T, V, F, N, X, Z, H, K]\n" +
                "You have 1 wrong guess left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "I think Co--uter Science is fun!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O, E]\n" +
                "Guessed consonants: [R, S, T, V, F, N, X, Z, H, K, C]\n" +
                "You have 1 wrong guess left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "I think Com-uter Science is fun!\n" +
                "\n" +
                "Guessed vowels: [I, A, U, O, E]\n" +
                "Guessed consonants: [R, S, T, V, F, N, X, Z, H, K, C, M]\n" +
                "You have 1 wrong guess left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Incorrect guess.\n" +
                "\n" +
                "I think Com-uter Science is fun!\n" +
                "\n" +
                "You failed to save this man.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A11_HangmanMain"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(unifyLineSeperators(expected), unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void testIO2() throws Exception{
        String input =  "1\n" +
                "Bob is cool!\n" +
                "b\n" +
                "b\n" +
                "a\n" +
                "h\n" +
                "o\n" +
                "i\n" +
                "c\n" +
                "s\n" +
                "w\n" +
                "l\n";

        String expected =   "-Menu-\n" +
                "1. Enter Sentence\n" +
                "2. Random Sentence\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter a sentence:\n" +
                "\n" +
                "--- -- ----!\n" +
                "\n" +
                "Guessed vowels: []\n" +
                "Guessed consonants: []\n" +
                "You have 6 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "B-b -- ----!\n" +
                "\n" +
                "Guessed vowels: []\n" +
                "Guessed consonants: [B]\n" +
                "You have 6 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Incorrect guess.\n" +
                "\n" +
                "B-b -- ----!\n" +
                "\n" +
                "Guessed vowels: []\n" +
                "Guessed consonants: [B]\n" +
                "You have 5 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Incorrect guess.\n" +
                "\n" +
                "B-b -- ----!\n" +
                "\n" +
                "Guessed vowels: [A]\n" +
                "Guessed consonants: [B]\n" +
                "You have 4 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Incorrect guess.\n" +
                "\n" +
                "B-b -- ----!\n" +
                "\n" +
                "Guessed vowels: [A]\n" +
                "Guessed consonants: [B, H]\n" +
                "You have 3 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Bob -- -oo-!\n" +
                "\n" +
                "Guessed vowels: [A, O]\n" +
                "Guessed consonants: [B, H]\n" +
                "You have 3 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Bob i- -oo-!\n" +
                "\n" +
                "Guessed vowels: [A, O, I]\n" +
                "Guessed consonants: [B, H]\n" +
                "You have 3 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Bob i- coo-!\n" +
                "\n" +
                "Guessed vowels: [A, O, I]\n" +
                "Guessed consonants: [B, H, C]\n" +
                "You have 3 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Bob is coo-!\n" +
                "\n" +
                "Guessed vowels: [A, O, I]\n" +
                "Guessed consonants: [B, H, C, S]\n" +
                "You have 3 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Incorrect guess.\n" +
                "\n" +
                "Bob is coo-!\n" +
                "\n" +
                "Guessed vowels: [A, O, I]\n" +
                "Guessed consonants: [B, H, C, S, W]\n" +
                "You have 2 wrong guesses left.\n" +
                "Enter your guess:\n" +
                "\n" +
                "Bob is cool!\n" +
                "\n" +
                "You saved this man with 2 wrong guesses still left.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A11_HangmanMain"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(unifyLineSeperators(expected), unifyLineSeperators(o.toString()));
    }
}
