package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.Enum;

public class EnumTest {
    public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS}

    public static void main(String[] args) {
        CardSuit suit;
        suit = CardSuit.HEARTS;
        System.out.println("The suit is " + suit);
    }
}