import java.io.IOException;
import java.util.*;

//import com.m2i.formation.geometry.*;
import com.m2i.formation.media.*;


public class Hello {


	/**
	 * Fonction add
	 * @param a premier paramètre
	 * @param b deuxième paramètre
	 * @return la somme de a et b
	 */
	public static int add(int a, int b){
		return a+b;

	}
	/**
	 * Fonction display : affiche le tableau sur une ligne.
	 * @param tableau
	 */
	public static void display(int[] tableau){
		for( int i =0; i< tableau.length; i++){
			System.out.print(tableau[i]+"; ");
		}
	}

	/**
	 *  Fonction sum
	 * @param tableau
	 * @return  un double : la somme des éléments du tableau
	 */
	public static int sum(int[] tableau){
		int maSomme = 0;
		for(int i = 0; i< tableau.length; i++){
			//maSomme = maSomme+ tableau[i];
			maSomme += tableau[i];
		}
		return maSomme;
	}

	/**
	 *  Fonction max 
	 * @param tableau
	 * @return la valeur maximum du tableau
	 */
	public static int max(int[] tableau){
		int monMax =  tableau[0];
		for(int i = 1; i< tableau.length; i++){
			if(tableau[i]> monMax){
				monMax =  tableau[i];
			}
		}
		return monMax;
	}
	/**
	 *  Fonction min 
	 * @param tableau
	 * @return la valeur minimum du tableau
	 */
	public static int min(int[] tableau){
		int monMin =  tableau[0];
		for(int i = 1; i< tableau.length; i++){
			if(tableau[i]< monMin){
				monMin =  tableau[i];
			}
		}
		return monMin;
	}

	/**
	 * Fonction average
	 * @param tableau
	 * @return un double : la moyenne des éléments du tableau
	 */
	public static double average(int[] tableau){

		return (double)sum(tableau)/tableau.length;
	}

	/**
	 * Fonction randomize
	 * @param tableau
	 */
	public static void randomize(int[] tableau){

		Random randomno = new Random();
		for ( int i =0; i<tableau.length; i++){
			tableau[i] =  randomno.nextInt(100);
		}
	}


	public static int[] createRandomlyTab( int length){
		int[] tab = new int[length];
		Random rnd = new Random();
		for ( int i =0; i<tab.length; i++){
			tab[i] =  rnd.nextInt(100);
		}
		return tab;
	}

	// put( int[]tab, int index,int value)
	public static void put( int[]tab,int index, int value){
		tab[index] = value;
	}

	//permut( int[]tab, int index,int index2)
	public static void permut( int[]tab,int index, int index2){
		int maVariable =  tab[index];
		tab[index] = tab[index2];
		tab[index2] = maVariable;
	}

	//permut( int[]tab, int index) permutte n et n-1
	/*public static void permut2( int[]tab,int index){
		int maVariable =  tab[index];
		tab[index] = tab[index -1];
		tab[index -1] = maVariable;
	}*/	
	public static void permut2( int[]tab,int index){
		permut(tab, index, index -1);
	}

	//remove(int[]tab, int index) --> 1,2,3,4,5 remove( tab, 1) : 1,3,4,5,5
	public static void remove( int[]tab,int index){
		for( int i= index;i<tab.length-1; i++){
			tab[i] = tab[i+1];
		}
	}

	public static int[] clone(int[] tab){
		int tab2[] = new int[tab.length];
		for(int i =0; i<tab.length; i++){
			tab2[i] = tab[i];		
		}
		return tab2;
	}

	// even : 12345... --> 24... 2 tableau de même taille
	public static int[] even(int[] tab){
		int tab2[] = new int[tab.length];
		int j =0;
		for(int i =0; i<tab.length; i++){
			if(tab[i]%2 == 0){
				tab2[j] = tab[i];
				j++;
			}
		}
		return tab2;
	}

	//inverse 12345 --> 54321

	public static int[] inverse(int[] tab){
		int tab2[] = new int[tab.length];

		for(int i = 0;i<tab.length; i++){
			tab2[tab.length-1-i] = tab[i];		
		}
		return tab2;
	}

	//remove2 12345 --> 1245 avec taille du nouveau tableau = taille de l'ancien-1
	public static int[] remove2(int[] tab, int index){
		int tab2[] = new int[tab.length-1];
		int nouvelIndex =0;
		for(int i =0; i<tab.length; i++){
			if(i != index ){
				tab2[nouvelIndex] = tab[i];
				nouvelIndex++;
			}
		}
		return tab2;
	}

	//insert2 12345 --> 1299345
	/*public static int[] insert2(int[] tab, int index, int value){
		int tab2[] = new int[tab.length+1];
		int nouvelIndex =0;
		for(int i =0; i<tab.length; i++){
			if(nouvelIndex != index ){
			tab2[nouvelIndex] = tab[i];
			}
			else {
				tab2[nouvelIndex] =value;
				nouvelIndex++;
				tab2[nouvelIndex] =tab[i];
			}
			nouvelIndex++;
		}
		return tab2;
	}*/

