package Book03_ObjectOrientatedProgramming.Chapter06.ToStringMethod.OverridingToString;

public class TestToString2 {
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

    public String toString() {
        return "Employee["
                + this.firstName + " "
                + this.lastName + "]";
    }
}

