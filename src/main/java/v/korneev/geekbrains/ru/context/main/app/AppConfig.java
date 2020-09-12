package v.korneev.geekbrains.ru.context.main.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"v.korneev.geekbrains.ru.context.main.app"})

public class AppConfig {
@Bean
    public StdClass stdClass(){
    StdClass stdClass = new StdClass();
    stdClass.setValue(50);
    return stdClass;
}

}