	public static int[] insert2(int[] tab, int index, int value){
		int[] tab2 = new int[tab.length+1];
		for(int i = 0; i<index; i++){
			tab2[i] = tab[i];	
		}
		tab2[index] = tab[index];
		for(int i = index; i<tab.length; i++){
			tab2[i +1] = tab[i];	
		}
		return tab2;

	}


	//insert(int[]tab, int index, int value) --> 1,2,3,4,5 insert( tab,2, 99) : 1,2,99,3,4

	public static void insert( int[]tab,int index, int value){
		for( int i= tab.length-1;i>index; i--)
		{
			tab[i] = tab[i-1];
		}
		//tab[index] = value;
		put(tab, index, value);

	}

	/**
	 * Fonction bubbleSort
	 * @param tab
	 * @return un tableau trié par le trie a bulle
	 */
	public static int[] bubbleSort(int[] tab){
		int[] result  = clone(tab);
		for( int i= tab.length-1;i>0; i--)
		{
			for( int j = 0; j<i; j++){
				if(result[j]> result[j+1]){
					permut2(result,j+1);
				}
			}
		}

		return result;
	}


	public static int[] minSort(int[] tab){
		int[] tampon  = clone(tab);
		int[] result  = clone(tab);
		int ValMax = max(tampon)+1;
		for( int i =0;i< tampon.length; i++)
		{
			int monMin =  tampon[0];
			int indexMin =  0;
			for(int j = 1; j< tampon.length; j++){
				if(tampon[j]< monMin){
					monMin =  tampon[j];
					indexMin = j;
				}
			}
			result[i]=monMin;
			tampon[indexMin] = ValMax;	
		}
		return result;
	}

	public static int recursiveSum(int[] tab, int indiceRecursif)
	{
		int sum = 0;
		if(indiceRecursif == tab.length )
		{
			sum = 0;
		}
		else{
			sum = tab[indiceRecursif] +  recursiveSum(tab,indiceRecursif +1);
		}   
		return sum;
	}

