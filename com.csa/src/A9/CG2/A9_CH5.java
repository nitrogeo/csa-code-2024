package A9.CG2;
/*
make text into char array subby
iterate thru char array until find a number of vowel
when find num or vow then replace that index with - or *
return subby
 */
public class A9_CH5 {
    public static String substitutions(String text) {
        char[] subby = text.toCharArray();
        if (text.equals("")) {
            return "";
        }
        for (int iter = 0; iter < subby.length; iter++) { // s2
            if ("0123456789".contains("" + subby[iter])) {
                subby[iter] = '-';
            }
            if ("aeiouAEIOU".contains("" + subby[iter])) {
                subby[iter] = '*';
            }
        }
        String subbi = new String(subby);
        return subbi;
    }
}
