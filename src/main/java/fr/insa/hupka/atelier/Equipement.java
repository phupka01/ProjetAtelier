/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.hupka.atelier;

/**
 *
 * @author phupka01
 */
public class Equipement {
    //attributs
    private String refEquipement;
    private String dEquipement;
    //Constructeur
    public Equipement(String refEquipement, String dEquipement) {
        this.refEquipement = refEquipement;
        this.dEquipement = dEquipement;
    }
   //Getters
    public String getRefEquipement() {
        return refEquipement;
    }

    public String getdEquipement() {
        return dEquipement;
    }
    //Setters

    public void setRefEquipement(String refEquipement) {
        this.refEquipement = refEquipement;
    }

    public void setdEquipement(String dEquipement) {
        this.dEquipement = dEquipement;
    }
    
}
