import java.io.*;
import java.util.*;

import com.m2i.formation.media.Book;
import com.m2i.formation.media.Publisher;

public class TestFile {

	public void readFile(String uri) throws IOException{

		System.out.println("Lecture du fichier "+uri);
		BufferedReader br = new BufferedReader(new FileReader(uri));
		String line = br.readLine();
		while(line!=null) {
			// traitement des lignes
			StringTokenizer st = new StringTokenizer(line,",");
			System.out.println();
			while (st.hasMoreTokens())
			{
				System.out.print(st.nextToken()+"; ");
			}
			line=br.readLine();
		}
		br.close();	
	}

	public List<Book> readBooks(String uri) throws IOException{
		List<Book> resultat = new ArrayList<Book>();
		//traitement du fichier
		System.out.println("Lecture du fichier "+uri);
		BufferedReader br = new BufferedReader(new FileReader(uri));
		String line = br.readLine();
		line=br.readLine();// premiere ligne d'entete a sauter
		// creation du livre
		while(line!=null) {
			// traitement des lignes
			StringTokenizer st = new StringTokenizer(line,",");
			Book b = new Book();
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
			resultat.add(b);
			line=br.readLine();
		}
		br.close();

		return resultat;
	}


}
