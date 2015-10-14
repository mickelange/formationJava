package com.m2i.formation.dna;


import java.util.*;

public class cell {
	private List<Dna>chromosomes =new ArrayList<Dna>();
	/**
	 * @return the chromosomes
	 */
	public List<Dna> getChromosomes() {
		return chromosomes;
	}
	/**
	 * @return the rnas
	 */
	public List<Rna> getRnas() {
		return rnas;
	}
	/**
	 * @return the genome
	 */
	public List<Protein> getGenome() {
		return genome;
	}
	private List<Rna>rnas =new ArrayList<Rna>();
	private List<Protein>genome =new ArrayList<Protein>();

}
