package lab9;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private Integer age;
    private transient String email; //transient означает что данное поле не будет передоваться для сериализации

    public Student(String firstName, String lastName, Integer age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "lab9.Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}