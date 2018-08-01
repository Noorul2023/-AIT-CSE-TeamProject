package com.ait.jsf;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CartBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private ArrayList<Item> items = new ArrayList<Item>();

	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;  
	}
	
	public void addItemToCart(int productID, int quantity) {
		Item item = new Item(productID, quantity);
		items.add(item);
	}	
	
	public void removeItemFromCart(int productID) {
		Item item = new Item(productID);
		
		for (Item searchItem : items) {
			if(searchItem.equals(item)) {
				items.remove(searchItem);
				break;
			}
		}
	}
	
	public int getItemCount() {
		return items.size();
	}
}
