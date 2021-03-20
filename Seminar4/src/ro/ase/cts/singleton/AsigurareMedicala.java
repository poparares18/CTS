package ro.ase.cts.singleton;

public class AsigurareMedicala {
    private int id;
    private String numeAsigurat;
    private float contributie;

    private static AsigurareMedicala asigurareMedicala = new AsigurareMedicala(1,"Rares", 200.5f);

    private AsigurareMedicala(int id, String numeAsigurat, float contributie) {
        this.id = id;
        this.numeAsigurat = numeAsigurat;
        this.contributie = contributie;
    }

    public static AsigurareMedicala getInstance() {
        return asigurareMedicala;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeAsigurat(String numeAsigurat) {
        this.numeAsigurat = numeAsigurat;
    }

    public void setContributie(float contributie) {
        this.contributie = contributie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AsigurareMedicala{");
        sb.append("id=").append(id);
        sb.append(", numeAsigurat='").append(numeAsigurat).append('\'');
        sb.append(", contributie=").append(contributie);
        sb.append('}');
        return sb.toString();
    }

}
