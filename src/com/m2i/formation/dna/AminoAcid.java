package com.m2i.formation.dna;

public class AminoAcid {
	
	private String LongName;
	private char code;
	private String Trigram;
	/**
	 * @return the longName
	 */
	public String getLongName() {
		return LongName;
	}
	/**
	 * @param longName the longName to set
	 */
	public void setLongName(String longName) {
		LongName = longName;
	}
	/**
	 * @return the code
	 */
	public char getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(char code) {
		this.code = code;
	}
	/**
	 * @return the trigram
	 */
	public String getTrigram() {
		return Trigram;
	}
	/**
	 * @param trigram the trigram to set
	 */
	public void setTrigram(String trigram) {
		Trigram = trigram;
	}
	
	protected AminoAcid () {
	}
	
	public AminoAcid factory (char code){
		return null;
		
	}
}
