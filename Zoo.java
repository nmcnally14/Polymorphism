/**
 * 
 */
package polymorphism;

/**
 * @author Nicola
 *
 */
public class Zoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.makeNoise();
		
		Animal dog = new Dog();
		dog.makeNoise();
		
		Animal lion = new Lion();
		lion.makeNoise();
		
		// array of animals
		Animal[] animals = {a1, dog, lion};
		
		// enhanced for loop
		for (Animal animal : animals)	{
			animal.makeNoise();
		} // end of for
		
		animalNoiseMaker(animals);
		
	} // end of main method
	
	
	public static void  animalNoiseMaker(Animal[] animals) {
		for (Animal a : animals)	{
			a.makeNoise();
		} // end of for
		
	} // end of method

}
