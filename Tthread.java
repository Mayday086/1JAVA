public class New extends Thread {

    public void run() {

        try {

            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello");
                System.out.println(i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException ae) {
          System.out.println("Error : " + ae);
        }
    }
}

class Tthread {
    public static void main(String[] args) {
        New t1 = new New();
        t1.start();

    }
}
