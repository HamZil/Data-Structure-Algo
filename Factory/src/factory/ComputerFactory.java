package factory;

import beans.Computers;
import beans.Laptop;
import beans.PC;
import beans.Server;

public class ComputerFactory {

	public static Computers getComputer(ComputerTypes type, String ram, String hdd, String cpu){
		
		Computers comp = null;
		
		switch(type) {
		case PC :
			comp = new PC(ram, hdd, cpu);
			break;
		case Server :
			comp = new Server(ram, hdd, cpu);
			break;
		case Laptop :
			comp = new Laptop(ram, hdd, cpu);
			break;
		}
		
		return comp;
	}
	
}
