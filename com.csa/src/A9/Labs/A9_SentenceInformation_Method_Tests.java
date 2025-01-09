package A9.Labs;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A9_SentenceInformation_Method_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A9_SentenceInformation"));
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
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A9_SentenceInformation"));
            Method consonantCount = classRef.getMethod("consonantCount", String.class);
            Object check = classRef.getConstructor().newInstance();

            String[] sentences = {"The old clock in the corner chimed midnight, echoing through the empty room.",
                    "She found a tiny, shimmering stone on the beach that seemed to glow in the sunlight.",
                    "As the rain fell softly, he curled up with a book and a steaming cup of tea.",
                    "The cat watched the birds from the windowsill, tail flicking with excitement.",
                    "In the distance, the mountains loomed majestically under a blanket of clouds.",
                    "A melody drifted through the air, carried by the gentle breeze of the evening.",
                    "The garden was a riot of colors, with flowers blooming in every possible hue.",
                    "He stumbled upon an old photograph that sparked a flood of forgotten memories.",
                    "Under the starry sky, they shared dreams and whispered secrets until dawn.",
                    "The aroma of freshly baked bread wafted through the house, inviting everyone to the kitchen."};

            int[] answers={42,43,35,44,39,39,38,41,43,47};

            for(int x=0; x<10; x++)
            {

                Assert.assertEquals("consonantCount("+sentences[x]+") failed to produce the correct result"
                        ,answers[x],consonantCount.invoke(check,sentences[x]));

            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A9_SentenceInformation"));
            Method vowelCount = classRef.getMethod("vowelCount", String.class);
            Object check = classRef.getConstructor().newInstance();

            String[] sentences = {"The old clock in the corner chimed midnight, echoing through the empty room.",
                    "She found a tiny, shimmering stone on the beach that seemed to glow in the sunlight.",
                    "As the rain fell softly, he curled up with a book and a steaming cup of tea.",
                    "The cat watched the birds from the windowsill, tail flicking with excitement.",
                    "In the distance, the mountains loomed majestically under a blanket of clouds.",
                    "A melody drifted through the air, carried by the gentle breeze of the evening.",
                    "The garden was a riot of colors, with flowers blooming in every possible hue.",
                    "He stumbled upon an old photograph that sparked a flood of forgotten memories.",
                    "Under the starry sky, they shared dreams and whispered secrets until dawn.",
                    "The aroma of freshly baked bread wafted through the house, inviting everyone to the kitchen."};

            int[] answers={20,24,23,20,25,24,24,24,18,29};

            for(int x=0; x<10; x++)
            {

                Assert.assertEquals("vowelCount("+sentences[x]+") failed to produce the correct result"
                        ,answers[x],vowelCount.invoke(check,sentences[x]));

            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test6() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A9_SentenceInformation"));
            Method punctuationCount = classRef.getMethod("punctuationCount", String.class);
            Object check = classRef.getConstructor().newInstance();

            String[] sentences = {"The old clock in the corner chimed? midnight, echoing through the empty room.",
                    "She found a tiny, shimmering stone on the beach: that seemed to glow in the sunlight.",
                    "As the rain fell softly, he curled up with a book' and a steaming cup of tea.''",
                    "The cat watched the birds from the windowsill, tail flicking with excitement.",
                    "In the distance, the mountains loomed majestically, under a blanket of clouds.:",
                    "A melody drifted through the air, carried by the gentle breeze of the evening.",
                    "The garden was a riot of colors, with! flowers blooming in every possible hue.",
                    "He stumbled upon an old photograph that sparked a flood of forgotten memories.",
                    "??Under the starry sky, they shared dreams and whispered secrets until dawn.",
                    "The aroma of freshly baked bread wafted through! the house, inviting everyone to the kitchen."};

            int[] answers={3,3,5,2,4,2,3,1,4,3};

            for(int x=0; x<10; x++)
            {

                Assert.assertEquals("punctuationCount("+sentences[x]+") failed to produce the correct result"
                        ,answers[x],punctuationCount.invoke(check,sentences[x]));

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
            Class<?> classRef = Class.forName(generateClassName("A9_SentenceInformation"));
            Method isConsonant = classRef.getMethod("isConsonant", char.class);
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
                if(!answers[x] && x<51)
                    Assert.assertTrue("isConsonant("+chars.charAt(x)+") failed to produce the correct result",(Boolean)isConsonant.invoke(check,chars.charAt(x)));
                else
                    Assert.assertFalse("isConsonant("+chars.charAt(x)+") failed to produce the correct result",(Boolean)isConsonant.invoke(check,chars.charAt(x)));

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
            Class<?> classRef = Class.forName(generateClassName("A9_SentenceInformation"));
            Method isPunctuation = classRef.getMethod("isPunctuation", char.class);
            Object check = classRef.getConstructor().newInstance();

            String chars = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ\"\'!?.,;:0987654321 <>()";

            for(int x=0; x<chars.length(); x++)
            {
                if(x>50 && x<59)
                    Assert.assertTrue("isPunctuation("+chars.charAt(x)+") failed to produce the correct result",(Boolean)isPunctuation.invoke(check,chars.charAt(x)));
                else
                    Assert.assertFalse("isPunctuation("+chars.charAt(x)+") failed to produce the correct result",(Boolean)isPunctuation.invoke(check,chars.charAt(x)));

            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }


}
