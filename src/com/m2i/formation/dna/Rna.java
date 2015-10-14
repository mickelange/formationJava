package com.m2i.formation.dna;

import java.util.*;

public class Rna extends Strand{
	
	public List<RNABase> BaseChain = new ArrayList<RNABase>();

	/**
	 * @return the baseChain
	 */
	public List<RNABase> getBaseChain() {
		return BaseChain;
	}

}
