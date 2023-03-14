package pl.edu.pg.eti.ksg.po.lab2;

import java.util.HashSet;
import java.util.Set;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.*;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.*;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie.*;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.DrewnianaCerkiew;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.GestyLas;

/**
 *
 * @author TB
 */
public class JavaLab2 {
    public static void main(String[] args) {
        Wycieczka w = doDydiowki();

        PrzewodnikStudencki przewodnik = new PrzewodnikStudencki("Stefan", "Długonogi", Czlowiek.Plec.MEZCZYZNA);
        Set<Uczestnik> uczestnicy = new HashSet<>();
        uczestnicy.add(new Student("Alojzy", "Mechanik", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new Student("Ada", "Lovelace", Czlowiek.Plec.KOBIETA));
        uczestnicy.add(new Student("Jan", "Elektronik", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new StudentKSG("Piotr","Teledetekcyjny", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new LesnyBiegacz("Fiodor", "Dostojewski", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new BeskidzkiPiechur("Julia", "Strychalska", Czlowiek.Plec.KOBIETA));
        uczestnicy.add(new CzłowiekZKontuzja("Michalina", "Różalska", Czlowiek.Plec.KOBIETA));
        uczestnicy.add(new MistrzPanoram("Jeży", "Orwell", Czlowiek.Plec.MEZCZYZNA));
        
        Grupa g = new Grupa(przewodnik, uczestnicy);

        
        SymulatorWycieczki symulator = new SymulatorWycieczki(g, w);
        
        symulator.symuluj();
    }
    
    public static Wycieczka doDydiowki() {
        Droga dr = new Droga(1.00);
        Set<SluchaczPostepow> lambd= new HashSet<>();
        Wycieczka ret = new Wycieczka("Do Dydiówki");
        ret.dodajElementWycieczki(new Droga(1.0));
        ret.dodajElementWycieczki(new DrewnianaCerkiew("Smolnik"));
        ret.dodajElementWycieczki(new Droga(4.0));
        ret.dodajElementWycieczki(new PrzeprawaPrzezRzeke(1.0));
        ret.dodajElementWycieczki(new GestyLas(2.0));
        ret.dodajElementWycieczki(new Las(2.0));
        ret.dodajElementWycieczki(new CmentarzZIWojny("Brynki małe"));
        ret.dodajElementWycieczki(new PoleBarszczuSosnowskiego(2.0));
        ret.dodajElementWycieczki(new Panorama("Lipki górne"));
        ret.dodajElementWycieczki(new Droga(5.0));


        lambd.add((ElementWycieczki elementWycieczki, int lp, int liczbaElementow)->
        {
            elementWycieczki = new Droga(1.00);
            lp = 1;
            liczbaElementow = 2;
        });
        return ret;
    }
   
}
