/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.hupka.atelier;

/**
 *
 * @author phupka01
 */
public class Machine {
    private String refMachine;
    private String dMachine;
    private String type;
    private float cout;
    private float x;
    private float y;

    
    //Getters et Setter
    public String getRefMachine() {
        return refMachine;
    }

    public void setRefMachine(String refMachine) {
        this.refMachine = refMachine;
    }

    public String getdMachine() {
        return dMachine;
    }

    public void setdMachine(String dMachine) {
        this.dMachine = dMachine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getCout() {
        return cout;
    }

    public void setCout(float cout) {
        this.cout = cout;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    //Constructeur

    public Machine(String refMachine, String dMachine, String type, float cout, float x, float y) {
        this.refMachine = refMachine;
        this.dMachine = dMachine;
        this.type = type;
        this.cout = cout;
        this.x = x;
        this.y = y;
    }
    
    
}
