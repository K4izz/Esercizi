/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio8;
import java.lang.Math;
/**
 *
 * Wang Jimmy 4infD
 *  Definisci una classe Punto che permetta di individuare un punto nel piano cartesiano, calcolando la sua distanza dall’origine.
 */
public class Punto {
    // Inizio : Dichiarazioni di variabili della classe.
    private double x;
    private double y;
    private double distanza;
    // Fine : Dichiarazioni di variabili della classe.
    
    // Inizio : creazione del metodo get e set per gli attributi.
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(int Nx) {
        this.x = Nx;
    }
   
    public void setY(int Ny) {
        this.y = Ny;
    }
    // Fine : creazione del metodo get e set per gli attributi.
    
    // Inizio : Creazione del metodo per il calcolo della distanza Distanza.
    public void CalcoloDistanza(){
        distanza = Math.sqrt(x*x+y*y);
        System.out.print(distanza);
    } 
    // Fine : Creazione del metodo per il calcolo della distanza Distanza.
    
}
