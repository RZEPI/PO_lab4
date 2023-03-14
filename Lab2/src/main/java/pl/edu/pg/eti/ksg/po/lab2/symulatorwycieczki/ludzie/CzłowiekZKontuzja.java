package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

public class CzłowiekZKontuzja extends Czlowiek {
    public CzłowiekZKontuzja(String imie, String nazwisko, Czlowiek.Plec plec) {
        super(imie, nazwisko,plec, 3, 18,12);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 2;
    }
}
