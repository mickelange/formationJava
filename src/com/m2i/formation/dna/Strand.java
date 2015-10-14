package com.m2i.formation.dna;

import java.util.*;

public abstract class Strand {
	
	private List<Base> bases =new ArrayList<Base>();

	/**
	 * @return the bases
	 */
	public List<Base> getBases() {
		return bases;
	}

}
