package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class Panorama extends Atrakcja {
    public String miejscowosc;
    public Panorama(String miejscowosc)
    {
        this.miejscowosc = miejscowosc;
    }
    @Override
    public String getNazwa(){
        return "Panorama";
    }
    public String getMiejscowosc()
    {
        return miejscowosc;
    }
    @Override
    public double getCzasZwiedzania() {
        return 0.5;
    }
}
