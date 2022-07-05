package Book1_WelcomeToJava.Chapter01.ImportantJavaFeatures;

public class TypeChecking {
    //Pearl Example of Type Checking:
    /*
    $a = 5
    $a = "Strategy"
    $a = 3.14159
     */

    //Java Type Checking:
    public static void main(String[] args) {
       /*
        int a = 5;
        String b = "Strategy";
        String c = a * b;
        This won't compile, Strings and integers can't multiply
        */
        int a = 5;
        String b = "Strategy";
        String c = "Five * Strategy";
        System.out.println(a + " " + b + " " + c);

    }
}
