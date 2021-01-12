package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
                String[] entries = data.split("\\*");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
                Game g = new Game(entries[0],Integer.parseInt(entries[1]),Float.parseFloat(entries[2]), LocalDate.parse(entries[3],formatter));
                gameList.add(g);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public List<Game> sortMetacritik(){
        gameList.sort(Comparator.comparing(Game::getMetacritikPunkteAnzahk).reversed());
        return gameList;
    }
    public List<Game> sortDatum(){
        gameList.sort(Comparator.comparing(Game::getDatum).reversed());
        return gameList;
    }
    public List<Game> filterUserScore(){
        List<Game> filtered = gameList.stream().filter((n)->n.getBenPunkteAnzahl()>=9.0).collect(Collectors.toList());
        return filtered;
    }
    public List<Game> filterName(){
        List<Game> filtered = gameList.stream().filter((n)->n.getName().startsWith("D")).collect(Collectors.toList());
        return filtered;
    }

    public void writeFile(){
        try {
            String[] x = {"metacritic","date","user","name"};
            for(String a:x){
                String filename = "top-games-"+a+".txt";
                FileWriter myWriter = new FileWriter(filename);
                List<Game> aux = new ArrayList<>();
                if(a.equals(x[0]))
                    aux = sortMetacritik();
                if(a.equals(x[1]))
                    aux = sortDatum();
                if(a.equals(x[2]))
                    aux = filterUserScore();
                if(a.equals(x[3]))
                    aux = filterName();
                for(Game g:aux)
                    myWriter.write(g.toString());
                myWriter.close();
        }
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
