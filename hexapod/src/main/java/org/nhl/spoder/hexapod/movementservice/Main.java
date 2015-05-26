package org.nhl.spoder.hexapod.movementservice;

import org.nhl.spoderpod.hexapod.components.C_HTTPAppSocket;
import org.nhl.spoderpod.hexapod.components.C_HTTPFormat;
import org.nhl.spoderpod.hexapod.core.Service;
import org.nhl.spoderpod.hexapod.interfaces.IComponent;

/***
 * HTTP Service verstuurt de gegevens naar de server van de webapp.
 * 
 * @author Driving Gayboy
 */
public class Main {
	
	/*
	 * Starts the service.
	 */
	public static void main(String[] args) throws InterruptedException {
//		Service s = new Service("MovementService", new IComponent[] { 	new C_HTTPAppSocket("AppSocket", 8080),
//																	new C_HTTPFormat("Formatter")});
//		s.start();
//		Thread.sleep(10*1000);
//		s.run();
		int x = 101;
		int y = 45;
		int z = 36;
		
		System.out.println(135 + Calculations.InsideServo(x, y, z));
		System.out.println(180 + Calculations.MiddleServo(x, y, z));
		System.out.println(360 - Calculations.OutsideServo(x, y, z));
	}
}