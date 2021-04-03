package ro.ase.cts.builder.clase;

public class RezervareBuilderV2 implements AbstractBuilder {
    private int cod;
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoare;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public RezervareBuilderV2() {

    }

    public RezervareBuilderV2 setCod(int cod) {
        this.cod = cod;
        return this;
    }

    public RezervareBuilderV2 setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
        return this;
    }

    public RezervareBuilderV2 setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public RezervareBuilderV2 setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.bauturaRacoritoare = bauturaRacoritoare;
        return this;
    }

    public RezervareBuilderV2 setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    public RezervareBuilderV2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(cod, mancareInclusa, scaunErgonomic, bauturaRacoritoare, muzicaAmbientala, genMuzica);
    }
}
