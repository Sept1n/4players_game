package Projekt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Wczytywanie_pytan
{
    static String file1 = "src\\Pytania\\Geografia_latwy.txt";
    static String file2 = "src\\Pytania\\Historia_latwy.txt";
    static String file3 = "src\\Pytania\\Scisle_latwy.txt";
    static String file4 = "src\\Pytania\\Inne_latwy.txt";
    static String file5 = "src\\Pytania\\Geografia_trudny.txt";
    static String file6 = "src\\Pytania\\Historia_trudny.txt";
    static String file7 = "src\\Pytania\\Scisle_trudny.txt";
    static String file8 = "src\\Pytania\\Inne_trudny.txt";

    static String line;

    static ArrayList geog_lat = new ArrayList();
    static ArrayList his_lat = new ArrayList();
    static ArrayList scis_lat = new ArrayList();
    static ArrayList inne_lat = new ArrayList();
    static ArrayList geog_tru = new ArrayList();
    static ArrayList his_tru = new ArrayList();
    static ArrayList scis_tru = new ArrayList();
    static ArrayList inne_tru = new ArrayList();

    public static void wczytywanie() throws FileNotFoundException
    {
        try {
            BufferedReader input = new BufferedReader(new FileReader(file1));
            if (!input.ready()) {
                throw new IOException();
            }
            while ((line = input.readLine()) != null) {
                geog_lat.add(line);
            }
            input.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        try {
            BufferedReader input = new BufferedReader(new FileReader(file2));
            if (!input.ready()) {
                throw new IOException();
            }
            while ((line = input.readLine()) != null) {
                his_lat.add(line);
            }
            input.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        try {
            BufferedReader input = new BufferedReader(new FileReader(file3));
            if (!input.ready()) {
                throw new IOException();
            }
            while ((line = input.readLine()) != null) {
                scis_lat.add(line);
            }
            input.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        try {
            BufferedReader input = new BufferedReader(new FileReader(file4));
            if (!input.ready()) {
                throw new IOException();
            }
            while ((line = input.readLine()) != null) {
                inne_lat.add(line);
            }
            input.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        try {
            BufferedReader input = new BufferedReader(new FileReader(file5));
            if (!input.ready()) {
                throw new IOException();
            }
            while ((line = input.readLine()) != null) {
                geog_tru.add(line);
            }
            input.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        try {
            BufferedReader input = new BufferedReader(new FileReader(file6));
            if (!input.ready()) {
                throw new IOException();
            }
            while ((line = input.readLine()) != null) {
                his_tru.add(line);
            }
            input.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        try {
            BufferedReader input = new BufferedReader(new FileReader(file7));
            if (!input.ready()) {
                throw new IOException();
            }
            while ((line = input.readLine()) != null) {
                scis_tru.add(line);
            }
            input.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        try {
            BufferedReader input = new BufferedReader(new FileReader(file8));
            if (!input.ready()) {
                throw new IOException();
            }
            while ((line = input.readLine()) != null) {
                inne_tru.add(line);
            }
            input.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }

}
