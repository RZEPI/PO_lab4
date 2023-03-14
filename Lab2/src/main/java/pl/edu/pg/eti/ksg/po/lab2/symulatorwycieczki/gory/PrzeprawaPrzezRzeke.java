package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class PrzeprawaPrzezRzeke extends Wedrowka {

    private double odleglosc;

    public PrzeprawaPrzezRzeke(double odleglosc)
    {
        super(odleglosc);
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 1;
    }

    @Override
    public String getNazwa()
    {
        return "Rzeka";
    }

    @Override
    public double getOdleglosc() {
        return odleglosc;
    }
    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return predkosc*0.7;
    }
}
