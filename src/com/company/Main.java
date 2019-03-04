package com.company;

public class Main {

    public static void main(String[] args) {
        Circus Zirka = new Circus(150);
        Zirka.resetValuess(100,50,"Volodymyra Velukogo 323",30,3,40,"Acrobatic Circus");
        System.out.print(Zirka.toString());
        System.out.print(Circus.printStaticField());
    }
}

