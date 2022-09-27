package Book05_ProgrammingTechniques.Chapter01_ImplementingRunnableInterface_page480;

class launchEvent implements Runnable {
    private int start;
    private String message;

    public void run() {
        try {
            Thread.sleep(20000 - (start * 1000));
        } catch (InterruptedException e) {
        }
        System.out.println(message);
    }
}