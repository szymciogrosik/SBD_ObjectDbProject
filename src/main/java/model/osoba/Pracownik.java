package model.osoba;

import model.dataType.Adres;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Pracownik extends Osoba implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    private double stawkaNaGodzine;

    public Pracownik(String imie, String nazwisko, String nrTelefonu, Adres adres, double stawkaNaGodzine) {
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setNrTelefonu(nrTelefonu);
        this.setAdres(adres);
        this.stawkaNaGodzine = stawkaNaGodzine;
    }

    public double getStawkaNaGodzine() {
        return stawkaNaGodzine;
    }

    public void setStawkaNaGodzine(double stawkaNaGodzine) {
        this.stawkaNaGodzine = stawkaNaGodzine;
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem pracownikiem. Nazywam sie " + this.getImie() + " " + this.getNazwisko() + ". Mój nr telefonu to: " + this.getNrTelefonu() + ". Moja stawka na godzinę wynosi: " + stawkaNaGodzine);
    }
}
