import java.util.*;
import com.m2i.formation.media.*;

public class CollectionTest {
	
	
	public CollectionTest(){
		
	}//constructeur de la classe
	
	public static List<Book> listTest(){
		List<Book> liste= new ArrayList<Book>();
		Book b1 = new Book();
		b1.setTitre("livre1");
		Book b2 = new Book();
		b2.setTitre("livre2");
		Book b3 = new Book();
		b3.setTitre("livre3");
		liste.add(b1);
		liste.add(b2);
		liste.add(b3);
		
		Book b4 = new Book();
		b4.setTitre("livre4");
		liste.add(1,b4);
		liste.remove(2);

		return liste;
	}
	
	public static Set<Book> setTest(){
		Set<Book> set= new HashSet<Book>();
		Book b1 = new Book();
		b1.setTitre("livre1");
		b1.setId(1);
		Book b2 = new Book();
		b2.setTitre("livre2");
		b2.setId(2);
		Book b3 = new Book();
		b3.setTitre("livre3");
		b3.setId(3);
		Book b4 = new Book();
		b4.setTitre("livre4");
		b4.setId(4);
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b1);
		
		return set;
	}

	public static Map<Integer,Book> MapTest(){
		Map<Integer,Book> map= new HashMap<Integer,Book>();
		Book b1 = new Book();
		b1.setTitre("livre1");
		b1.setId(1);
		Book b2 = new Book();
		b2.setTitre("livre2");
		b2.setId(2);
		Book b3 = new Book();
		b3.setTitre("livre3");
		b3.setId(3);
		Book b4 = new Book();
		b4.setTitre("livre4");
		b4.setId(4);
		map.put(b1.getId(),b1);
		map.put(b2.getId(),b2);
		map.put(b3.getId(),b3);
		map.put(b4.getId(),b4);
		map.put(b1.getId(),b1);
		map.remove(b2.getId());
		
		return map;
	}
}
