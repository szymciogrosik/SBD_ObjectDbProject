import model.Farma;
import model.dataType.Adres;
import model.osoba.Osoba;
import model.osoba.Pracownik;
import model.osoba.Wlasciciel;
import model.zwierze.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("db/farm.odb");
        EntityManager em = emf.createEntityManager();

//        addTestData(em);
        //Pobierz wszystkie farmy, wykonaj na nich metodę policz zwierzeta, pracowników oraz właścicieli
        TypedQuery<Farma> query1 =
                em.createQuery("SELECT f FROM Farma f", Farma.class);
        List<Farma> results1 = query1.getResultList();
        for (Farma f: results1) {
            System.out.println("\nWykonuje metody policz zwierzęta, pracowników oraz właścicieli.");
            f.policzZwierzeta();
            f.policzPracownikow();
            f.policzWlascicieli();
            System.out.println("\nWszystkie zwierzeta na farmie wydają swój dźwięk.");
            for (Zwierze z : f.getListaZwierzat()) {
                z.wydajDzwiek();
            }
            System.out.println("\nWszystkie osoby pracujące na farmie się przedstawiają.");
            for (Pracownik p : f.getListaPracownikow()) {
                p.przedstawSie();
            }
            for (Wlasciciel p : f.getListaWlascicieli()) {
                p.przedstawSie();
            }
        }

        //Pobierz wszystkie psy i każ im wykonać jedną z sztuczek.
        TypedQuery<Pies> query2 =
                em.createQuery("SELECT p FROM Pies p", Pies.class);
        List<Pies> results = query2.getResultList();
        System.out.println("\nPsy wykonują sztuczki.");
        for (Pies p: results) {
            p.zrobSztuczke();
        }
    }

    private static void addTestData(EntityManager em) {
        //Stwórz trzy koty
        Kot kot1 = new Kot("Bonifacy", 0.2, 5);
        Kot kot2 = new Kot("Ksawery", 0.1, 1);
        Kot kot3 = new Kot("Bajtek", 0.5, 7);

        //Stwórz dwie krowy
        Krowa krowa1 = new Krowa("Mleczanka", 3, 3);
        Krowa krowa2 = new Krowa("Krówczanka", 4, 2);

        //Stworz psa
        String[] sztuczkiTablica1 = new String[] {"Daj łape", "Zaszczekaj", "Stań na dwóch łapach", "Zawyj"};
        LinkedList<String> sztuczki1 = new LinkedList<String>();
        sztuczki1.addAll(Arrays.asList(sztuczkiTablica1));
        Pies pies1 = new Pies("Kajtek", 0.3, "Ratlerek", sztuczki1);

        //Stworz pięć świń
        Swinia swinia1 = new Swinia("Peppa", 0.9, 50);
        Swinia swinia2 = new Swinia("Dzordz", 5, 170);
        Swinia swinia3 = new Swinia("Kalinka", 3.5, 150);
        Swinia swinia4 = new Swinia("Mala Emma", 2.0, 60);
        Swinia swinia5 = new Swinia("Mama peppa", 7.0, 200);

        //Stwórz osiem adresów
        Adres adres1 = new Adres("Warszawa", "Długa", "20", "00-004");
        Adres adres2 = new Adres("Otwock", "Prosta", "22", "66-008");
        Adres adres3 = new Adres("Zgliszew", "Krzywa", "123", "12-012");
        Adres adres4 = new Adres("Serock", "Miodowa", "1", "05-045");
        Adres adres5 = new Adres("Warszawa", "Skośna", "5", "02-076");
        Adres adres6 = new Adres("Płock", "Wysoka", "67", "44-034");
        Adres adres7 = new Adres("Konstancin Jeziorna", "Niska", "45", "22-075");
        Adres adres8 = new Adres("Władysławowo", "Przeciętna", "76", "12-088");

        //Stworz pięciu pracownikow
        Pracownik pracownik1 = new Pracownik("Andrzej", "Kamikaze", "234234234", adres1, 10);
        Pracownik pracownik2 = new Pracownik("Wojtek", "Wąski", "678678678", adres2, 12);
        Pracownik pracownik3 = new Pracownik("Piotrek", "Kamieniarz", "809890890", adres3, 11.5);
        Pracownik pracownik4 = new Pracownik("Anna", "Polok", "342323434", adres4, 8.5);
        Pracownik pracownik5 = new Pracownik("Marcin", "Fryda", "765475677", adres5, 13);

        //Stworz dwóch właścicieli
        Wlasciciel wlasciciel1 = new Wlasciciel("Piotr", "Poważny", "654645645", adres6);
        Wlasciciel wlasciciel2 = new Wlasciciel("Tomasz", "Niechciany", "979989799", adres7);

        //Stworz farmę
        Zwierze[] zwierzeTablica = new Zwierze[] {kot1, kot2, kot3, krowa1, krowa2, pies1, swinia1, swinia2, swinia3, swinia4, swinia5};
        Pracownik[] pracownikTablica = new Pracownik[] {pracownik1, pracownik1, pracownik3, pracownik4, pracownik5};
        Wlasciciel[] wlascicielTablica = new Wlasciciel[] {wlasciciel1, wlasciciel2};
        LinkedList<Zwierze> listaZwierzat = new LinkedList<Zwierze>();
        listaZwierzat.addAll(Arrays.asList(zwierzeTablica));
        LinkedList<Pracownik> listaPracownikow = new LinkedList<Pracownik>();
        listaPracownikow.addAll(Arrays.asList(pracownikTablica));
        LinkedList<Wlasciciel> listaWlascicieli = new LinkedList<Wlasciciel>();
        listaWlascicieli.addAll(Arrays.asList(wlascicielTablica));
        Farma farma1 = new Farma(adres8, listaZwierzat, listaPracownikow, listaWlascicieli);

        em.getTransaction().begin();
        em.persist(kot1);
        em.persist(kot2);
        em.persist(kot3);
        em.persist(krowa1);
        em.persist(krowa2);
        em.persist(pies1);
        em.persist(swinia1);
        em.persist(swinia2);
        em.persist(swinia3);
        em.persist(swinia4);
        em.persist(swinia5);
        em.persist(pracownik1);
        em.persist(pracownik2);
        em.persist(pracownik3);
        em.persist(pracownik4);
        em.persist(pracownik5);
        em.persist(wlasciciel1);
        em.persist(wlasciciel2);
        em.persist(farma1);
        em.getTransaction().commit();
    }
}
