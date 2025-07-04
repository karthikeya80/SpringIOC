package com.seleniumexpress.ioc;

public class Vodaphone implements Sim {
	
	
	public Vodaphone() {
		System.out.println("Vodaphone constructor");
	}

	@Override
	public void calling() {
		System.out.println("calling Using Vodaphone Sim");
	}

	@Override
	public void data() {
		System.out.println("Data using Vodaphone Sim");
	}

}
