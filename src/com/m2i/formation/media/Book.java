package com.m2i.formation.media;


public class Book  extends Media{

	private String Isbn;
//	private Date date;
//	private String titre;
	private int nbPages;
	private String lang;
//	private Publisher editeur;
//	private Author[] authors = new Author[10];
//	private int nbAuthors =0;
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
	
	@Override
	public double getVAPrice(){
		return 1.05*getPrix();
	}




}
