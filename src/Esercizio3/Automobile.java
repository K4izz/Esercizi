/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Esercizio3;

/*
    Wang Jimmy 4InfD
    Definisci una classe Auto per rappresentare oggetti automobile con il nome della marca, il nome del modello, la targa e l’anno di immatricolazione e con opportuni metodi d’istanza tra cui un metodo del tipo String toString() per la sua descrizione.
 */
public class Automobile {

    public static void main(String[] args) {
        // inizio : Instanzazione dell'oggetto per il richiamo di metodi.
        Auto Automobile = new Auto();
        // Fine : Instanzazione dell'oggetto per il richiamo di metodi.
        
        // Inizio : Richiamo dei metodo set per impostare le variabili.
        Automobile.setMarca("Tesla");
        Automobile.setModello("Model3");
        Automobile.setTarga("GA129KM");
        Automobile.setAnnoImmatricolazione(2024);
        // Fine : Richiamo dei metodo set per impostare le variabili.
        
        // Inizio : Richiamo del metodo per la stampa
        Automobile.stampa();
        // Fine : Richiamo del metodo per la stampa
    }
    
}
