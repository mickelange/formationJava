package com.m2i.formation.media.entities;

public interface IItem extends IEntity{

	/**
	 * @return the id
	 */
	int getId();

	/**
	 * @param id the id to set
	 */
	void setId(int id);

	/**
	 * @return the prix
	 */
	double getPrix();

	/**
	 * @param prix the prix to set
	 */
	void setPrix(double prix);

}