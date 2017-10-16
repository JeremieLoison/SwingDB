/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.jeremie;

import fr.jeremie.javaswing.Note;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.DataFormat;

/**
 *
 * @author Administrateur
 */
public class NoteFrame extends javax.swing.JFrame {

    
  
    /**
     * Creates new form NoteFrame
     */
    public NoteFrame() {
        initComponents();
        initNoteList();
        initHtml();

    }

    /**
     * initialisation de la liste des notes
     */
    private void initNoteList() {
        // Lister les notes dans le dossier des notes
        File noteFolder = new File("new-notes");
        String[] notes = noteFolder.list();

        // Remplissage du composant jList avec les données
        noteList.setListData(notes);
        saveButton.setEnabled(false);

        //Eliminer l'extension du nom du fichier
        int numberOfNotes = notes.length;
        int lastDotIndex;
        for (int i = 0; i < numberOfNotes; i++) {
            lastDotIndex = notes[i].lastIndexOf(".");
            notes[i] = notes[i].substring(0, notes[i].lastIndexOf("."));

            if (lastDotIndex > 0) {
                notes[i] = notes[i].substring(0, lastDotIndex);
            }
        }
    }

    private void initHtml() {
        // Lister les notes dans un fichier HTML
        File noteFolder = new File("notesHTML");
        DataFormat notesHTML = DataFormat.HTML;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane1 = new javax.swing.JScrollPane();
        noteList = new javax.swing.JList<>();
        titleTextField = new javax.swing.JTextField();
        titre = new javax.swing.JLabel();
        texte = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        contentTextArea = new javax.swing.JTextArea();
        saveButton = new javax.swing.JButton();
        fileNameLabel = new javax.swing.JLabel();
        saveHTMLButton = new javax.swing.JButton();
        ajouterButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bloc Note");

        noteList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        noteList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        noteList.setDragEnabled(saveButton.getVerifyInputWhenFocusTarget());
        noteList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noteListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(noteList);

        titleTextField.setToolTipText("Saisir vos note dans l'encadrer");
        titleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextFieldActionPerformed(evt);
            }
        });

        titre.setText("Titre de votre note");

        texte.setText("Texte");

        contentTextArea.setColumns(20);
        contentTextArea.setRows(5);
        jScrollPane2.setViewportView(contentTextArea);

        saveButton.setText("Sauvegarder");
        saveButton.setToolTipText("");
        saveButton.setContentAreaFilled(noteList.isEnabled());
        saveButton.setEnabled(false);
        saveButton.setHideActionText(isEnabled());

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, noteList, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), saveButton, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        fileNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        saveHTMLButton.setText("Save HTML");
        saveHTMLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveHTMLButtonActionPerformed(evt);
            }
        });

        ajouterButton.setAction(titleTextField.getAction());
        ajouterButton.setText("+");
        ajouterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Supprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajouterButton))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texte)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fileNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(7, 7, 7)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(saveHTMLButton))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fileNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(texte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveButton)
                            .addComponent(saveHTMLButton)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ajouterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        Note note = new Note(noteList.getSelectedValue());
        note.setTitle(titleTextField.getText());
        note.setText(contentTextArea.getText());
        initNoteList();

        try {
            note.savenote();
        } catch (IOException ex) {
            Logger.getLogger(NoteFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void titleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTextFieldActionPerformed

    private void noteListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noteListMouseClicked
        //Récupération de l'élément sélectionné
        String fileName = noteList.getSelectedValue();

        // Affichage de l'éelement selectionné dans un label
        fileNameLabel.setText(fileName);

        // Instancier la note
        Note note = new Note(fileName);

        try {
            note.loadNote();
            titleTextField.setText(note.getTitle());
            contentTextArea.setText(note.getText());
            //Activer le bouton sauvegarder    
            saveButton.setEnabled(true);
        } catch (IOException ex) {
            Logger.getLogger(NoteFrame.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_noteListMouseClicked

    private void saveHTMLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveHTMLButtonActionPerformed

        String fileName = noteList.getSelectedValue();
        // Affichage de l'éelement selectionné dans un label
        fileNameLabel.setText(fileName);

// TODO add your handling code here:
    }//GEN-LAST:event_saveHTMLButtonActionPerformed

    private void ajouterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterButtonActionPerformed
        Note note = new Note();
        note.setTitle(titleTextField.getText());
        note.setText(contentTextArea.getText());
        initNoteList();

        try {
            note.newNote();
            initNoteList();
        } catch (IOException ex) {

            Logger.getLogger(NoteFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ajouterButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Note note = new Note(noteList.getSelectedValue());
        note.deleteNote();
        initNoteList();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NoteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterButton;
    private javax.swing.JTextArea contentTextArea;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> noteList;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveHTMLButton;
    private javax.swing.JLabel texte;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JLabel titre;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
