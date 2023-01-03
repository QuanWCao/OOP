package com.iterator;

public class MyArrayIterator implements Iterator {
	private String[] items;
	private int position;
 
	public MyArrayIterator(String[] items) {
		this.items = items;
		this.position = 0;
	}
 
	public String next() {
		if (hasNext()) {
			return items[position++];
		}
		return null;
		/* TODO */
	}
 
	public boolean hasNext() {
		return position < items.length;
		/* TODO */
	}
}
