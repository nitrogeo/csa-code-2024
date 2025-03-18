package A12.CG1;

// done 10:38pm 3.17

public class A12_Student extends A12.CG1.A12_Person {
    // attributes
    public static int id;

    // constructors
    
    public A12_Student(String firstName, String lastName, int id) {
        super(firstName, lastName);

        this.id = id;
    }

    // methods
    public int getID() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof A12_Student) {
            // cast to a12
            A12_Student student = (A12_Student) o;

            return super.equals(o) && student.getFirstName().equals(((A12_Student) o).getFirstName()) && student.getLastName().equals(((A12_Student) o).getLastName());
        }
        else {
            return false;
        }
    }
    public String toString() {
        return (id + " - " + getLastName() + ", " + getFirstName());
    }
}
