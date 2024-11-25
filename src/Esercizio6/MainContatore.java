/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Esercizio6;

/*
  Wang Jimmy 4infD
  Definisci una classe Contatore moduloNche permetta di incrementare e decrementare una variabile di una singola unità fino al raggiungimento del valore N:successivamente il conteggio riparte da 0(ma se mi parte da zero il ciclo sara' infinito e mi fa scoppiare il computer).
*/
public class MainContatore {


    public static void main(String[] args) {
        // Inizio : Istanzazione dell'oggetto per richiamare i metodi della classe Contatore.
        Contatore MyContatore = new Contatore();
        // Fine : Istanzazione dell'oggetto per richiamare i metodi della classe Contatore.
        
        // inizio : Richiamo di metodi con l'oggetto.
        MyContatore.Input();
        MyContatore.ForIncrementoDecremento();
        // Fine : Richiamo di metodi con l'oggetto.
    }
    
}
