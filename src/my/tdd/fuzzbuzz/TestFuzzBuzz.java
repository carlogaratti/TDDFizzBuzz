package my.tdd.fuzzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFuzzBuzz {
	
	@Test
	public void tre(){
		Number numb = new Number(3);
		assertEquals("Fizz", numb.say());
	}
	
	@Test
	public void sedici(){
		Number numb = new Number(16);
		assertEquals("16", numb.say());
	}
	
	@Test
	public void uno(){
		Number numb = new Number(1);
		assertEquals("1", numb.say());
	}
	
	@Test
	public void nove(){
		Number numb = new Number(9);
		assertEquals("FizzFizz", numb.say());
	}
	
	@Test
	public void quindici(){
		Number numb = new Number(15);
		assertEquals("FizzBuzz", numb.say());
	}
	
	@Test
	public void settantacinque(){
		Number numb = new Number(75);
		assertEquals("FizzBuzzBuzz", numb.say());
		
	}
	
	public static void main(String[] args) {
		Number num = new Number(67890);
		System.out.println(num.say());
	}
	
}
