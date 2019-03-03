import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Dog extends Animal implements Comparable<Animal>{

	public Dog(String name, int numLegs){
		this.name = name;
		this.numLegs = numLegs;
	}
	
	public String toString(){
		return this.name +  " has " + this.numLegs + " legs "; 
	}
	
	public int compareTo(Animal animal){
		return this.name.compareTo(animal.name);
	}
	}