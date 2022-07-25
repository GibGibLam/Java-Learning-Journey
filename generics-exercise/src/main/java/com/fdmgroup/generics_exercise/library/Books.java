package com.fdmgroup.generics_exercise.library;

public class Books<I extends Number> implements ILibraryItem<I> {
	private I id;
	private String name;
	

	public Books(I id, String name) {
		this.name = name;
		this.id = id;
	}

	@Override
	public I getId() {

		return id;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + "]";
	}

}
