package A9.Labs;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A9_PigLatin_Method_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A9_PigLatin"));
            Method convertSingleWord = classRef.getMethod("convertSingleWord", String.class);
            Object check = classRef.getConstructor().newInstance();

            String[] words = {"bob", "joe", "string", "lunch", "a", "i", "unicorn", "snake", "ghost",
                    "machine", "school", "buy", "ignite", "apple", "out",
                    "people", "treat", "try","being",
                    "night", "knight", "yours", "popping", "style", "cycle"};
            String[] answers = {"obbay", "oejay", "ingstray", "unchlay", "away", "iway", "unicornway", "akesnay", "ostghay",
                    "achinemay", "oolschay", "uybay", "igniteway", "appleway", "outway",
                    "eoplepay", "eattray", "ytray","eingbay",
                    "ightnay", "ightknay", "oursyay", "oppingpay",  "ylestay","yclecay"};
            for(int x=0; x<words.length; x++)
                Assert.assertEquals("convertSingleWord("+words[x]+") failed to produce the correct result",answers[x],convertSingleWord.invoke(check,words[x]));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A9_PigLatin"));
            Method isVowel = classRef.getMethod("isVowel", char.class);
            Object check = classRef.getConstructor().newInstance();

            String chars = "abcdefghijklmnopqrstuvxyz\"\'!?.,;:0987654321 <>()";
            boolean[] answers = new boolean[chars.length()];
            answers['a'-'a']=true;
            answers['e'-'a']=true;
            answers['i'-'a']=true;
            answers['o'-'a']=true;
            answers['u'-'a']=true;
            for(int x=0; x<chars.length(); x++)
            {
                if(answers[x])
                    Assert.assertTrue("isVowel("+chars.charAt(x)+") failed to produce the correct result",(Boolean)isVowel.invoke(check,chars.charAt(x)));
                else
                    Assert.assertFalse("isVowel("+chars.charAt(x)+") failed to produce the correct result",(Boolean)isVowel.invoke(check,chars.charAt(x)));

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
            Class<?> classRef = Class.forName(generateClassName("A9_PigLatin"));
            Method convertSentence = classRef.getMethod("convertSentence", String.class);
            Object check = classRef.getConstructor().newInstance();

            String[] sentences = {"bob likes cheese", "the kite needs a string", "please do not jump on the bed",
                    "snakes are in the water", "jumping is fun", "you should come with us",
                    "bats are in the trees", "this is a longer sentence that we are testing your program with"};
            String[] answers = {"obbay ikeslay eesechay", "ethay itekay eedsnay away ingstray", "easeplay oday otnay umpjay onway ethay edbay",
                    "akessnay areway inway ethay aterway", "umpingjay isway unfay", "ouyay ouldshay omecay ithway usway",
                    "atsbay areway inway ethay eestray", "isthay isway away ongerlay entencesay atthay eway areway estingtay ouryay ogrampray ithway"};
            for(int x = 0; x<sentences.length; x++)
                Assert.assertEquals("convertSentence("+sentences[x]+") failed to produce the correct result",answers[x],((String)convertSentence.invoke(check,sentences[x])).trim());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
