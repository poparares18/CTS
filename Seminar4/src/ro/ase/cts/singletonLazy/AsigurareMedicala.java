package ro.ase.cts.singletonLazy;

public class AsigurareMedicala {
    private int id;
    private String numeAsigurat;
    private float contributie;
    //1. instanta noastra
    private static AsigurareMedicala asigurareMedicala = null;
    //2. private constructor
    private AsigurareMedicala(int id, String numeAsigurat, float contributie) {
        this.id = id;
        this.numeAsigurat = numeAsigurat;
        this.contributie = contributie;
    }
    //3. getInstance
    public static synchronized AsigurareMedicala getInstance(int id, String numeAsigurat, float contributie) {
        if (asigurareMedicala == null) {
            asigurareMedicala = new AsigurareMedicala(id, numeAsigurat, contributie);
        }
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
