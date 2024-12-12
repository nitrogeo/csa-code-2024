package A5.CG1;

public class AgeTest {
    public static String canIDrive (int age)
    {
        if (age >= 16) return "You are old enough to drive.";
        else {
            return "You can drive in " + (16 - age) + " year(s).";
        }
    }
}

