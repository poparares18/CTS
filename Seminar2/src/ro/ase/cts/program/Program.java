package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.reader.ReaderAplicant;
import ro.ase.cts.reader.ReaderStudenti;

public class Program {

	public static List<Aplicant> citireAplicanti(ReaderAplicant readerAplicant) throws FileNotFoundException{
		return readerAplicant.readAplicanti();
	}
	
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citireAplicanti(new ReaderStudenti("studenti.txt"));
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.finantare());
				aplicant.statut();
				System.out.println(aplicant.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
