package moto;

import java.util.Scanner;


public class Car {
	public int prodYear;
	public int ccm;
	public double kWatts;
	public String brand;
	public double multiplexer = 1.36;
	public double horsePwr;
	
	 Scanner odczyt = new Scanner(System.in);{
		System.out.println("Podaje markę samochodu: ");
		brand = odczyt.next();
		System.out.println("Podaje rok produkcji: ");
	    prodYear = odczyt.nextInt();
	    System.out.println("Podaje pojemność: ");
	    ccm = odczyt.nextInt();
	    System.out.println("Podaje moc w kW: ");
	    kWatts = odczyt.nextDouble();
	    odczyt.close();
	    horsePwr = kWatts * multiplexer;
	    
	    
	System.out.println(brand + " " + prodYear + " " + ccm + " " + kWatts + " " + horsePwr);
	
}}
