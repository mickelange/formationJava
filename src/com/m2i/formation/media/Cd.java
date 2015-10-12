package com.m2i.formation.media;

public class Cd extends Media {
	int nbTrack =0;

	/**
	 * @return the nbTrack
	 */
	public int getNbTrack() {
		return nbTrack;
	}

	/**
	 * @param nbTrack the nbTrack to set
	 */
	public void setNbTrack(int nbTrack) {
		this.nbTrack = nbTrack;
	}
	
	@Override
	public double getVATPrice(){
		return 1.2*getPrix();
	}


}
