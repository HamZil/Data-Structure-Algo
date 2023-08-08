package test;

import beans.Computers;
import factory.ComputerFactory;
import factory.ComputerTypes;

public class Client {

	public static void main(String[] args) {
		Computers pc = ComputerFactory.getComputer(ComputerTypes.PC ,"2 GB","500 GB","2.4 GHz");
		Computers server = ComputerFactory.getComputer(ComputerTypes.Server,"16 GB","1 TB","2.9 GHz");
		int a =7;
		int b = ++a/2;
		
		int x =7;
		int y =8;
		boolean z=!(x>y);
		
		System.out.print(z);
		
	}

}

