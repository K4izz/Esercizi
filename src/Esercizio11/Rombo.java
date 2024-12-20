/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Esercizio11;

/**
 *
 * Wang Jimmy 4InfD
 * Definisci una classe Rombo che permetta di calcolare l’area e il perimetro di un rombo posizionato nel piano cartesiano del quale si conoscono le 4 coordinate cartesiane dei quattro punti che lo individuano.
 */
public class Rombo {
    // Inizio : dichiarazione dei attributi della classe.
    private double x1, y1; 
    private double x2, y2; 
    private double x3, y3; 
    private double x4, y4; 
    private double LatoDiagonale1 , LatoDiagonale2, Area;
    private double DistanzaVertici, Perimetro;
    // Fine : dichiarazione dei attributi della classe.
   
    // Inizio : Creazione del metodo per il calcolo della distanza.
    private double distanza(double xA, double yA, double xB, double yB) {
           DistanzaVertici = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
           return DistanzaVertici;
    }
    // Inizio : Creazione del metodo per il calcolo della distanza.
    
    // Inizio : Creazione del metodo per il calcolo del lato diagonale 1 e 2.
    private double calcolaDiagonale1() {
        return distanza(x1, y1, x3, y3); 
    }

    private double calcolaDiagonale2() {
        return distanza(x2, y2, x4, y4); 
    }
    // Fine: Creazione del metodo per il calcolo del lato diagonale 1 e 2.
   
    // Inizio : Creazione del metodo per il calcolo dell'area.
    public void calcolaArea() {
        LatoDiagonale1 = calcolaDiagonale1();
        LatoDiagonale2 = calcolaDiagonale2();
        Area = (LatoDiagonale1 * LatoDiagonale2) / 2; 
        System.out.println(Area);
    }
    // Fine : Creazione del metodo per il calcolo dell'area.
    
    // Inizio : Creazione del metodo per il calcolo del perimetro.
    public void calcolaPerimetro() {
        double lato = distanza(x1, y1, x2, y2);
        Perimetro = (4 * lato);
        System.out.println(Perimetro);
    }
    // Fine: Creazione del metodo per il calcolo del perimetro.
    
    // Inizio : creazione dei metodi set e get.
    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public double getX3() {
        return x3;
    }

    public double getY3() {
        return y3;
    }

    public double getX4() {
        return x4;
    }

    public double getY4() {
        return y4;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public void setY4(double y4) {
        this.y4 = y4;
    }
    // Fine : creazione dei metodi set e get.
    
    public static void main(String[] args) {
        // Inizio : Creazione dell'oggetto per il richiamo dei metodi.
        Rombo myrombo = new Rombo();
        // Fine : Creazione dell'oggetto per il richiamo dei metodi.
        
        // Inizio : Assegnazioni di valori tramite il set.
        myrombo.setX1(3);
        myrombo.setY1(3);
        myrombo.setX2(5);
        myrombo.setY2(6);
        myrombo.setX3(7);
        myrombo.setY3(3);
        myrombo.setX4(5);
        myrombo.setY4(0);
        // Fine : Assegnazioni di valori tramite il set.
        
        // Inizio : Richiamo dei metodi per il calcoli e la loro stampa.
        myrombo.calcolaDiagonale1();       
        myrombo.calcolaDiagonale2();
        myrombo.calcolaPerimetro();
        myrombo.calcolaArea();
        // Fine : Richiamo dei metodi per il calcoli e la loro stampa.
    }
}