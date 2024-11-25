/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Esercizio4;

/*
    Wang jimmy 4InfD 
    Definisci una classe Studente per rappresentare oggettistudente con il cognome, il nome, il codice rfiscale, il numero di matricola e con opportuni metodi d’istanza tra cui un metodo del tipo String toString() per la sua descrizione.
 */
public class main {

    public static void main(String[] args) {
        
        // Inizio : Istanzazione dell'oggetto per richiamare i metodi della classe Studente.
        Studente myStudente = new Studente();
        // Inizio : Istanzazione dell'oggetto per richiamare i metodi della classe Studente.
        
        // Inizio : Richiamo dei metodo set per impostare le variabili.
        myStudente.setNome("Mercante");
        myStudente.setCognome("Hu");
        myStudente.setCodiceFiscale("MRCHUX99S25F205K");
        myStudente.setMatricola("Z82004");
        // Fine : Richiamo dei metodo set per impostare le variabili.
        
        // Inizio : Creazione del metodo stampa il metodo predefinito toString che mette in chiaro che la variabile deve essere trattato come una stringa.
        myStudente.stampa();
        // Fine : Creazione del metodo stampa il metodo predefinito toString che mette in chiaro che la variabile deve essere trattato come una stringa.
    }
    
}
