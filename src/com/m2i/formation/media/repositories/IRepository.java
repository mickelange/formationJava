package com.m2i.formation.media.repositories;

import java.io.IOException;
import java.util.*;

import com.m2i.formation.media.entities.*;

public interface IRepository<T extends IEntity> {
	
	String getUri();
	void setUri(String uri);
	List<T>getAll()throws IOException;
	T getById( int id)throws IOException;
	List<T>getByPrice(double price)throws IOException;
	List<T>getByTitle(String word)throws IOException;

}
