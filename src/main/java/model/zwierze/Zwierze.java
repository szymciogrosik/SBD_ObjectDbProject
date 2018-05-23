package model.zwierze;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public abstract class Zwierze implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String imie;

    private double kgKarmyNaDzien = 0;

    public void wydajDzwiek() {
        System.out.println("Domyslny dzwiek zwierzaka.");
    }

    public double getKgKarmyNaDzien() {
        return kgKarmyNaDzien;
    }

    public void setKgKarmyNaDzien(double kgKarmyNaDzien) {
        this.kgKarmyNaDzien = kgKarmyNaDzien;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
}
