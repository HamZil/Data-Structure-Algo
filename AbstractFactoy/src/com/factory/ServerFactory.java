package com.factory;

import com.types.Computer;
import com.types.Server;

public class ServerFactory implements AbstractFactory {


	private String ram;
	private String hdd;
	private String cpu;
	
	public ServerFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new Server(ram,hdd,cpu);
	}

	@Override
	public String toString() {
		return "ServerFactory [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}

}
