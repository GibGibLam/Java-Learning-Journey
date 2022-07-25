package com.fdmgroup.generics_exercise.library;

public class Borrowers<I extends Number> implements ILibraryItem<I> {
	private I id;
	private String name;
	@Override
	public I getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Borrowers [id=" + id + ", name=" + name + "]";
	}
	public Borrowers(I id, String name) {
		this.name = name;
		this.id = id;
	}

	
}
