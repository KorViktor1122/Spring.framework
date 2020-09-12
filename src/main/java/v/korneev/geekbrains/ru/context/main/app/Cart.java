package v.korneev.geekbrains.ru.context.main.app;


import org.springframework.context.annotation.Configuration;

@Configuration

public class Cart {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Cart(){

    }

    @Override
    public String toString() {
        return "Cart{" +
                "size=" + size +
                '}';
    }
}
