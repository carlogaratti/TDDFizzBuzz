package my.tdd.fuzzbuzz;

public abstract class ModuleNumber{

	public abstract String say();
	
	static ModuleNumber factiory(int number){
		if (number == 3)
			return new Three();
		else return new Five();			
	}

}
