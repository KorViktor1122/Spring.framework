package v.korneev.geekbrains.ru.context.main.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean("productService", ProductService.class);
        System.out.println(productService.findAll());
        System.out.println(context.getBean("stdClass", StdClass.class).getValue());

      //  Cart cart = context.getBean("cart", Cart.class);
      //  System.out.println(cart);
        context.close();
    }
}
