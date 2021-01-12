package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamesRepo {
    private List<Game> gameList;

    public GamesRepo() {
        gameList = new ArrayList<>();
        readEntries();
    }

    public void readEntries(){
        try {
            File myObj = new File("src/top_games_shuffled");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] entries = data.split("/*");
                System.out.println(data);
                Game g = new Game(entries[0],Integer.parseInt(entries[1]),Integer.parseInt(entries[2]), LocalDate.parse(entries[3]));
                gameList.add(g);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
