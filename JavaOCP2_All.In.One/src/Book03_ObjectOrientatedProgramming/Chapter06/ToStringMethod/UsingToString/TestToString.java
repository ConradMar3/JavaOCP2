package Book03_ObjectOrientatedProgramming.Chapter06.ToStringMethod.UsingToString;

public class TestToString {
    public static void main(String[] args) {
        Employee emp = new Employee("Martinez",
                "Anthony");
        System.out.println(emp.toString());
    }
}

class Employee {
    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}

// Note: The hash code — in this case, 82ba41 — will undoubtedly be different on your system.
// My system - Employee@49e4cb85.