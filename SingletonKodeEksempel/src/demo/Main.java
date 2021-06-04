package demo;

public class Main extends Thread{

    public static void main (String[] args) {
        //Ved hjælp af tråde kan flere dele af programmet køre samtidig.
        Main thread = new Main();
        thread.start();
        System.out.println("Denne code er udenfor tråden");

    }

        public void run() {
        System.out.println("Denne code er inde i tråden");
        }

    }
