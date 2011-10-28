package my.tdd.fuzzbuzz;

import java.lang.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Number {
	
    private Integer number;
    private Integer appoggio;
    private List list = new ArrayList();
    
	public Number(int i) {
		number = i;
		appoggio = number;
		decompose(appoggio, 3);
		decompose(appoggio, 5);
	}
	
	private void decompose(Integer appoggio, int modulo) {
		while((appoggio % modulo) == 0){
			list.add(ModuleNumber.factiory(modulo));
			appoggio /= modulo;
		}
	}

	public Object say() {
		String result = "";
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			ModuleNumber type = (ModuleNumber) iterator.next();
			result += type.say();	
		}
		if ("".equals(result))  return number;
		return result;
	}
	
	
}
