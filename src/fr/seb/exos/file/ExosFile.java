/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.seb.exos.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrateur
 */
public class ExosFile {

    public static void main(String[] args) {

        try {
            /*
            listFiles("c:/Windows");
            
            listFiles("c:/Jeremie");
            //Lister les fichiers
             */

            writeTextFile("data/liste.txt", " ");
            
            writeTextFile("data/liste.txt", "pommes \n");
            writeTextFile("data/liste.txt", "Un évier en fer \n");
        } catch (IOException ex) {
            Logger.getLogger(ExosFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }

    public static String readTextFile(String path) throws FileNotFoundException, IOException {

        String content = " ";

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        String line;

        while ((line = br.readLine()) != null) {

        }

        return content;
    }

    /**
     * Ecrit un contenu dans un fichier texte
     *
     * @param path
     * @param content
     * @throws java.io.IOException
     *
     */
    public static void writeTextFile(String path, String content) throws IOException {
        FileWriter fw = new FileWriter(path, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();
        fw.close();
    }

    public static void listFiles(String path) {

        File f = new File(path);

        /*
        String[] contentList = f.list();
        
        for (String fileName : contentList) {
            System.out.println(fileName);
            
        }*/
        File[] contentList = f.listFiles();
        for (File file : contentList) {
            String fileInfo;
            if (file.isDirectory()) {
                fileInfo = "d";
            } else {
                fileInfo = "f";

            }
            fileInfo += file.getName();
            fileInfo += " (" + file.length() + ")";
            System.out.println(fileInfo);
        }
    }

}
