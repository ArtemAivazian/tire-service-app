package cz.cvut.fel.nss.repository;

import cz.cvut.fel.nss.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
//    List<Product> findAllByOrderId(Long orderId);
    Product findByName(String name);
}
