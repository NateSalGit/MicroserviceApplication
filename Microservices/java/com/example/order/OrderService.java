package com.example.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // e.g. getProductById, updateProduct, deleteProduct, etc.
    
    public Order getOrder(Long id) {
        return orderRepository.findById(id).orElse(null);
}

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
}

    public Order updateOrder(Long id, Order newOrder) {
    Order existing = getOrder(id);
    if (existing != null) {
        existing.setOrderId(newOrder.getOrderId());
        existing.setProductId(newOrder.getProductId());
        existing.setQuantity(newOrder.getQuantity());
        existing.setUnitPrice(newOrder.getUnitPrice());
        return orderRepository.save(existing);
    }
    return null;
}

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
}
}
    

