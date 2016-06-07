package phWGinfo;

public class DemoParallelThreads {

    public static void main(String[] args) {
        new DemoParallelThreads().run();
    }


    public void run() {

        new Thread(new Ticker(+1)).start();
        new Thread(new Ticker(-1)).start();

    }

    int count = 0;

    class Ticker implements Runnable {

        Ticker(int increment) {
            this.increment = increment;
        }
        int increment;

        public void run() {
            while(true) {
                try {
                    this.wait(50);
                    count = count + increment;
                    System.out.println(count);
                    if(Math.abs(count)>5) System.exit(0);
                } catch (InterruptedException x) {
                    x.printStackTrace();
                }
            }
        }
    }
}

