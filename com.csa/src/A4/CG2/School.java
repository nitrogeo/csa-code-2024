package A4.CG2;

public class School {
    /* this isnt code just psudocode */
    /* semesterGrade = (term1+term2+term3)/3*.85 + final*.15 */
    /* --- */
    /* @param semesterGrade = the semester grade the student wants to get */
    /* @return fin = the grade needed on the final to get the desired grade */
    /* final in the equation should be returned */
    public static double finalGrade(double term1, double term2, double term3, double semesterGrade)
    {
        double fin = (semesterGrade - ((1 - 0.15) * ((term1 + term2 + term3)/3))) / 0.15;
        return fin;
    }
}
