package A11.L1;

public class A11_Assignment {
    // attributes
    public static final int OTHER = 0;
    public static final int MINOR = 0;
    public static final int MAJOR = 0;

    private String assignmentName;
    private double grade;
    private int category;

    // constructors
    public A11_Assignment(String assignmentName, double grade, int category) {
        this.assignmentName = assignmentName;
        this.grade = grade;
        this.category = category;
    }

    // methods
    public int getCategory() {
        return category;
    }
    public double getGrade() {
        return grade;
    }
    public String getAssignmentName() {
        return assignmentName;
    }
    public void setCategory(int category) {
        this.category = category;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }
}
