package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        GamesRepo g = new GamesRepo();
        System.out.println(g.filterName());
        g.writeFile();
    }
}
