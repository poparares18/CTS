package ro.ase.cts.clase;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	protected static int sumaFinantareElev = 30;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		final StringBuilder stringBuilder = new StringBuilder("Elev: ");
		stringBuilder.append(super.toString());
		stringBuilder.append(", clasa=").append(clasa);
		stringBuilder.append(", tutore=").append(tutore);
		return stringBuilder.toString();
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public int finantare() {
		return sumaFinantareElev;
	}
}
