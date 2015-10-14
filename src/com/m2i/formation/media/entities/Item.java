package com.m2i.formation.media.entities;

public abstract class Item implements IItem  {
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#getId()
	 */
	@Override
	public int getId() {
		return id;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#setId(int)
	 */
	@Override
	public void setId(int id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#getPrix()
	 */
	@Override
	public double getPrix() {
		return prix;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#setPrix(double)
	 */
	@Override
	public void setPrix(double prix) {
		this.prix = prix;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#getDescription()
	 */

	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#setDescription(java.lang.String)
	 */

	private int id;
	private double prix;
	
}
