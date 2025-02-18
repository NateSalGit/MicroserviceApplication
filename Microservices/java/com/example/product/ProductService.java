package com.example.product;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    // e.g. getProductById, updateProduct, deleteProduct, etc.
    
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
}

    public List<Product> getAllProducts() {
        return productRepository.findAll();
}

    public Product updateProduct(Long id, Product newProduct) {
    Product existing = getProduct(id);
    if (existing != null) {
        existing.setName(newProduct.getName());
        existing.setPrice(newProduct.getPrice());
        existing.setStockQuantity(newProduct.getStockQuantity());
        return productRepository.save(existing);
    }
    return null;
}

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
}
}

    