	public static int factor(int fact)
	{

		if(fact==0){
			return 1;
		}
		else{
			return (fact * factor(fact -1));
		}
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		String myPhrase = "Bonjour Michel! :o)";
		System.out.println(myPhrase);
		/*int i = 1;
		int  j = 2;

		System.out.println(myPhrase);
		System.out.println("valeur de i " + i);
		System.out.println("valeur de j " + j);

		int myVariable;
		myVariable = i;
		i=j;
		j= myVariable;

		System.out.println("valeur de i après inversion : " + i);
		System.out.println("valeur de j après inversion :" + j);

		///TP3

		for(i = 0; i<100; i++)
		{
			System.out.print(i +";");	
		}


		for(i = 10; i>0; i--)
		{
			System.out.print(i+";");	
		}
		System.out.println();

		for(i = 2; i<=1024; i= i+i)
		{
			System.out.print(i+";");	
		}
		System.out.println();

		i=0;
		j=2;

		int toTest = 2;
		for( i = 0; i<500;i++){
			boolean isPrime = true;
			j=2;
			while(isPrime && j<toTest){
					if(toTest % j ==0){
						isPrime = false;
						}
					j++;
			}
			if(isPrime){
				System.out.println(toTest);	
				}
				toTest++;
		}

		System.out.println("---------- TD 4 ");

		System.out.println ("L'addition de 4+5 est : " 
				+ add(4,5));*/

		/*System.out.println("---------- TD 5 Octobre ");

		int[] monTableau = {2,4,6,8,10,1,3,5,7,9};
		display(monTableau);
		System.out.println();
		System.out.println(" la somme des éléments du tableau : " + sum(monTableau));
		System.out.println(" le maximum du tableau : " + max(monTableau));
		System.out.println(" la moyenne du tableau : " + average(monTableau));

		randomize(monTableau);
		System.out.println(" mon tableau après random :");
		display(monTableau);
		System.out.println(" la somme des éléments du tableau : " + sum(monTableau));
		System.out.println(" le maximum du tableau : " + max(monTableau));
		System.out.println(" la moyenne du tableau : " + average(monTableau));

		int[] monTableau2 = createRandomlyTab(monTableau.length);
		System.out.println(" mon tableau après random2 :");
		display(monTableau2);
		System.out.println(" la somme des éléments du tableau : " + sum(monTableau2));
		System.out.println(" le maximum du tableau : " + max(monTableau2));
		System.out.println(" la moyenne du tableau : " + average(monTableau2));
		System.out.println(" test put ");
		put(monTableau, 2, 99);
		display(monTableau);
		System.out.println();
		System.out.println(" test permut  1 et 3: ");
		permut(monTableau, 1, 3);
		display(monTableau);
		System.out.println();
		System.out.println(" test permut 2 2 : ");
		permut2(monTableau, 2);
		display(monTableau);
		System.out.println();
		System.out.println(" test remove   1: ");
		remove(monTableau, 1);
		display(monTableau);
		System.out.println();
		System.out.println(" test insert 99 en  2 : ");
		insert(monTableau, 2, 99);
		display(monTableau);
		System.out.println();
		System.out.println(" clone de tableau : ");
		display(monTableau);
		System.out.println();
		int[] tableau2 = clone(monTableau);
		display(tableau2);
		System.out.println();
		System.out.println(" valeurs paire d'un tableau : ");
		display(monTableau);
		System.out.println();
		int[] tableau3 = even(monTableau);
		display(tableau3);
		System.out.println();
		System.out.println("tableau inversé");
		int[] tableau4 = inverse(monTableau);
		display(tableau4);
		System.out.println();
		System.out.println("tableau avec valeur en moins :");
		int[] tableau5 = remove2(monTableau, 2);
		display(tableau5);
		System.out.println();
		System.out.println("tableau avec valeur en plus :");
		int[] tableau6 = insert2(monTableau, 2,99);
		display(tableau6);
		System.out.println("tableau trié avec tri a bulle :");
		int[] tableau7 = bubbleSort(monTableau);
		display(tableau7);
		System.out.println();
		System.out.println("tableau trié avec tri par min :");
		int[] tableau8 = minSort(monTableau);
		display(tableau8);
		System.out.println();
		System.out.println("Somme recursive d'un tableau :");
		System.out.println( recursiveSum(monTableau, 0));

		System.out.println();
		System.out.println("factoriel :");
		System.out.println( factor(5));
		System.out.println();*/

		/////////////////////////////////POO

		/*Book b = new Book();
		b.setTitre("java");
		b.afficher();
		Book c = new Book();
		c.setTitre("C#");
		c.afficher();
		Book d = new Book();
		d.setTitre("java");
		d.afficher();
		System.out.println(c.getTitre());
		System.out.println("b et d sont ils identiques?:" + (b==d));
		if(b==d){
			System.out.println("b et d sont identiques" );
		}
		else{
			System.out.println("b et d sont différents!" );
		}

		Publisher editeur = new Publisher();
		editeur.setId(12345);
		editeur.setNom("hachette");
		b.setEditeur(editeur);
		System.out.println((b.getEditeur()).getNom());
		//
		Author auteur1 = new Author();
		auteur1.setFirstName("Elizabeth") ;
		auteur1.setLastName("George");

		Author auteur2 = new Author();
		auteur2.setFirstName("Tom");
		auteur2.setLastName("Clancy");

		try {
			b.addAuthor(auteur2);
			b.addAuthor(auteur1);
		} catch (MediaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.setCategory(BookCategory.SF);
		b.displayAuthor();*/

		////test static
		/*Counter c1 = new Counter();
		Counter c2 = new Counter();

		System.out.println(c1.increment());
		System.out.println(c2.increment());
		System.out.println(c1.increment());
		System.out.println(c2.increment());
		System.out.println(Counter.increment());
		System.out.println(Counter.increment());//marche car statique!*/


		/*	Media m = new Book();
		m.setPrix(10);
		double prix = m.getVATPrice();
		System.out.println(prix);*/


		/*List<Book> listeLivres = CollectionTest.listTest();
		System.out.println("Liste des livres avec une ArrayList : ");
		for(Book b : listeLivres ){
			System.out.println(b.getTitre());
		}

		Set<Book> setLivres = CollectionTest.setTest();
		System.out.println("Liste des livres avec un HashSet : ");
		for(Book b : setLivres ){
			System.out.println(b.getTitre());
		}


		Map<Integer,Book> mapLivres = CollectionTest.MapTest();
		System.out.println("Liste des livres avec un HashSet : ");
		for(Book b : mapLivres.values() ){
			System.out.println(b.getTitre());
		}
		// autre façon de faire
		for(int key : mapLivres.keySet()){
			System.out.println(mapLivres.get(key).getTitre());
		}

		//

		Media m = new Book();
		m.setPrix(10);
		Media m2 = new Cd();
		m2.setPrix(10);
		Media m3 = new Dvd();
		m3.setPrix(10);

		Cart monChariot  = new Cart();
		monChariot.getMedias().add(m);
		monChariot.getMedias().add(m2);
		monChariot.getMedias().add(m3);

		double total = monChariot.getVATPrice();
		System.out.println("le total de mon chariot");
		System.out.println(total);

		String maChaine = "3";
		int monEntier = Integer.getInteger(maChaine);
		monEntier = Integer.parseInt(maChaine);
		Integer.toString(monEntier);*/

		String monUri = "C:\\Formation\\TP\\Livres.csv";
		TestFile monFichierTest = new TestFile(); 
		try {
			monFichierTest.readFile(monUri);
			System.out.println();
			System.out.println("Tableau de livre a partir d\"un fichier : ");
			List<Book> listeLivres = monFichierTest.readBooks(monUri);
			for(Book b : listeLivres ){
				System.out.print("Titre : "+ b.getTitre()+ "; ");
				System.out.print("Prix : "+ b.getPrix()+ "; ");
				System.out.print("Editeur : "+ (b.getEditeur()).getNom()+ "; ");
				System.out.print("Nombre de pages : "+ b.getNbPages()+ "; ");
				System.out.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Singleton instance = Singleton.getInstance();


	}
}
