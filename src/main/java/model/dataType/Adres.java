package model.dataType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Adres implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    private String miejscowosc;
    private String ulica;
    private String numer;
    private String kodPocztowy;

    public Adres(String miejscowosc, String ulica, String numer, String kodPocztowy) {
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.numer = numer;
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }
}
