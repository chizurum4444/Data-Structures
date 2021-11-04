package hashing;

public class Student {
    private String sid;
    private String firstName;
    private String lastName;
    private float gpa;

    public Student(String sid, String firstName, String lastName, float gpa) {
        this.sid = sid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getKey() {
        return this.sid;
    }

    public String toString() {
        return firstName + " " + lastName + " (" + sid + ", " + gpa + ")";
    }
}
