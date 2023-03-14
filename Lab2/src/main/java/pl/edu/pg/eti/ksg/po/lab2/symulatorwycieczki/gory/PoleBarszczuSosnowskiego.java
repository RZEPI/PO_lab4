package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class PoleBarszczuSosnowskiego extends Wedrowka {
        public PoleBarszczuSosnowskiego(double odleglosc)
        {
            super(odleglosc);
        }

        @Override
        public int getTrudnoscNawigacyjna() {
            return 2;
        }

        @Override
        public String getNazwa()
        {
            return "Pole barszczu sosnowskiego";
        }

        @Override
        public double modyfikujPredkoscGrupy(double predkosc) {
            return predkosc * 0.75;
        }
}
