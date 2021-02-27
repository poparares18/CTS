package seminar1;

import clase.Animal;
import clase.Lion;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		Animal lion1=new Lion("Leo");
		Lion lion2=new Lion("Leona");
		zoo.addAnimal(lion1);
		zoo.addAnimal(lion2);
		zoo.feedAllAnimals();
	}

}
