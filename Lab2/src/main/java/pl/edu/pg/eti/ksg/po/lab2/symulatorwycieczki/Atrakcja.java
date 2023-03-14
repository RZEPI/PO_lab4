package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki;

import com.sun.jdi.request.StepRequest;

public abstract class Atrakcja implements ElementWycieczki{
    private double czasZwiedzania;

    public double getCzasZwiedzania()
    {
        return czasZwiedzania;
    }
    public void setCzasZwiedzania(double czasZwiedzania)
    {
        this.czasZwiedzania = czasZwiedzania;
    }
}
