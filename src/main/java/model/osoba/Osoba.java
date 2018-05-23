package model.osoba;

import model.dataType.Adres;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public abstract class Osoba implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    private String imie;
    private String nazwisko;
    private String nrTelefonu;

    private Adres adres;

    public void przedstawSie() {
        System.out.println("Jestem osoba. Nazywam sie " + imie + " " + nazwisko + ". Mój nr telefonu to: " + nrTelefonu);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
