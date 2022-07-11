package Book02_ProgrammingBasics.Chapter07.Methods.MethodsThatTakeParameters;

public class MethodWithParameters {
    public static void main(String[] args) {
        int number = getRandomNumber(50, 100);
        System.out.println("Number is: " + number);
    }

    public static int getRandomNumber(int i, int i1) {
        int num;
        while (true) {
            num = (int) (Math.random() * 100) + 1;
            if (num != 12)
                return num;
        }
    }
}

