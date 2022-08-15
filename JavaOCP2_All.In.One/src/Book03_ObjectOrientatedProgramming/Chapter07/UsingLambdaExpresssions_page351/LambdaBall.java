package Book03_ObjectOrientatedProgramming.Chapter07.UsingLambdaExpresssions_page351;

public class LambdaBall {
    public static void main(String[] args) {
        Ball b = () -> {
            System.out.println("You hit it!");
        };
        b.hit();
    }

    interface Ball {
        void hit();
    }
}
