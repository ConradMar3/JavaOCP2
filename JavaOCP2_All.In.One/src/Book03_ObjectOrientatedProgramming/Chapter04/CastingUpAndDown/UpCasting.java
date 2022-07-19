package Book03_ObjectOrientatedProgramming.Chapter04.CastingUpAndDown;

public class UpCasting {
    public static void main(String[] args) {
        System.out.println("Ball b = new BaseBall();" +
                "\nIf you had a method like: " +
                "\n\tpublic void hit(Ball b);" +
                "\nIn other words, this method accepts a Ball type as a parameter." +
                "\nThe following code works:" +
                "\n\tBaseBall b1 = new BaseBall();\n" +
                "\thit(b1);\n" +
                "\tBall b2 = b1;\n" +
                "\thit(b2);");
    }
}
