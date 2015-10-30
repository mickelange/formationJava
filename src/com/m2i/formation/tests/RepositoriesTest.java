package com.m2i.formation.tests;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import org.junit.*;

import com.m2i.formation.media.entities.*;
import com.m2i.formation.media.repositories.*;

public class RepositoriesTest {

	private Book bookResult; 
	private List<Book> listeResult;
	private BookRepository bookRepo;
	
	@Before
	public void SetUp(){
		
		 bookRepo = new BookRepository();
		 bookResult = new Book();
		 listeResult = new ArrayList<Book>();
		 bookRepo.setUri("C:\\Formation\\TP\\Livres.csv");		
	}
	
	@After
	public void TearDown(){
		
		 bookRepo = null;;
		 bookResult = null;
		 listeResult = null;
	}
	
	@Test
	public void test() {
		int i =1;
		i++;
		Assert.assertEquals(2, i);
	}
	
	
	
	@Test
	public void  getAlltest() throws IOException {
		
		listeResult = bookRepo.getAll();
		Assert.assertEquals(3,listeResult.size() );		
	}
	
	@Test
	public void getByIdTest() throws IOException {
		
		int id = 3;
		bookResult = bookRepo.getById(id);
		Assert.assertEquals(3,bookResult.getId() );	

	}
	
	@Test
	public void getByPriceTest() throws IOException {
		
		double price = 19;
		listeResult = bookRepo.getByPrice(price);
		
		Assert.assertEquals(2,listeResult.size());	

	}
	
	@Test
	public void getByTitleTest() throws IOException {
		
		listeResult = bookRepo.getByTitle("le");
		Assert.assertEquals(2,listeResult.size());	

	}
	
	@Test
	public void getUriTest() throws IOException {
		
		//bookRepo.setUri("C:\\Formation\\TP\\Livres.csv");
		Assert.assertEquals("C:\\Formation\\TP\\Livres.csv",bookRepo.getUri());	

	}
	
	
	@Ignore
	public void InsertBooktest() throws IOException {
		Book b = new Book();
		b.setTitre("java");
		b.setPrix(9.99);
		int nbBook= bookRepo.getAll().size();
		bookRepo.insert(b);
		Assert.assertEquals(nbBook+1,bookRepo.getAll().size());
	
	}
	@Test
	public void getAll() throws SQLException {
		
		BookDbRepository repo = new BookDbRepository();
		List<Book> l = repo.getAll();
		Assert.assertTrue(l.size()>0);
			

	}
	

}
