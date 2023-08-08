package com.factory;

import com.types.Computer;

public class ComputerFactory {

	public static Computer getComputer(AbstractFactory factory){
		return factory.createComputer();
	}

}
