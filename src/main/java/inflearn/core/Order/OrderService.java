package inflearn.core.Order;

public interface OrderService {

    Order createOrder(Long memverId, String itemName,int itemPrice);
}
