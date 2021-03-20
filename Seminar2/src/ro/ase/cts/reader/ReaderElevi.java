package ro.ase.cts.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ReaderElevi extends ReaderAplicant {
	
	public ReaderElevi(String numeFisier) {
		super(numeFisier);
	}

	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(super.numeFisier));
		scanner.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Elev elev = new Elev();
			super.readAplicant(scanner, elev);
			
			int clasa = scanner.nextInt();
			String tutore = scanner.next();
			
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			elevi.add(elev);
		}

		scanner.close();
		return elevi;
	}
}
