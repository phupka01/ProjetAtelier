/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.hupka.atelier;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;       
import java.io.BufferedReader;
import java.lang.StringBuilder;
/**
 *
 * @author llahorgue01 (eh ouais B-) )
 */
public class Fiabilite {
   private Machine[] tbmachine = new Machine[50];
   private float[] tbdates = new float[50];
   private float[] tbheure = new float[50];
   private Operateur[] tboperateur = new Operateur[50];
   private char[] tbevent = new char[50];
   private String[] tbcause = new String[50];
   private static BufferedReader reader = null;
   private static String cheminacces;
   //Constructeur 
    //GetSet
    public Machine[] getTbmachine() {
        return tbmachine;
    }

    public void setTbmachine(Machine[] tbmachine) {
        this.tbmachine = tbmachine;
    }

    public float[] getTbdates() {
        return tbdates;
    }

    public void setTbdates(float[] tbdates) {
        this.tbdates = tbdates;
    }

    public float[] getTbheure() {
        return tbheure;
    }

    public void setTbheure(float[] tbheure) {
        this.tbheure = tbheure;
    }

    public Operateur[] getTboperateur() {
        return tboperateur;
    }

    public void setTboperateur(Operateur[] tboperateur) {
        this.tboperateur = tboperateur;
    }

    public char[] getTbevent() {
        return tbevent;
    }

    public void setTbevent(char[] tbevent) {
        this.tbevent = tbevent;
    }

    public String[] getTbcause() {
        return tbcause;
    }

    public void setTbcause(String[] tbcause) {
        this.tbcause = tbcause;
    }
    //Méthodes
public static void main(String[] args){
    try {
        cheminacces = "SuiviMaintenance.txt";
        reader = new BufferedReader(new FileReader(cheminacces));
    }
    catch(FileNotFoundException exc)
    {
     System.out.println("Fichier non trouvé");
    }
    int i;
    int k;
    for (i=0;i<4;i++){
        StringBuilder stringbuilder = new StringBuilder();
        while ((k= reader.read() !=)) {
            
        }
        
    }
    
}
    
   
}
