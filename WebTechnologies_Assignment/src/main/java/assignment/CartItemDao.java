package assignment;

import java.util.List;

public interface CartItemDao {
    void addItem(Item item);
    void updateItem(Item item);
    void deleteItem(int itemId);
    Item getItem(int itemId);
    List<Item> getAllItems();
}

