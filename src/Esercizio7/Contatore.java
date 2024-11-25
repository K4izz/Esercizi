/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio7;

import java.util.Scanner;

/**
 *
 * Wang Jimmy 4InfD 
 * Definisci una classe Contatore moduloNche permetta di incrementare e decrementare una variabile di un passo P fino al raggiungimento del valore N: successivamente il conteggio riparte da 0.
 */
public class Contatore {
    private int passo = 2;
    private int InputUtente;
    private int a = 20;
    // Inizio : Creazione del metodo per l'incremento e decremento in unica unita'.
    public void ForIncrementoDecremento(){
        
        if (InputUtente<a){
            do{
            InputUtente= InputUtente + passo;  // incremento al passo .
            System.out.print("\n" + InputUtente); // stampa.
            if (InputUtente>=a-1){ // se l'input e >= ad a entra e interromempe il ciclo. (-1 per non far fare l'utima operazione che va oltre alla variabile)
                break;
            }
        } while (true); // true perche' il ciclo si ripete con il vero praticamente questo ciclo va all'infinito perche' dovrebbe uscire con il break dell'if
        }    
        else if(InputUtente>a){
        do {
            InputUtente= InputUtente - passo; // decremento al passo.
            System.out.print("\n" + InputUtente); // stampa.
            if (InputUtente<=a+1){ // se l'input e <= ad a entra e interromempe il ciclo. (+1 per non far fare l'utima operazione che va oltre alla variabile)
                break;
            }
        } while (true); // true perche' il ciclo si ripete con il vero praticamente questo ciclo va all'infinito perche' dovrebbe uscire con il break dell'if
    }
        
    }
    // Fine : Creazione del metodo per l'incremento e decremento in unica unita'.
    
    // Inizio : Creazione del metodo per l'input dell'utente.
    public void Input(){
        
    Scanner Scan = new Scanner(System.in);
    
    System.out.println("Inserire un numero da 0 a 40 : ");
    
    do{
        
    InputUtente = Scan.nextInt();
    
    
    } while(InputUtente>40 || InputUtente<0); // il numero inserito deve essere dentro nel range da 0 a 40.
    }
}
