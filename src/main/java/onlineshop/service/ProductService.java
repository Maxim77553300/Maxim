package onlineshop.service;

import onlineshop.entity.Product;
import onlineshop.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private Repository repository;

    @Autowired
    public ProductService(Repository repository) {
        this.repository = repository;
    }

    public List<Product> findAllProduct() {
        return null;
    }


    public Product addProduct(Product product) throws Exception {
        Optional<Product> productName = repository.findProductName();
        if (productName.isEmpty()) {
            return repository.save(product);
        } else {
            throw new Exception("Error!! -This product is exist!!");
        }
    }
}
