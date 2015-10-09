package com.m2i.formation.media;

public class Dvd extends Media {
	
	 private Region region;

	/**
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public double getVAPrice(){
		return 1.2*getPrix();
	}

}
