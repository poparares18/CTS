package ro.ase.cts.clase;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	protected static int sumaFinantareAngajat = 10;
	
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}
	
	@Override
	public String toString() {
		final StringBuilder stringBuilder = new StringBuilder("Angajat: ");
		stringBuilder.append(super.toString());
		stringBuilder.append(", ocupatie=").append(ocupatie);
		stringBuilder.append(", salariu=").append(salariu);
		return stringBuilder.toString();
	}
	
	public int finantare() {
		return sumaFinantareAngajat;
	}
}
