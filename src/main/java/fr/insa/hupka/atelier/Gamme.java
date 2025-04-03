/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.hupka.atelier;

import java.util.ArrayList;

/**
 *
 * @author phupka01
 */
public class Gamme {
    //attributs
    private String RefGamme;
    private ArrayList<Operation> ListeOperations;
    private ArrayList<Equipement> ListeEquipements;
    //Constructeur

    public Gamme(String RefGamme, ArrayList<Operation> ListeOperations, ArrayList<Equipement> ListeEquipements) {
        this.RefGamme = RefGamme;
        this.ListeOperations = ListeOperations;
        this.ListeEquipements = ListeEquipements;
    }
    //Getters

    public String getRefGamme() {
        return RefGamme;
    }

    public ArrayList<Operation> getListeOperations() {
        return ListeOperations;
    }

    public ArrayList<Equipement> getListeEquipements() {
        return ListeEquipements;
    }
    //Setters

    public void setRefGamme(String RefGamme) {
        this.RefGamme = RefGamme;
    }

    public void setListeOperations(ArrayList<Operation> ListeOperations) {
        this.ListeOperations = ListeOperations;
    }

    public void setListeEquipements(ArrayList<Equipement> ListeEquipements) {
        this.ListeEquipements = ListeEquipements;
    }
    //Méthodes
     //Méthodes de gestion
    public void creerGamme(){
        
    }
    public void modifierGamme(){
        
    }    
}
