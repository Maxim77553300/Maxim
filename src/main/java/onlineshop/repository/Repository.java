package onlineshop.repository;

import onlineshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repository extends JpaRepository<Product,Integer> {

    Optional<Product> findProductName();

}
