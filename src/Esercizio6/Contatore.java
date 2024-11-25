/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio6;

import java.util.Scanner;

/*
  Wang Jimmy 4infD
  Definisci una classe Contatore moduloNche permetta di incrementare e decrementare una variabile di una singola unità fino al raggiungimento del valore N:successivamente il conteggio riparte da 0(ma se mi parte da zero il ciclo sara' infinito e mi fa scoppiare il computer).
*/
public class Contatore {
    // Inizio : Dichiarazione di attributi della classe.
    private int InputUtente;
    private int a = 5;
    // Fine : Dichiarazione di attributi della classe.
    
    // Inizio : Creazione del metodo per l'incremento e decremento in unica unita'.
    public void ForIncrementoDecremento(){
        
        if (InputUtente<a){
            do{
            InputUtente++;  // incremento.
            System.out.print("\n" + InputUtente); // stampa.
        } while (a!=InputUtente); // esce dal ciclo quando l'input utente e' uguale a 5.
        }    
        else if(InputUtente>a){
        a=6;
        do {
            InputUtente--; // decremento.
            System.out.print("\n" + InputUtente); // stampa.
        } while (InputUtente!=a); // esce dal ciclo quando l'input utente e' uguale a 6.
    }
        
    }
    // Fine : Creazione del metodo per l'incremento e decremento in unica unita'.
    
    // Inizio : Creazione del metodo per l'input dell'utente.
    public void Input(){
        
    Scanner Scan = new Scanner(System.in);
    
    System.out.println("Inserire un numero da 0 a 10");
    
    do{
        
    InputUtente = Scan.nextInt();
    
    } while(InputUtente>10 || InputUtente<0); // il numero inserito deve essere dentro nel range di 0 a 10.
    System.out.println("Inserire un numero da 1 a 5");
    // Fine : Creazione del metodo per l'input dell'utente.
    
    }
}
