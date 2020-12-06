package cz2.film;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Film {
    String tytul;
    Rezyser rezyser;
    LocalDate dataPremiery;
    List<Aktor> listaAktorow = new ArrayList<>();
    TypFilmu typ;

    public Film(String tytul, Rezyser rezyser, LocalDate dataPremiery, List<Aktor> listaAktorow, TypFilmu typ) {
        this.tytul = tytul;
        this.rezyser = rezyser;
        this.dataPremiery = dataPremiery;
        this.listaAktorow = listaAktorow;
        this.typ = typ;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Rezyser getRezyser() {
        return rezyser;
    }

    public void setRezyser(Rezyser rezyser) {
        this.rezyser = rezyser;
    }

    public LocalDate getDataPremiery() {
        return dataPremiery;
    }

    public void setDataPremiery(LocalDate dataPremiery) {
        this.dataPremiery = dataPremiery;
    }

    public List<Aktor> getListaAktorow() {
        return listaAktorow;
    }

    public void setListaAktorow(List<Aktor> listaAktorow) {
        this.listaAktorow = listaAktorow;
    }

    public TypFilmu getTyp() {
        return typ;
    }

    public void setTyp(TypFilmu typ) {
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "Film{" +
                "tytul='" + tytul + '\'' +
                ", rezyser=" + rezyser +
                ", dataPremiery=" + dataPremiery +
                ", listaAktorow=" + listaAktorow +
                ", typ=" + typ +
                '}';
    }
}
