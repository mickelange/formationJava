package com.m2i.formation.media.repositories;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.m2i.formation.media.entities.Book;

public class BookDbRepository {
	
	
	private String uri = null;
	private Properties properties = null;
	private String user = null;
	private String pass = null;
	
	
	public BookDbRepository(){	
		
		properties = new Properties();
		try{
			properties.load(new FileInputStream("src/config.properties"));
		}catch(IOException e){
			e.printStackTrace();
		}
		
		uri = properties.getProperty("JDBC_URL");
		user = properties.getProperty("JDBC_User");
		pass = properties.getProperty("JDBC_PASS");
		
	}
	

	public List<Book> getAll() {
		// TODO Auto-generated method stub
		List<Book> resultat = new ArrayList<Book>();
		try {
			
			Connection conn = null;
			Statement stmt = null;
			
			System.out.println("connecting ...");
			conn = DriverManager.getConnection(uri, user, pass);
			
			stmt = conn.createStatement();
			String maRequete = "SELECT * FROM media where category = 1";
			ResultSet rs = stmt.executeQuery(maRequete);
			
			
			while(rs.next()){
				
				Book b = new Book();
				int id = rs.getInt("id");
				String titre = rs.getString("title");
				double prix = rs.getDouble("price");
				String numIsbn = rs.getString("numISBN");
				int nbPages = rs.getInt("nbPages");
				String Langue = rs.getString("langue");
				b.setId(id);
				b.setIsbn(numIsbn);
				b.setLang(Langue);
				b.setNbPages(nbPages);
				b.setTitre(titre);
				b.setPrix(prix);
				resultat.add(b);
	
			}
			stmt.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultat;
	}



	public String getUri() {
		return uri;
	}



	private void setUri(String uri) {
		this.uri = uri;
	}

}
