package Lesson4;

public class Contacts {
    private final String firstName;
    private final String lastName;

    public Contacts (String fname, String lName)
    {
        this.firstName = fname;
        this.lastName = lName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
