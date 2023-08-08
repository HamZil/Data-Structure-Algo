package com.clint;

import com.factory.ComputerFactory;
import com.factory.PCFactory;
import com.factory.ServerFactory;
import com.types.Computer;

public class ComputerClient {

	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		
		Computer pc = ComputerFactory.getComputer(new PCFactory("2GB ","500 GB","2GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("5GB ","500 TB","6GHz"));
		
		System.out.println("AbstractFactory PC Config::"+ pc);
		System.out.println("AbstractFactory Server Config::"+ server);
	}
}
