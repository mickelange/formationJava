package com.m2i.formation.media;
import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private List<Media>medias =  new ArrayList<Media>();

	/**
	 * @return the medias
	 */
	public List<Media> getMedias() {
		return medias;
	}
	
	/**
	 * Retourne le prix TTC du panier par polymorphysme
	 * @return
	 */
	public  double getVATPrice(){
		double sum = 0;
		for(Media med : medias ){
			
			sum += med.getVATPrice();
		}	
		return sum;
		
	}

}
