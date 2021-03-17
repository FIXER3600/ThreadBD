package controller;

import java.util.concurrent.Semaphore;

public class BDController extends Thread{
    private int threadId;
    private Semaphore semaforo;
    private int tempoTransacaoBD;
    private int tempoTransacaoCalc;

    public BDController(int threadId,Semaphore semaforo) {
        this.threadId=threadId;
        this.semaforo=semaforo;
    }

    @Override
    public void run() {
        transacoes();
        try{
            semaforo.acquire();
            fim();
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally {
            semaforo.release();
        }

    }

    private void fim() {
        if(threadId%3==1) {
            System.out.println("Fim Thread #"+threadId);
        }else if (threadId%3==2){
            System.out.println("Fim Thread #"+threadId);
        }else if(threadId%3==0){
            System.out.println("Fim Thread #"+threadId);
        }
    }

    private void transacoes() {
        if(threadId%3==1){

            tempoTransacaoCalc = (int) ((Math.random() * 200) + 800);
            tempoTransacaoBD = (int) ((Math.random() * 501) + 500);

                int porcentual = tempoTransacaoCalc / 100;
                int total = 0;
                System.out.println("Cálculos da Thread #"+threadId);
                do {
                    try {
                        sleep(100);
                        if (total + porcentual >= 100) {
                            total = 100;
                        } else {
                            total += porcentual;
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } while (total < 100);
            porcentual = tempoTransacaoCalc / 100;
            total = 0;
            System.out.println("Transação BD com Thread valor"+this.threadId);
            do {
                try {
                    sleep(100);
                    if (total + porcentual >= 100) {
                        total = 100;
                    } else {
                        total += porcentual;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (total < 100);
            porcentual = tempoTransacaoCalc / 100;
            total= 0;
            System.out.println("Cálculos da Thread #"+threadId);
            do {
                try {
                    sleep(100);
                    if (total + porcentual >= 100) {
                        total = 100;
                    } else {
                        total += porcentual;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (total < 100);
            porcentual = tempoTransacaoCalc / 100;
            total = 0;
            System.out.println("Transação BD com Thread valor"+this.threadId);
            do {
                try {
                    sleep(100);
                    if (total + porcentual >= 100) {
                        total = 100;
                    } else {
                        total += porcentual;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (total < 100);

        }else if (threadId%3==2){
            tempoTransacaoCalc = (int) ((Math.random() * 500) + 1000);
            tempoTransacaoBD = (int) ((Math.random() * 750) + 750);
            int porcentual = tempoTransacaoCalc / 100;
            int total = 0;
            System.out.println("Cálculos da Thread #"+threadId);
            do {
                try {
                    sleep(100);
                    if (total + porcentual >= 100) {
                        total = 100;
                    } else {
                        total += porcentual;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (total < 100);
            porcentual = tempoTransacaoCalc / 100;
            total = 0;
            System.out.println("Transação BD com Thread valor"+this.threadId);
            do {
                try {
                    sleep(100);
                    if (total + porcentual >= 100) {
                        total = 100;
                    } else {
                        total += porcentual;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (total < 100);
            porcentual = tempoTransacaoCalc / 100;
            total = 0;
            System.out.println("Cálculos da Thread #"+threadId);
            do {
                try {
                    sleep(100);
                    if (total + porcentual >= 100) {
                        total = 100;
                    } else {
                        total += porcentual;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (total < 100);
            porcentual = tempoTransacaoCalc / 100;
            total = 0;
            System.out.println("Transação BD com Thread valor"+this.threadId);
            do {
                try {
                    sleep(100);
                    if (total + porcentual >= 100) {
                        total = 100;
                    } else {
                        total += porcentual;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (total < 100);

        }else if(threadId%3==0){
            tempoTransacaoCalc = (int) ((Math.random() * 1000) + 1000);
            tempoTransacaoBD = (int) ((Math.random() * 750) + 750);
            int porcentual = tempoTransacaoCalc / 100;
            int total = 0;
            System.out.println("Cálculos da Thread #"+threadId);
            do {
                try {
                    sleep(100);
                    if (total + porcentual >= 100) {
                        total = 100;
                    } else {
                        total += porcentual;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (total < 100);
            porcentual = tempoTransacaoCalc / 100;
            total = 0;
            System.out.println("Transação BD com Thread valor"+this.threadId);
            do {
                try {
                    sleep(100);
                    if (total + porcentual >= 100) {
                        total = 100;
                    } else {
                        total += porcentual;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (total < 100);
            porcentual = tempoTransacaoCalc / 100;
            total = 0;
            System.out.println("Cálculos da Thread #"+threadId);
            do {
                try {
                    sleep(100);
                    if (total + porcentual >= 100) {
                        total = 100;
                    } else {
                        total += porcentual;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (total < 100);
            porcentual = tempoTransacaoCalc / 100;
            total = 0;
            System.out.println("Transação BD com Thread valor"+this.threadId);
            do {
                try {
                    sleep(100);
                    if (total + porcentual >= 100) {
                        total = 100;
                    } else {
                        total += porcentual;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (total < 100);
        }

    }
}
