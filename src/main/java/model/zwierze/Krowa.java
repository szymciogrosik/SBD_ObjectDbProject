package model.zwierze;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Krowa extends Zwierze implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private double litryMlekaNaDzien;

    public Krowa(String nazwa, double kgKarmyNaDzien, double litryMlekaNaDzien) {
        this.setImie(nazwa);
        this.setKgKarmyNaDzien(kgKarmyNaDzien);
        this.litryMlekaNaDzien = litryMlekaNaDzien;
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Muuuuuuuuuuu!");
    }
}
