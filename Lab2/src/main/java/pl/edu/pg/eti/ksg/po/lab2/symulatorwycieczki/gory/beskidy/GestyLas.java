package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class GestyLas extends Wedrowka {
    public GestyLas(double odleglosc)
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
        return "Gesty las";
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return predkosc*0.7;
    }
}
