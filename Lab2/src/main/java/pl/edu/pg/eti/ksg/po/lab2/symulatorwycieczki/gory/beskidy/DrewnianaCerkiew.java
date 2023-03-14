package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ElementWycieczki;

import javax.management.remote.rmi.RMIJRMPServerImpl;

public class DrewnianaCerkiew extends Atrakcja {
    public String miejscowosc;
    public DrewnianaCerkiew(String miejscowosc)
    {
        this.miejscowosc = miejscowosc;
    }
    @Override
    public String getNazwa(){
        return "Drewniana Cerkiew";
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
