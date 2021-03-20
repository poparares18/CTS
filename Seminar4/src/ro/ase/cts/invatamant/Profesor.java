package ro.ase.cts.invatamant;

public class Profesor {
    private int id;
    private String numeProfesor;
    private float salariu;

    private static Profesor profesor = null;

    private Profesor(int id, String numeProfesor, float salariu) {
        this.id = id;
        this.numeProfesor = numeProfesor;
        this.salariu = salariu;
    }

    public static synchronized Profesor getInstance(int id, String numeProfesor, float salariu) {
        if(profesor == null) {
            profesor = new Profesor(id, numeProfesor, salariu);
        }
        return profesor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeProfesor(String numeProfesor) {
        this.numeProfesor = numeProfesor;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Profesor{");
        sb.append("id=").append(id);
        sb.append(", numeProfesor='").append(numeProfesor).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
