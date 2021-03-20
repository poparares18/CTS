package ro.ase.cts.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class ReaderAngajati extends ReaderAplicant {
	
	public ReaderAngajati(String numeFisier) {
		super(numeFisier);
	}

	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(super.numeFisier));
		scanner.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Angajat angajat = new Angajat();
			super.readAplicant(scanner, angajat);
			
			int salariu = scanner.nextInt();
			String ocupatie = scanner.next();
			
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);
			angajati.add(angajat);
		}
		scanner.close();
		return angajati;
	}
}
