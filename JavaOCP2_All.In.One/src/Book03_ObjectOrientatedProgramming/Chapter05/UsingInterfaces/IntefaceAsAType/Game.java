package Book03_ObjectOrientatedProgramming.Chapter05.UsingInterfaces.IntefaceAsAType;

public class Game {
    private void startGame(Dealable deck, String game)
    {
        if (game.equals("Poker"))
            deck.deal(5);
        else if (game.equals("Hearts"))
            deck.deal(13);
        else if (game.equals("Gin"))
            deck.deal(10);
    }
}
