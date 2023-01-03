package com.iterator;

import java.util.ArrayList;

public class MyListIterator implements Iterator {
	private ArrayList<String> items;
	private int position;
 
	public MyListIterator(ArrayList<String> items) {
		this.items = items;
		this.position = 0;
	}

	public String next() {
		if (hasNext()) {
			return items.get(position++);
		}
		return null;
		/* TODO */
	}

	public boolean hasNext() {
		return position < items.size();
		/* TODO */
	}
}
