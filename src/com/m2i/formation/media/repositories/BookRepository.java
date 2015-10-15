package com.m2i.formation.media.repositories;

//import java.util.regex.*;
import java.io.*;
import java.util.*;
import com.m2i.formation.media.entities.*;

public class BookRepository implements IRepository<Book> {


	private String uri="";

	public BookRepository(){	
	}
	
	private  List<Book> cache = null;
	
	private  List<Book> getCache()  throws IOException {
		if(cache == null){
			cache= cacheFactory();
		}
		return cache;
	}

	
	
	@Override
	public String getUri() {
		// TODO Auto-generated method stub
		return uri;
	}

	@Override
	public void setUri(String uri) {
		// TODO Auto-generated method stub
		this.uri =uri;
	}

	
	public List<Book> cacheFactory() throws IOException {

		List<Book> resultat = new ArrayList<Book>();
		//traitement du fichier
		BufferedReader br = new BufferedReader(new FileReader(uri));
		String line = br.readLine();
		line=br.readLine();// premiere ligne d'entete a sauter
		// creation du livre
		while(line!=null) {
			// traitement des lignes
			Book b= getBookFromLineCSV(line);
			resultat.add(b);
			line=br.readLine();
		}
		br.close();

		return resultat;
	}
	
	@Override
	public List<Book> getAll() throws IOException {
		return  getCache();
	
	}
	
	/*@Override
	public Book getById(int id) throws IOException {

		Book b = null;
		for(Book b1 : getCache()){
			
		}
		return b;
		
	}*/
	
	
	@Override
	public Book getById(int id) throws IOException {
		Book b = null;
		for(Book b2 : getCache()) {
			if(b2.getId() == id) {
				b = b2;
			}
		}
		return b;
	}

	@Override
	public List<Book> getByPrice(double price) throws IOException {
		List<Book> l = new ArrayList<Book>();
		for(Book b : getCache()) {
			if(b.getPrix() <= price) {
				l.add(b);
			}
		}
		return l;
	}

	@Override
	public List<Book> getByTitle(String word) throws IOException {
		List<Book> l = new ArrayList<Book>();
		for(Book b : getCache()) {
			if((b.getTitre().toUpperCase()).matches("(?i).*"+word.toUpperCase()+".*") ) {
				l.add(b);
			}
		}
		return l;
	}

	public Book getBookFromLineCSV(String line){

		Book b = new Book();
		// traitement de la ligne
		StringTokenizer st = new StringTokenizer(line,",");
		//ID
		b.setId(Integer.parseInt(st.nextToken()));	
		//titre
		b.setTitre(st.nextToken());		
		//prix
		b.setPrix(Double.parseDouble(st.nextToken()));	
		//editeur
		Publisher editeur = new Publisher();
		editeur.setNom(st.nextToken());
		b.setEditeur(editeur);
		//nbpage
		b.setNbPages(Integer.parseInt(st.nextToken()));

		return b;

	}



	public void insert(Book b) {
		// TODO Auto-generated method stub
	}




}
