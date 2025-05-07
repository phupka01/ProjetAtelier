/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.hupka.atelier;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author phupka01
 */
public class Poste extends Equipement {
    
    private String refPoste;
    private String dPoste;
    private ArrayList<Machine> listeMachines;
    
    
    //Constructeur

    public Poste(String refPoste, String dPoste, ArrayList<Machine> listeMachines, String refEquipement, String dEquipement) {
        super(refEquipement, dEquipement);
        this.refPoste = refPoste;
        this.dPoste = dPoste;
        this.listeMachines = listeMachines;
    }

    
    
    
    //Getters

    public String getRefPoste() {
        return refPoste;
    }

    public String getdPoste() {
        return dPoste;
    }

    public ArrayList<Machine> getListeMachines() {
        return listeMachines;
    }
    
    
    //Setters

    public void setRefPoste(String refPoste) {
        this.refPoste = refPoste;
    }

    public void setdPoste(String dPoste) {
        this.dPoste = dPoste;
    }

    public void setListeMachines(ArrayList<Machine> listeMachines) {
        this.listeMachines = listeMachines;
    }
    
    
}
