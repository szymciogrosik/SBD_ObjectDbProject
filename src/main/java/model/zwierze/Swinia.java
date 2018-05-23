package model.zwierze;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Swinia extends Zwierze implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private double aktualnaWaga = 0;

    public Swinia(String nazwa, double kgKarmyNaDzien, double aktualnaWaga) {
        this.setImie(nazwa);
        this.setKgKarmyNaDzien(kgKarmyNaDzien);
        this.aktualnaWaga = aktualnaWaga;
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Chrum chrum chrum!");
    }
}
