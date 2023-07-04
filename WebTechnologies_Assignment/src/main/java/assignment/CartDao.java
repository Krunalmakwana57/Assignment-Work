package assignment;

import java.util.List;

public interface CartDao {
    void addCart(Cart cart);
    void updateCart(Cart cart);
    void deleteCart(int cartId);
    Cart getCart(int cartId);
    List<Cart> getAllCarts();
}

