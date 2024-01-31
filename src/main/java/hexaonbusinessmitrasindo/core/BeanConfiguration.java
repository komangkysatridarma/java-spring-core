package hexaonbusinessmitrasindo.core;

import org.springframework.context.annotation.Bean;
import hexaonbusinessmitrasindo.core.data.Foo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfiguration {

    @Primary
    @Bean
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
