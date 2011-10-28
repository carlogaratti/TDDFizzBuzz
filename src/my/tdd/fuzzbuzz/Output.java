package my.tdd.fuzzbuzz;

public class Output {
	
	int outInt;

	public Output(int i) {
		this.outInt = i;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (Integer)obj == outInt;
	}

}
