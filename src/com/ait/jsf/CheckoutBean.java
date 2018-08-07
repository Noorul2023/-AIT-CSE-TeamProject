package com.ait.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "checkoutBean")
@SessionScoped
public class CheckoutBean {
	public String myCheckoutHandler() {
        // Get the CartBean instance.
        CartBean cart = Helper.getBean("cartBean", CartBean.class);
        
        if (cart.getItemCount() > 5) {
            return "CheckoutBulk";
        }
        return "Checkout";
    }
}
