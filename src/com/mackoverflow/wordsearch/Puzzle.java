package com.mackoverflow.wordsearch;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Puzzle {
    static char grid[][];

    public static void create(String filename) throws IOException {
        // Creates a 10x10 puzzle matrix
        BufferedReader wordsearchfile;
        try {
            wordsearchfile = new BufferedReader(new FileReader(filename));
            String line;
            int row = 0;
            int size = 0;

            while ((line = wordsearchfile.readLine()) != null) {

                if (grid == null) {
                    size = line.length();
                    grid = new char[size][size];
                }

                for (int col = 0; col < size; col++) {
                    grid[row][col] = line.charAt(col);
                }

                row++;
            }

        } catch (Exception e) {
            System.out.println(e); // Throws IOException
        }
    }

    public static void print(char[][] dimensions) {
        // Outputs to the console the puzzle
    }

    public interface Comparable<T> {
        //
    }
}
