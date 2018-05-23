package model;

import model.dataType.Adres;
import model.osoba.Pracownik;
import model.osoba.Wlasciciel;
import model.zwierze.Zwierze;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedList;

@Entity
public class Farma implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private Adres adres;
    private LinkedList<Zwierze> listaZwierzat;
    private LinkedList<Pracownik> listaPracownikow;
    private LinkedList<Wlasciciel> listaWlascicieli;

    private int liczbaZwierzat = 0;
    private int liczbaPracownikow = 0;
    private int liczbaWlascicieli = 0;

    public Farma(Adres adres, LinkedList<Zwierze> listaZwierzat, LinkedList<Pracownik> listaPracownikow, LinkedList<Wlasciciel> listaWlascicieli) {
        this.adres = adres;
        this.listaZwierzat = listaZwierzat;
        this.listaPracownikow = listaPracownikow;
        this.listaWlascicieli = listaWlascicieli;
    }

    public void policzZwierzeta() {
        if(this.listaZwierzat != null) {
            this.liczbaZwierzat = listaZwierzat.size();
            System.out.println("Policzono zwierzeta na farmie. Ich liczba to: " + this.liczbaZwierzat);
        }
    }

    public void policzPracownikow() {
        if(this.listaPracownikow != null) {
            this.liczbaPracownikow = listaPracownikow.size();
            System.out.println("Policzono pracownikow na farmie. Ich liczba to: " + this.liczbaPracownikow);
        }
    }

    public void policzWlascicieli() {
        if(this.listaWlascicieli != null) {
            this.liczbaWlascicieli = listaWlascicieli.size();
            System.out.println("Policzono wlascicieli na farmie. Ich liczba to: " + this.liczbaWlascicieli);
        }
    }

    public int getLiczbaZwierzat() {
        return liczbaZwierzat;
    }

    public int getLiczbaPracownikow() {
        return liczbaPracownikow;
    }

    public int getLiczbaWlascicieli() {
        return liczbaWlascicieli;
    }

    public Adres getAdres() {
        return adres;
    }

    public LinkedList<Zwierze> getListaZwierzat() {
        return listaZwierzat;
    }

    public LinkedList<Pracownik> getListaPracownikow() {
        return listaPracownikow;
    }

    public LinkedList<Wlasciciel> getListaWlascicieli() {
        return listaWlascicieli;
    }
}
