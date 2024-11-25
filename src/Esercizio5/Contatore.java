/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio5;

import java.util.Scanner;

/**
 *
 * @author Wangj
 */
public class Contatore {
    private int InputUtente;
    private int InputIncrementoDecremento;
    
    Scanner Scan = new Scanner(System.in);
    // Inizio : Creazione del metodo per l'input.
    public void Input(){
        
    System.out.print("Inserire un numero : ");
    InputUtente = Scan.nextInt();
    }
    // Fine : Creazione del metodo per l'input.
    
    // Inizio : Creazione del metodo per l'incremento dell'unita' singola fino al numero predefinito.
    public void IncrementoDecremento(){
    
    do{
        System.out.print("Per Incrementare il numero inserire 1 per Decrementare inserire 0 : ");
        InputIncrementoDecremento = Scan.nextInt();
    } while (InputIncrementoDecremento>1 || InputIncrementoDecremento<0);
    
    if (InputIncrementoDecremento == 1 ){
        InputUtente++;
        System.out.print(InputUtente + "\n");
    }
    else if (InputIncrementoDecremento == 0) {
        InputUtente--;
        System.out.print(InputUtente + "\n");
    }
    }
    // Fine : Creazione del metodo per l'incremento dell'unita' singola fino al numero predefinito.
}
