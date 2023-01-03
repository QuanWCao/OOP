package com.iterator;

import java.util.Arrays;

public class MyArray implements MyIterable {
	private static final int MAX_ITEMS = 6;
	private int numberOfItems;
	private String[] menuItems;
  
	public MyArray() {
		numberOfItems = 0;
		menuItems = new String[MAX_ITEMS];
	}
  
	public void addItem(String name) {

		if (numberOfItems == menuItems.length) {
			menuItems = Arrays.copyOf(menuItems, numberOfItems * 2);
		}
		menuItems[numberOfItems++] = name;

		/* TODO */

	}
 
	public String[] getMenuItems() {

		return menuItems ;
		/* TODO */
	}
  
	public Iterator createIterator() {
		return new MyArrayIterator(menuItems);
		/* TODO */
	}
 
	public String toString() {
		return "My Array Structure"+ menuItems;
	}
}
