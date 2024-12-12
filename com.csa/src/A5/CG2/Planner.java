package A5.CG2;

public class Planner {
    public static boolean canParty(int studentAmt, int bdayAmt, int sliceAmt) {
        boolean canParty = false;
        if (sliceAmt - (studentAmt + ((studentAmt -= bdayAmt) * 2)) < 0) {
            canParty = false;
        }
        if (sliceAmt - (studentAmt + (bdayAmt * 2)) >= 0) {
            canParty = true;
        }
        return canParty;
    }
}
