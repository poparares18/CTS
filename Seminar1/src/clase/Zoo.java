package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal> lista;
	public Zoo(Zookeeper zookeeper, List<Animal> lista) {
		super();
		this.zookeeper = zookeeper;
		this.lista = lista;
	}
	public Zoo() {
		super();
		this.zookeeper=new Zookeeper("Gigel");
		lista =new ArrayList();
	}
	public void addAnimal(Animal a) {
		lista.add(a);
	}
	public void feedAllAnimals() {
		for(Animal a : lista) {
			zookeeper.feed(a);
		}
	}
}
