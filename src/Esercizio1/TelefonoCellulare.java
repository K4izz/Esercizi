/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Esercizio1;

import java.util.Scanner;
/*
    Wang Jimmy 4 infD 
    Esercizio 1 Definisci la classe TelefonoCellulare dandone la rappresentazione sia sintetica sia Completa
 */
public class TelefonoCellulare {
    
    // Inizio : Dichiarazione degli attributi della classe.
    private int prezzo;
    private String Marca;
    // Fine : Dichiarazione degli attributi della classe.
    
    // Inizio : Creazione del metodo per l'input dell'utente e la sua assegnazione.
    public void Scan(){
    Scanner Scan = new Scanner(System.in);
    System.out.println("Inserire il prezzo del telefono");
    prezzo = Scan.nextInt();
    System.out.println("Inserire la marca");
    Marca= Scan.next();
    }
    // Fine : Creazione del metodo per l'input dell'utente e la sua assegnazione.
    
    // Inizio : Creazione del metodo per la stampa.
    public void stampa (){
        System.out.println("\nIl prezzo del telefono e' : " + prezzo + " Euro");
        System.out.println("\nla marca e' : " + Marca);
    }
    // Fine : Creazione del metodo per la stampa.
    
    public static void main(String[] args) {
        // Inizio : Istanzazione dell'oggetto per richiamare le funzioni della classe TelefonoCellulare e i suoi attributi.
        TelefonoCellulare myTelefonoCellulare = new TelefonoCellulare();
        // Fine : Istanzazione dell'oggetto per richiamare le funzioni della classe TelefonoCellulare e i suoi attributi.
        
        // Inizio : richiamo delle funzioni tramite l'oggetto myTelefonoCellulare.
        myTelefonoCellulare.Scan();
        myTelefonoCellulare.stampa();
        // Fine : richiamo delle funzioni tramite l'oggetto myTelefonoCellulare.
    }
    
}
