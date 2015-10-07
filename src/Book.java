import java.util.Date;

public class Book {

	public String Isbn;
	public int id;
	public Date date;
	public String titre;
	public int nbPages;
	public String lang;
	
	public void afficher(){
		System.out.println(titre);
	}
}
