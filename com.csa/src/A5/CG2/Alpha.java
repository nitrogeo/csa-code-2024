package A5.CG2;

public class Alpha {
    public static boolean isLetter(char character) {
        boolean isLetter = false;
        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
            isLetter = true;
        }
            else {
            isLetter = false;
        }
        return isLetter;
    }
}
