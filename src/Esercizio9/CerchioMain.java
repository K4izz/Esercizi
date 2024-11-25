/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Esercizio9;

/**
 *
 * Wang Jimmy 4InfD 
 * Definisci una classe Cerchio che permetta di calcolare l’area e il perimetro di un cerchio con centro di coordinate x e y.
 */
public class CerchioMain {

    public static void main(String[] args) {
        // Inizio : Instazazione dell'oggetto per richiamare i metodi della classe Cerchio.
        Cerchio myCerchio = new Cerchio();
        // Fine : Instazazione dell'oggetto per richiamare i metodi della classe Cerchio.
        
        // Inizio : Richiamo dei metodi per il set.
        myCerchio.setX(7);
        myCerchio.setY(5);
        myCerchio.setRaggio(4);
        // Fine : Richiamo dei metodi per il set.
        
        // Inizio : Richiamo dei metodi per il calcolo dell'area e perimetro.
        myCerchio.CalcoloArea();
        myCerchio.CalcoloPerimetro();
        // Inizio : Richiamo dei metodi per il calcolo dell'area e perimetro.
    }
    
}
