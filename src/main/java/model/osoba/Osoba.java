package model.osoba;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public abstract class Osoba implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    private String imie;
    private String nazwisko;
    private String nrTelefonu;

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
}
