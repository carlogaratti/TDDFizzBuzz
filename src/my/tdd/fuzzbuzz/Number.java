package my.tdd.fuzzbuzz;

import java.lang.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Number {
	
    private Integer number;
    private Integer appoggio;
    private List<ModuleNumber> list = new ArrayList<ModuleNumber>();
    
	public Number(int i) {
		number = i;
		appoggio = number;
		decompose(appoggio, 3);
		decompose(appoggio, 5);
		decompose(i);
	}
	
	private void decompose(int i) {
		if (list.isEmpty())
			list.add(new SimpleNumber(i));
	}

	private void decompose(Integer appoggio, int modulo) {
		while((appoggio % modulo) == 0){
			list.add(ModuleNumber.factiory(modulo));
			appoggio /= modulo;
		}
	}

	public Object say() {
		String result = "";
		for (ModuleNumber num : list) {
			result += num.say();
		}
		return result;
	}
	
	
}
