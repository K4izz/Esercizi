/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio3;

import java.util.Scanner;

/*
    Wang Jimmy 4InfD
    Definisci una classe Auto per rappresentare oggetti automobile con il nome della marca, il nome del modello, la targa e l’anno di immatricolazione e con opportuni metodi d’istanza tra cui un metodo del tipo String toString() per la sua descrizione.
 */
public class Auto {
    //
    private String Marca;
    private String Modello;
    private String Targa;
    private int annoImmatricolazione;
    
  
    // Inizio : Creazione dei metodi set and get per le variabili privati.
    
    public void setMarca (String NuovaMarca){
        Marca = NuovaMarca;
    }
    
     public void setModello (String NuovoModello){
        Modello = NuovoModello;
    }
     
      public void setTarga (String NuovaTarga){
        Targa = NuovaTarga;
    }
      
       public void setAnnoImmatricolazione (int NuovoAnnoImmatricolazione){
        annoImmatricolazione = NuovoAnnoImmatricolazione;
    }
       
       public String GetModello (){
           return Modello;
       }
       
       public String GetMarca (){
           return Marca;
       }
       
       public String GetTarga (){
           return Targa;
       }
       
       public int GetAnnoImmatricolazione (){
           return annoImmatricolazione;
       }
       // Fine : Creazione dei metodi set and get per le variabili privati.
       // Inizio : Creazione del metodo stampa il metodo predefinito toString che mette in chiaro che la variabile deve essere trattato come una stringa.
       public void stampa(){
           
           System.out.print(Marca.toString() + Modello.toString() + Targa.toString() + annoImmatricolazione);
       }
        // Fine : Creazione del metodo stampa il metodo predefinito toString che mette in chiaro che la variabile deve essere trattato come una stringa.

    
}
