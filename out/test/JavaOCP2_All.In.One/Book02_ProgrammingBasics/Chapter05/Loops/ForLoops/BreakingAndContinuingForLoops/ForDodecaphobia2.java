package Book02_ProgrammingBasics.Chapter05.Loops.ForLoops.BreakingAndContinuingForLoops;

public class ForDodecaphobia2 {
    public static void main(String[] args) {
        for (int number = 2; number <=20; number += 2) {
            if (number == 12)
                continue;
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
