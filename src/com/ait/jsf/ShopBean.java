package com.ait.jsf;

//import java.io.Serializable;

import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;

@ManagedBean
//@RequestScoped
//public class ShopBean implements Serializable {
public class ShopBean {
	//private static final long serialVersionUID = 1L;
		
	private static int productID; // WORKED BY CHANGING TO STATIC
	private int quantity;
		
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		ShopBean.productID = productID;
		//this.productID = productID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		//ShopBean.quantity = quantity;
		this.quantity = quantity;
	}
	
	// OK - Handle "Add to Cart" button click event
	public String addHandler() {
		CartBean cart = Helper.getBean("cartBean",CartBean.class);
		//System.out.println("ShopBean Line 36:");
		//System.out.println("id " + productID + " quantity " + quantity);
		cart.addItemToCart(productID, quantity);
		return null;
	}
	
	// OK - Handle "Remove" button click event
	public String removeHandler() {
		CartBean cart = Helper.getBean("cartBean", CartBean.class);
		cart.removeItemFromCart(productID);
		return null;
	}
}
