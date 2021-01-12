package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Game {
    private String Name;
    private float BenPunkteAnzahl;
    private int MetacritikPunkteAnzahk;
    private LocalDate datum;

    public Game(String name, int metacritikPunkteAnzahk, float benPunkteAnzahl, LocalDate datum) {
        Name = name;
        BenPunkteAnzahl = benPunkteAnzahl;
        MetacritikPunkteAnzahk = metacritikPunkteAnzahk;
        this.datum = datum;
        datum.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getBenPunkteAnzahl() {
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
