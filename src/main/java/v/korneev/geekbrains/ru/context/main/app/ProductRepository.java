package v.korneev.geekbrains.ru.context.main.app;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductRepository {

    private List<Product> product;

    @PostConstruct
    public void chooce() {
        product = new ArrayList<>(Arrays.asList(
                new Product((long) 1, "Pan", 100),
                new Product((long) 2, "Book", 150),
                new Product((long) 3, "apple", 30),
                new Product((long) 4, "orange", 200),
                new Product((long) 5, "Orange juice", 45),
                new Product((long) 6, "coffee", 120)
        ));
    }

    public List<Product> findAll() {
        return Collections.unmodifiableList(product);
    }

    public Product findProductById(Long id) {
        for (Product i : product) {
            if( i.getId().equals(id)){
                return i;
            }
        }
        throw new RuntimeException("Product not found");
    }

    public void save(Product product){
        product.add(product);
    }
}
