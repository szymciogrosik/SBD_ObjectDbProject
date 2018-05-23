package model.zwierze;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Random;

@Entity
public class Pies  extends Zwierze implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String rasa;
    private LinkedList<String> sztuczki;

    public Pies(String nazwa, double kgKarmyNaDzien, String rasa, LinkedList<String> sztuczki) {
        this.setImie(nazwa);
        this.setKgKarmyNaDzien(kgKarmyNaDzien);
        this.rasa = rasa;
        this.sztuczki = sztuczki;
    }

    public void zrobSztuczke() {
        Random generator = new Random();
        System.out.println(sztuczki.get(generator.nextInt(sztuczki.size())));
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Hau! Hau!");
    }
}
