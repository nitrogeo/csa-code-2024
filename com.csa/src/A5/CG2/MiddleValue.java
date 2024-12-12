package A5.CG2;

public class MiddleValue {
    public static int middleValue(int number1, int number2, int number3) {
        int middleValue = 0;
        if (number1 > number2 && number1 < number3) {
            middleValue = number1;
        }
        else if (number2 > number1 && number2 < number3) {
            middleValue = number2;
        }
        else if (number3 > number1 && number3 < number2) {
            middleValue = number3;
        }
        else if (number1 < number2 && number1 > number3) {
            middleValue = number1;
        }
        else if (number3 < number1 && number3 > number2) {
            middleValue = number3;
        }
        else if (number2 < number1 && number2 > number3) {
            middleValue = number2;
        }
        else {
            middleValue = - 1;
        }
    return middleValue;
    }
}

/* THIS IS FOR ROUNDIGN AVERAGE AHAHGAHAGAHA
public class MiddleValue {
    public static int middleValue(int number1, int number2, int number3)
    {
        int avg = (number1 + number2 + number3) / 3; // sum is now avg
        int onesPlace = avg%10; // if sum is 53 then test sum is (53 / 10 = 5 r3) and 3 is returned. this gives u the ones place - testSum is now ones place
        int middleValue = 0;
        if (onesPlace < 5)
            middleValue = avg - onesPlace; // if test sum ones place < 5 (3 for 53), then 53 - 3 = 50 DONE
        else if (onesPlace >= 5) // if sum is 57 then test sum is (57 / 10 = 5 r7) and 7 is returned
            // sum = sum - testSum + 10; // total = total - ones + 10; 53 = 53 - 3 + 10 = 60 - EQUATIONS GIVE SAME RESULT
            middleValue = avg + (10 - onesPlace); // if test sum ones place is >= than 5 (7 for 57), then 57 + (10 - 7 = *3*) = 50 DONE
        return middleValue;
    }
} */


