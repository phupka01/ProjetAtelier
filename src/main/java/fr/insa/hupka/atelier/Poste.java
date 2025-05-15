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
    
    private ArrayList<Machine> listeMachines;
    
    
    //Constructeur

    public Poste(ArrayList<Machine> listeMachines, String refEquipement, String dEquipement) {
        super(refEquipement, dEquipement);
        this.listeMachines = listeMachines;
    }

    

    
    
    
    //Getters
    public ArrayList<Machine> getListeMachines(){
        return listeMachines;
    }

    //Setters
    public void setListeMachines(ArrayList<Machine> listeMachines) {
        this.listeMachines = listeMachines;
    }

    //méthodes
    public static float CalculCout() {
        return -1;
        //écrire ici la méthode de calcul du cout d'un poste, probablement à partir du cout des machines qu'il contient.
    }
    
}
