package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class CmentarzZIWojny extends Atrakcja {
    public String miejscowosc;
    public CmentarzZIWojny(String miejscowosc)
    {
        this.miejscowosc = miejscowosc;
    }
    @Override
    public String getNazwa(){
        return "Cmentarz z I Wojny";
    }
    public String getMiejscowosc()
    {
        return miejscowosc;
    }
    @Override
    public double getCzasZwiedzania() {
        return 0.33;
    }
}
