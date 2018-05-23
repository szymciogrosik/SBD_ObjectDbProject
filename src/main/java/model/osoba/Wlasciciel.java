package model.osoba;

import model.dataType.Adres;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Wlasciciel extends Osoba implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private Adres adres;

    public Wlasciciel(String imie, String nazwisko, String nrTelefonu, Adres adres) {
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setNrTelefonu(nrTelefonu);
        this.adres = adres;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem właścicielem. Nazywam sie " + this.getImie() + " " + this.getNazwisko() + ". Mój nr telefonu to: " + this.getNrTelefonu());
    }
}
