/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Esercizio10;

/**
 *
 * Wang Jimmy 4InfD
 * Definisci una classe Rettangolo che permetta di calcolare l’area e il perimetro di un rettangolo posizionato nel piano cartesiano del quale si conoscono le 4 coordinate cartesiane dei quattro punti che lo individuano.
 */
public class Rettangolo {
    // Inizio : Dichiarazioni dei attributi della classe.
    private double x1, y1;
    private double x2, y2;
    private double x3, y3;
    private double x4, y4; 
    private double Lato1 , Lato2 , Area;
    private double Perimetro;
    private double Distanza;
    // Fine : Dichiarazioni dei attributi della classe.
    
    // Inizio : creazione di un metodo per il calcolo della distanza.
    private double distanza(double xa, double ya, double xb, double yb) {
        Distanza= Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));
        return Distanza;
    }
    // Fine : creazione di un metodo per il calcolo della distanza.

    // Inizio : creazione di un metodo per il calcolo dell'area e del perimetro.
    public void calcolaArea() {
        Lato1 = distanza(x1, y1, x2, y2);
        Lato2 = distanza(x1, y1, x4, y4);
        
        Area = Lato1 * Lato2;
        System.out.println(Area);
    }

    
    public void calcolaPerimetro() {
        Lato1 = distanza(x1, y1, x2, y2);
        Lato2 = distanza(x1, y1, x4, y4);
        Perimetro = 2 * (Lato1 + Lato2); 
        System.out.println(Perimetro);
    }

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
    
    // Inizio : creazione di un metodo per il calcolo dell'area e del perimetro.
    public static void main(String[] args) {
        // Inizio : Creazione di un'oggetto per il richiamo. 
        Rettangolo rettangolo = new Rettangolo();
        // Fine : Creazione di un'oggetto per il richiamo.
        
        // Inizio : Richiamo di un metodo set tramite un'oggetto.
        rettangolo.setX1(1);
        rettangolo.setY1(1);
        rettangolo.setX2(5);
        rettangolo.setY2(1);
        rettangolo.setX3(5);
        rettangolo.setY3(4);
        rettangolo.setX4(1);
        rettangolo.setY4(4);
        // Fine : Richiamo di un metodo set tramite un'oggetto.
        
        // Inizio : Richiamo di un metodo per il calcolo dell'area e del perimetro.
        
        rettangolo.calcolaArea();
        rettangolo.calcolaPerimetro();
        // Fine : Richiamo di un metodo per il calcolo dell'area e del perimetro.
    }
}