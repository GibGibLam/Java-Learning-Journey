package com.fdmgroup.generics_exercise.library;


import java.util.HashMap;
import java.util.Map;

public class Catalog<T extends ILibraryItem<I>, I extends Number> {
	Map<I, T> catalogMap = new HashMap<>();
	
	public void addItem(T item) {
		catalogMap.put(item.getId(), item);

	}
	
	public T getItem(I catalogId) {
		return catalogMap.get(catalogId);
	}
	


}
