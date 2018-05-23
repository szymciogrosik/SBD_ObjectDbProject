package model.zwierze;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Kot extends Zwierze implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private double liczbaZlapanychMyszyNaDzien;

    public Kot(String nazwa, double kgKarmyNaDzien, double liczbaZlapanychMyszyNaDzien) {
        this.setImie(nazwa);
        this.setKgKarmyNaDzien(kgKarmyNaDzien);
        this.liczbaZlapanychMyszyNaDzien = liczbaZlapanychMyszyNaDzien;
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Miaaaaau!");
    }
}
