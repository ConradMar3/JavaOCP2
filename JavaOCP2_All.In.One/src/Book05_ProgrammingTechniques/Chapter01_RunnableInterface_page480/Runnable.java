package Book05_ProgrammingTechniques.Chapter01_RunnableInterface_page480;

import java.lang.Thread;

class Runnable extends Thread {
    public static Runnable createRunnable() {
        return null;
    }

    public void run() {
        for (int t = 20; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

