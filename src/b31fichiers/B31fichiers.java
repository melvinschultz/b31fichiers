/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b31fichiers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author melvin
 */
public class B31fichiers {

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        String chemin = "/home/melvin/Documents/cours/Java/textdemo.txt";
//        String cheminCopie = "/home/melvin/Documents/cours/Java/textdemocopie.txt";
//        BufferedReader br = null;
//        PrintWriter pr = null;
//        try {
//            br = new BufferedReader(new FileReader(chemin));
//            pr = new PrintWriter(cheminCopie);
//            String s = null;
//            try {
//                while(br.ready()) {
//                    s = br.readLine();
//                    pr.println(s);
//                    System.out.println(s);
//                }
//                pr.flush(); // pour vider le print
//            } catch (IOException ex) {
//                Logger.getLogger(B31fichiers.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(B31fichiers.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                br.close();
//                pr.close();
//            } catch (IOException ex) {
//                Logger.getLogger(B31fichiers.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        
    
    
    
    
//        AVEC THROWS ET IHM
/**
     * @param sortie
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public void lectureEcriture(JTextArea sortie) throws IOException  {
        // TODO code application logic here
        String chemin = "/home/melvin/Documents/cours/Java/textdemo.txt";
        String cheminCopie = "/home/melvin/Documents/cours/Java/textdemocopie.txt";
        BufferedReader br = null;
        PrintWriter pr = null;
        br = new BufferedReader(new FileReader(chemin));
        pr = new PrintWriter(cheminCopie);
        String s = null;
        StringBuilder sb = new StringBuilder();
        while(br.ready()) {
            s = br.readLine();
            pr.println(s);
            sb.append(s);
            sb.append("\n");
        }
        sortie.setText(sb.toString());
        pr.flush(); // pour vider le print
        br.close();
        pr.close();
    }
}
