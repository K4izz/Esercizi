/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio4;

/*
    Wang jimmy 4InfD 
    Definisci una classe Studente per rappresentare oggettistudente con il cognome, il nome, il codice rfiscale, il numero di matricola e con opportuni metodi d’istanza tra cui un metodo del tipo String toString() per la sua descrizione.
 */
public class Studente {
    private String Cognome;
    private String Nome;
    private String CodiceFiscale;
    private String Matricola;

    public void setMatricola(String Matricola) {
        this.Matricola = Matricola;
    }

    public String getMatricola() {
        return Matricola;
    }

    public String getCognome() {
        return Cognome;
    }

    public String getNome() {
        return Nome;
    }

    public String getCodiceFiscale() {
        return CodiceFiscale;
    }

    public void setCognome(String NuovoCognome) {
        this.Cognome = NuovoCognome;
    }

    public void setNome(String NuovoNome) {
        this.Nome = NuovoNome;
    }

    public void setCodiceFiscale(String NuovoCodiceFiscale) {
        this.CodiceFiscale = NuovoCodiceFiscale;
    }

    public void stampa(){
           
           System.out.print(Nome.toString() + Cognome.toString() + CodiceFiscale.toString() + Matricola.toString());
       }

    
    
}
