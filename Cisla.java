package org.example;

public class Cisla extends Thread{

    int cislo;

    public Cisla(int cislo) {
        this.cislo = cislo;
    }

    public void run(){
        for (int i = 0; i < cislo; i++) {
            System.out.println(i);
        }
    }
}
