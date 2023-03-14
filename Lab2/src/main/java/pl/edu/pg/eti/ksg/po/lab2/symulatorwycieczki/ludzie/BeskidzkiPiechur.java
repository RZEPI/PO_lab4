package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Uczestnik;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.CmentarzZIWojny;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.DrewnianaCerkiew;

public class BeskidzkiPiechur extends Czlowiek {

    public BeskidzkiPiechur(String imie, String nazwisko, Czlowiek.Plec plec) {
        super(imie, nazwisko,plec, 6, 20,20);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 5;
    }
    @Override
    public void reagujNaAtrakcje(Atrakcja a, double czas) {
        if(a instanceof DrewnianaCerkiew) {
            regeneruj(czas*2);
        }
    }
}
