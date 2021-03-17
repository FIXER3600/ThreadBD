package view;

import controller.BDController;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaforo = new Semaphore(1);
        for (int i=1;i<21;i++){
            BDController t = new BDController(i,semaforo);
            t.start();
        }
    }
}
