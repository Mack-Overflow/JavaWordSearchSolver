package com.mackoverflow.wordsearch;

import java.io.File;

public class Search {
    public static void main(String[] args) throws Exception {
        // Create puzzle
        String filepath = new File("").getAbsolutePath();
        try {
            Puzzle.create(args[1]);
        } catch (Exception e) {
            Puzzle.create("src/resources/WordSearch.txt");
        }

        System.out.println(Puzzle.grid);

    }

    public static void readFromDatabase(String[] args) {
        // Input args[1] will be the name of the text file to retrive from the database
        String query = "SELECT file FROM Wordfiles WHERE Wordfiles.name = %sargs[1]";
    }
}
