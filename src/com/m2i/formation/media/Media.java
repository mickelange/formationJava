package com.m2i.formation.media;

import java.util.Date;

public abstract class Media extends Item {
	
	private int id;
	private String titre;
	private Author[] authors = new Author[10];
	private int nbAuthors =0;
	private Date date;
	private Publisher editeur;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the editeur
	 */
	public Publisher getEditeur() {
		return editeur;
	}
	/**
	 * @param editeur the editeur to set
	 */
	public void setEditeur(Publisher editeur) {
		this.editeur = editeur;
	}
	
	public void afficher(){
		System.out.println(titre);
	}

	public void addAuthor( Author auteur) throws MediaException {
		if(nbAuthors>10){
			throw new MediaException("Too many authors");
		}
		authors[nbAuthors] = auteur;
		nbAuthors++;	
	}

	public void displayAuthor( ) {
		System.out.println("liste des auteurs de " + this.titre + " : ");
		//System.out.println();
		for( int i = 0; i< this.nbAuthors; i++)
		{
			System.out.println(this.authors[i].getFirstName() + " " +this.authors[i].getLastName());
			//System.out.println();

		}
	}
	
	public abstract double getVATPrice();
	
}
	

