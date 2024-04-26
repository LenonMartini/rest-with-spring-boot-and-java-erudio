package br.com.erudio.math;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;


public class SimpleMath {
private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/sum/{numberOne}/{numberTwo}")	
	public Double sum(Double numberOne, Double numberTwo) {
		
		
				
			return (numberOne + numberTwo);
	}
	
	@GetMapping("/subtraction/{numberOne}/{numberTwo}")	
	public Double subtraction(Double numberOne, Double numberTwo) {
		
		
			
		return (numberOne - numberTwo);
	}
	
	@GetMapping("/multiplication/{numberOne}/{numberTwo}")	
	public Double multiplication(Double numberOne, Double numberTwo) {
		
		
			
		return (numberOne * numberTwo);
	}
	
	@GetMapping("/division/{numberOne}/{numberTwo}")	
	public Double division( Double numberOne,  Double numberTwo) {
		
		
			
		return (numberOne / numberTwo);
	}
	
	@GetMapping("/mean/{numberOne}/{numberTwo}")	
	public Double mean( Double numberOne, Double numberTwo) {
		
		
			
		return ((numberOne + numberTwo) / 2);
	}
	
	@GetMapping("/squareRoot/{number}")	
	public Double squareRoot(Double number) {	
		
			
			
			return Math.sqrt(number);
	}
}
