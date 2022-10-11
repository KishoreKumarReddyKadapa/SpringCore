package com.skslate;

public class LakshmiAirtelService {
	private String area ;
	private int noOfTowers;
	private AirtelStore airtelStores;
	public LakshmiAirtelService(String area, int noOfTowers, AirtelStore airtelStores) {
		this.area = area;
		this.noOfTowers = noOfTowers;
		this.airtelStores = airtelStores;
	}
	@Override
	public String toString() {
		return "LakshmiAirtelService [area=" + area + ", noOfTowers=" + noOfTowers + ", airtelStores=" + airtelStores
				+ "]";
	}

	
}
