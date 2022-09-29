package Book05_ProgrammingTechniques.Chapter01_RunnableInterface_page480;

import java.util.ArrayList;

public class LaunchEvent extends Runnable {
    public LaunchEvent() {
    }

    public LaunchEvent(int i, String s) {
        super();
    }

    public static void main(String[] args) {
        Thread clock = new CountDownClock();
        ArrayList<Runnable> events = new ArrayList<>();
        events.add(new LaunchEvent());
        events.add(new LaunchEvent());
        events.add(new LaunchEvent());
        clock.start();
        for (int i = 0; i < 3; i++) {
            new Thread(events.get(i)).start();
        }

    }
}