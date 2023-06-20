/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ioClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Admin
 */
public class Reader {

    private static final String BASE_PATH = new File("").getAbsolutePath();

    public static void main(String[] args) {
        PrintWriter fileWriter = null;
        try {
            fileWriter = new PrintWriter(BASE_PATH + "\\src\\ioClass\\newfile.csv");
           

        } catch (Exception e) {
            System.out.println("Error When save file !!!");
            e.printStackTrace();
        } finally {
            fileWriter.flush();
            fileWriter.close();
        }
    }
}
