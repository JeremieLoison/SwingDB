/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.jeremie.javaswing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrateur
 */
public class Note {

    String title;
    String text;
    String FileName;
    String FolderName = "new-notes";
    String FileExtension = ".txt";

    public Note() {
    }

    public Note(String FileName) {
        this.FileName = FileName;
    }

    public Note(String title, String text, String FileName) {
        this.title = title;
        this.text = text;
        this.FileName = FileName;
    }

    //Création des Getter et Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFolderName() {
        return FolderName;
    }

    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public String getFileExtension() {
        return FileExtension;
    }

    public void setFileExtension(String FileExtension) {
        this.FileExtension = FileExtension;
    }

    /**
     * SAUVEGARDER UNE NOTE SUR LE DISQUE DUR lié à la concaténation
     *
     * @throws java.io.IOException
     */
    public void savenote() throws IOException {

        //Le contenu du fichier note
        StringBuilder sb = new StringBuilder();
        sb.append(this.title);
        sb.append("\n");
        sb.append(this.text);

        String fileContent = sb.toString();

        //Instanciation d'un fichier
        File noteFile = new File(this.FolderName, this.FileName + this.FileExtension);
        if (!noteFile.exists()) {
            noteFile.createNewFile();
        }
        //Ecriture dans le fichier
        PrintWriter pw = new PrintWriter(noteFile);
        pw.write(fileContent);
        pw.flush();
        pw.close();

    }

    public void newNote() throws IOException {
        //  this.FileName = String.valueOf((new Date()).getTime());
       
        // Le titre est utilisé comme nom de fichier
        String baseFileName = this.FileName = this.title.replace(" ", "_");
        int suffix = 0;
        
        //Instanciation du fichier avec le nom de base pour tester son existance
        File f = new File(this.FolderName, baseFileName + this.FileExtension);
        while (f.exists()){
            suffix ++;
            f = new File(FolderName, baseFileName + "-" + suffix + this.FileExtension);
                    
        }
        
        // Attribution du nom trouvé à la propriété fileName de l'objet
        this.FileName = FileName;
        
                this.savenote();

    }

    /**
     * chargement d'une note
     */
    public void loadNote() throws FileNotFoundException, IOException {
        //Instantation du fichier
        File noteFile = new File(this.FolderName, this.FileName + this.FileExtension);

        // Lire le fichier: instantacion d'un FileReader et un BufferReader
        FileReader fr = new FileReader(noteFile);
        BufferedReader br = new BufferedReader(fr);

        // Récupération du titre
        this.title = br.readLine();

        // Récupération du texte
        String line;
        StringBuilder sb = new StringBuilder();
        //Boucle ligne à ligne jusqu'à la fin du fichier   
        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }
        this.text = sb.toString();
        br.close();
        fr.close();

    }

    public void deleteNote() {
        //Instantacion du fichier
        File noteFile = new File(this.FolderName, this.FileName + this.FileExtension);
        boolean success = noteFile.delete();

        System.out.println("supression : " + success);
        System.out.println("fichier existe : " + noteFile.exists());
        System.out.println(noteFile.toString());
    }

}
