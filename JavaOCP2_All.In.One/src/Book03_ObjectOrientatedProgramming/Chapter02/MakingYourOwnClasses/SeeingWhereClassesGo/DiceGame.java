package Book03_ObjectOrientatedProgramming.Chapter02.MakingYourOwnClasses.SeeingWhereClassesGo;

public class DiceGame {
    public static void main(String[] args) {
        Dice d = new Dice();
        d.roll();
    }
}

//Note: public class Dice won't compile.

class Dice {
    public void roll() {
        // code that rolls the dice goes here
    }
}
