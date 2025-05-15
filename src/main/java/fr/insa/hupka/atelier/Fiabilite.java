/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.hupka.atelier;
import java.util.Scanner;
import java.io.File;
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
   File suivi = new File("C:\\Users\\llahorgue01\\Desktop");
   Scanner scan = new Scanner(suivi);
   
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

    
   
}
