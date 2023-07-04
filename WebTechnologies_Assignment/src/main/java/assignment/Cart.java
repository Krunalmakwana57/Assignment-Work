package assignment;

import java.util.HashSet;
import java.util.Set;

public class Cart {
    private int cartId;
    private double total;
    private String name;
    private Set<Item> items = new HashSet<>();
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Item> getItems() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", total=" + total + ", name=" + name + ", items=" + items + "]";
	}

    
}

