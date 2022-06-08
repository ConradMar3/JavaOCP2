package Book02_ProgrammingBasics.Chapter02.VariablesAndDataTypes.Variables;

public class DeclaringInstanceVariables {
    static String helloMessage; // error -- should use static keyword
    public static void main(String[] args)
    {
        helloMessage = "Hello, World!";
        System.out.println(helloMessage); // will not compile
    }
}
