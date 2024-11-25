/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio9;

/**
 *
 * Wang Jimmy 4InfD 
 * Definisci una classe Cerchio che permetta di calcolare l’area e il perimetro di un cerchio con centro di coordinate x e y.
 */
public class Cerchio {
    // Inizio : Dichiarazioni di variabili della classe.
    private double x;
    private double y;
    private double raggio;
    private double calcoloArea;
    private double calcoloPerimetro;
    // Fine : Dichiarazioni di variabili della classe.
    
    // Inizio : Creazione dei metodi set e get.
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }
    // Fine : Creazione dei metodi set e get.
    
    // Inizio : Creazione del metodo per il calcolo del perimetro.
    public void CalcoloPerimetro(){
        calcoloPerimetro = 2*3.14*raggio;
        System.out.println(calcoloPerimetro);
    }
    // Fine : Creazione del metodo per il calcolo dell'Area.
    
    // Inizio : Creazione del metodo per il calcolo dell'Area.
    public void CalcoloArea(){
        calcoloArea = 3.14*(raggio*raggio);
        System.out.println(calcoloArea);
    }
    // Fine : Creazione del metodo per il calcolo dell'area
}
