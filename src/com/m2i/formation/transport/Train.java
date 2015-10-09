package com.m2i.formation.transport;

public class Train {
	private int id;
	private Locomotive loc;
	private Voiture[] wagons =  new Voiture[20];
	private int nbWagons = 0;
	
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
	 * @return the loc
	 */
	public Locomotive getLoc() {
		return loc;
	}

	/**
	 * @param loc the loc to set
	 */
	public void setLoc(Locomotive loc) {
		this.loc = loc;
	}
	
	public void addWagon( Voiture wagon) {
		wagons[nbWagons] = wagon;
		nbWagons++;	
	}

	public void displayWagons( ) {
		System.out.println("liste des wagons  du train" + this.id + " : ");
		//System.out.println();
		for( int i = 0; i< this.nbWagons; i++)
		{
			System.out.println(this.wagons[i].getId());
			//System.out.println();

		}
	}
	
	

}
