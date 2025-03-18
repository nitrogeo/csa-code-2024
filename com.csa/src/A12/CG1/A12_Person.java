package A12.CG1;

public class A12_Person
{
    private String firstName;
    private String lastName;

    public A12_Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof A12_Person)
        {
            A12_Person p = (A12_Person)obj;
            return lastName.equals(p.lastName) && firstName.equals(p.firstName);
        }
        else
            return false;
    }

    @Override
    public String toString()
    {
        return lastName+", "+firstName;
    }
}
