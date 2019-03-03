abstract class Animal{
	String name;
	int numLegs;
	

	
	public String getName (){
		return name;
	}
	
	public void setName(String name){
		this.name = name; 
	}
	
	public int getLegs (){
		return numLegs;
	}
	
	public void setLegs(int numLegs){
		this.numLegs = numLegs;
	}
	
	public String toString(){
		return this.name;
	}
	

}
