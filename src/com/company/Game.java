package com.company;

import java.time.LocalDate;

public class Game {
    private String Name;
    private int BenPunkteAnzahl;
    private int MetacritikPunkteAnzahk;
    private LocalDate datum;

    public Game(String name, int benPunkteAnzahl, int metacritikPunkteAnzahk, LocalDate datum) {
        Name = name;
        BenPunkteAnzahl = benPunkteAnzahl;
        MetacritikPunkteAnzahk = metacritikPunkteAnzahk;
        this.datum = datum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBenPunkteAnzahl() {
        return BenPunkteAnzahl;
    }

    public void setBenPunkteAnzahl(int benPunkteAnzahl) {
        BenPunkteAnzahl = benPunkteAnzahl;
    }

    public int getMetacritikPunkteAnzahk() {
        return MetacritikPunkteAnzahk;
    }

    public void setMetacritikPunkteAnzahk(int metacritikPunkteAnzahk) {
        MetacritikPunkteAnzahk = metacritikPunkteAnzahk;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Game{" +
                "Name='" + Name + '\'' +
                ", BenPunkteAnzahl=" + BenPunkteAnzahl +
                ", MetacritikPunkteAnzahk=" + MetacritikPunkteAnzahk +
                ", datum=" + datum +
                '}';
    }
}
