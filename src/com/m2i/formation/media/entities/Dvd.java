package com.m2i.formation.media.entities;

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
	public double getVATPrice(){
		return 1.2*getPrix();
	}

}
