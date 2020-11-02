package ba.unsa.etf.rpr.tutorijal02;

import java.util.Objects;

public class Interval {

    private double pocetna, krajnja;
    private boolean pripadaLiPocetna, pripadaLiKrajnja;


    public Interval(double pocetna, double krajnja, boolean pripadaLiPocetna, boolean pripadaLiKrajnja) {

        if (pocetna > krajnja) throw new IllegalArgumentException();

        this.pocetna = pocetna;
        this.krajnja = krajnja;
        this.pripadaLiPocetna = pripadaLiPocetna;
        this.pripadaLiKrajnja = pripadaLiKrajnja;
    }

    public Interval() {
        setPocetna(0);
        setKrajnja(0);
        setPripadaLiPocetna(false);
        setPripadaLiKrajnja(false);
    }


    public boolean isIn(double v) {
        if (v > getPocetna() && v < getKrajnja()) return true; //provjera ( )
        if (v == getPocetna() && isPripadaLiPocetna()) return true; // [ provjera
        if (v == getKrajnja() && isPripadaLiKrajnja()) return true; // ] provjera

        return false;
    }

    public boolean isNull() {
        if (this.getPocetna() == 0 && this.getKrajnja() == 0) return true;
        return false;
    }

    public double getPocetna() {
        return pocetna;
    }

    public void setPocetna(double pocetna) {

        //u slucaju promjene intervala poslije
        if (pocetna > this.getKrajnja()) throw new IllegalArgumentException();

        this.pocetna = pocetna;
    }

    public double getKrajnja() {
        return krajnja;
    }

    public void setKrajnja(double krajnja) {

        if (krajnja < this.getPocetna()) throw new IllegalArgumentException();

        this.krajnja = krajnja;
    }

    public boolean isPripadaLiPocetna() {
        return pripadaLiPocetna;
    }

    public void setPripadaLiPocetna(boolean pripadaLiPocetna) {
        this.pripadaLiPocetna = pripadaLiPocetna;
    }

    public boolean isPripadaLiKrajnja() {
        return pripadaLiKrajnja;
    }

    public void setPripadaLiKrajnja(boolean pripadaLiKrajnja) {
        this.pripadaLiKrajnja = pripadaLiKrajnja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return Double.compare(interval.pocetna, pocetna) == 0 &&
                Double.compare(interval.krajnja, krajnja) == 0 &&
                pripadaLiPocetna == interval.pripadaLiPocetna &&
                pripadaLiKrajnja == interval.pripadaLiKrajnja;
    }

    @Override
    public String toString() {

        String vrati = "";

        if (isNull()) {
            //vraca prazan interval
            if (isPripadaLiPocetna()) vrati += "[";
            else vrati += "(";

            if (isPripadaLiKrajnja()) vrati += "]";
            else vrati += ")";

            return vrati;
        }

        if (isPripadaLiPocetna()) vrati += "[";
        else vrati += "(";

        vrati += getPocetna() + "," + getKrajnja();

        if (isPripadaLiKrajnja()) vrati += "]";
        else vrati += ")";

        return vrati;

    }

    public Interval intersect(Interval interval) {
        /*
        Interval i = new Interval(1.1, 2.5, true, false);
        Interval i2 = new Interval(2.2, 2.6, true, true);

         */

        Interval vrati = new Interval();

        //if (getPocetna()<interval.pocetna && interval.pocetna<getKrajnja() && getKrajnja()<interval.krajnja)


            return null;
    }

    public static Interval intersect(Interval i, Interval i2) {
        //ostao je jos intersect


        return null;
    }


}
