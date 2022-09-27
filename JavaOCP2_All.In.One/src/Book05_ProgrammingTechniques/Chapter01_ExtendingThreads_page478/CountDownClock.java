package Book05_ProgrammingTechniques.Chapter01_ExtendingThreads_page478;

public class CountDownClock extends Thread {
    public void run() {
        for (int t = 20; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}
