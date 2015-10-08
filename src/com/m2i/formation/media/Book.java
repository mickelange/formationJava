package com.m2i.formation.media;
import java.util.Date;

public class Book {

	private String Isbn;
	private int id;
	private Date date;
	private String titre;
	private int nbPages;
	private String lang;
	private Publisher editeur;
	private Author[] authors = new Author[10];
	private int nbAuthors =0;
	private BookCategory category;

	/**
	 * @return the category
	 */
	public BookCategory getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(BookCategory category) {
		this.category = category;
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

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return Isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		Isbn = isbn;
	}

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
	 * @return the nbPages
	 */
	public int getNbPages() {
		return nbPages;
	}

	/**
	 * @param nbPages the nbPages to set
	 */
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	/**
	 * @return the lang
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * @param lang the lang to set
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}

	public void afficher(){
		System.out.println(titre);
	}

	public void addAuthor( Author auteur) {
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


}
