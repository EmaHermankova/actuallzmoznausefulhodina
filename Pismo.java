package org.example;

public class Pismo extends Thread{

     String slovo;

    public Pismo(String slovo) {
        this.slovo = slovo;
    }

    public void run() {

        for (int i = 0; i < slovo.length(); i++) {
            System.out.println(slovo.charAt(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}