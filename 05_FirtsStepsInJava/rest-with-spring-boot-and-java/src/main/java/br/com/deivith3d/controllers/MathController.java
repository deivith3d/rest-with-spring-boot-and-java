package br.com.deivith3d.controllers;

import java.util.concurrent.atomic.AtomicLong;
import java.lang.Math;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.deivith3d.exceptions.UnsupportedMathOperationException;
import br.com.deivith3d.math.SimpleMath;
import br.com.deivith3d.converters.NumberConverter;
@RestController
public class MathController {
	
	private final AtomicLong counter = new AtomicLong();
	
	private SimpleMath math = new SimpleMath();
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo)throws Exception
			{
		if(!NumberConverter.isNumeric(numberOne)||!NumberConverter.isNumeric(numberTwo))
		{
			throw new UnsupportedMathOperationException("Por favor, informe um valor numérico!!!");
		}
		return math.sum(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/subt/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double subt(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo)throws Exception
			{
		if(!NumberConverter.isNumeric(numberOne)||!NumberConverter.isNumeric(numberTwo))
		{
			throw new UnsupportedMathOperationException("Por favor, informe um valor numérico!!!");
		}
		return math.subt(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/mult/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double mult(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo)throws Exception
			{
		if(!NumberConverter.isNumeric(numberOne)||!NumberConverter.isNumeric(numberTwo))
		{
			throw new UnsupportedMathOperationException("Por favor, informe um valor numérico!!!");
		}
		return math.mult(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/divs/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double divs(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo)throws Exception
			{
		if(!NumberConverter.isNumeric(numberOne)||!NumberConverter.isNumeric(numberTwo))
		{
			throw new UnsupportedMathOperationException("Por favor, informe um valor numérico!!!");
		}
		return math.divs(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/med/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double med(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo)throws Exception
			{
		if(!NumberConverter.isNumeric(numberOne)||!NumberConverter.isNumeric(numberTwo))
		{
			throw new UnsupportedMathOperationException("Por favor, informe um valor numérico!!!");
		}
		return math.med(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/raiz/{numberOne}",method=RequestMethod.GET)
	public Double raiz(
			@PathVariable(value = "numberOne") String numberOne)throws Exception
			{
		if(!NumberConverter.isNumeric(numberOne))
		{
			throw new UnsupportedMathOperationException("Por favor, informe um valor numérico!!!");
		}
		return math.raiz(NumberConverter.convertToDouble(numberOne));
	}
	
	
	
	
	


}
