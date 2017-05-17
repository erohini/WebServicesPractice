package net.main;

import net.webservicex.Airport;
import net.webservicex.AirportSoap;
import net.webservicex.GetAirportInformationByCityOrAirportName;

public class MainClass {

	public static void main(String[] args) {
		String airportCode = "DTW";
		Airport airport=new Airport();
		AirportSoap airportSoap=airport.getAirportSoap();
		System.out.println(airportSoap.getAirportInformationByAirportCode(airportCode));

	}

}
