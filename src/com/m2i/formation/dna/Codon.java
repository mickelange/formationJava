package com.m2i.formation.dna;

public class Codon {

	private RNABase[] rnaBases = new RNABase[3];

	/**
	 * @return the rnaBases
	 */
	public RNABase[] getRnaBases() {
		return rnaBases;
	}
	
	private Protein aminoAcid;

	/**
	 * @return the aminoAcid
	 */
	public Protein getAminoAcid() {
		return aminoAcid;
	}

	/**
	 * @param aminoAcid the aminoAcid to set
	 */
	public void setAminoAcid(Protein aminoAcid) {
		this.aminoAcid = aminoAcid;
	}
}
