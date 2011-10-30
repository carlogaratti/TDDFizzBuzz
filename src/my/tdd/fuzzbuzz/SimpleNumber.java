package my.tdd.fuzzbuzz;

public class SimpleNumber extends ModuleNumber{

	private int num;
	
	public SimpleNumber(int num) {
		this.num = num;
	}
	
	@Override
	public Object say() {
		return num;
	}

}
