/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Esercizio8;

/**
 *
 * Wang Jimmy 4infD
 *  Definisci una classe Punto che permetta di individuare un punto nel piano cartesiano, calcolando la sua distanza dall’origine.
 */
public class PuntoMain {

    public static void main(String[] args) {
        // Inizio : Instazazione dell'oggetto per il richiamo dei metodi nella classe Punto.
        Punto myPunto = new Punto();
        // Fine  : Instazazione dell'oggetto per il richiamo dei metodi nella classe Punto.
        
        //Inizio : Richiamo del metodo set e il passaggio del valore alla classe.
        myPunto.setX(5);
        myPunto.setY(5);
        //Inizio : Richiamo del metodo set e il passaggio del valore alla classe.
        
        //Inizio : Richiamo del metodo per il calcole della distanza.
        myPunto.CalcoloDistanza();
        // Fine : Richiamo del metodo per il calcole della distanza.
    }
    
}
