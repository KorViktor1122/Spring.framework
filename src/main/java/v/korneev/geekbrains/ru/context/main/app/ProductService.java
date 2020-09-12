package v.korneev.geekbrains.ru.context.main.app;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    private ProductRepository productRepository;

    @Value("Hello")
    private String str1;

    @Value("100")
    int val1;

    public ProductService(@Qualifier(value = "ProductRepository") ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public Product findProductById(Long id){
        return productRepository.findProductById(id);
    }
}
