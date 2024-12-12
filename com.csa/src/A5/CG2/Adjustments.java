package A5.CG2;

public class Adjustments {
    public static int roundedSum(int number1, int number2, int number3)
    {
        int sum = number1 + number2 + number3;
        int testSum = sum%10; // if sum is 53 then test sum is (53 / 10 = 5 r3) and 3 is returned. this gives u the ones place
        int roundedSum = 0;
        if (testSum < 5)
            roundedSum = sum - testSum;
        else if (testSum >= 5) // if sum is 57 then test sum is (57 / 10 = 5 r7) and 7 is returned
            roundedSum = sum + (10 - testSum);
            /* sum = sum - testSum + 10; */
        return roundedSum;
    }
}

/* div sum by 10 - make it an int - subtract int from varible - if its < 0.5 then take original varible and div by 10, make it an int and multiply the int by 10
53 / 10 = 5.3; (int)5.3 = 5; 5.3 - 5 = 0.3; 0.3 < 0.5 so 53 / 10 = 5.3; 5.3(int) = 5; 5 x 10 = 50
 */
