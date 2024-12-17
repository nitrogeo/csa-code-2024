package A9.CG2;
/*
make var for substring and var for bool
make substring of text
check if texts ends with the substring

could use either two substrings or **one substring and one ends/startsWith**
tacocat was a good var name lol (i removed it to make the code simpler but still)
 */
public class A9_CH4 {
    public static boolean startAndEndMatch(String text) {
        if (text.length() < 3) {
            return false;
        }
        String threeLets = text.substring(0, 3);
        return text.toLowerCase().endsWith(threeLets.toLowerCase());
    }
}
