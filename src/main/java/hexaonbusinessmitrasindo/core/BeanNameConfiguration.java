package hexaonbusinessmitrasindo.core;

import org.springframework.context.annotation.Bean;
import hexaonbusinessmitrasindo.core.data.Foo;
import org.springframework.context.annotation.Primary;

public class BeanNameConfiguration {

    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1(){
        return new Foo();
    }

    @Bean(value = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }
}
