package com.seleniumexpress.ioc;

public class Airtel implements Sim {
	
	Airtel(){
		System.out.println("Airtel constructor..");
	}

	@Override
	public void calling() {
		System.out.println("calling Using Airtel Sim");
	}

	@Override
	public void data() {
		System.out.println("Data using Airtel Sim");
	}

}
