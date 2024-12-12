package A5.CG1;

public class Construction {
    public static boolean canCross (int bridgeCapacity, int truckWeight, int driverWeight, int loadWeight)
    {
        if (truckWeight + driverWeight + loadWeight <= bridgeCapacity)
            return true;
        else return false;
    }
}
