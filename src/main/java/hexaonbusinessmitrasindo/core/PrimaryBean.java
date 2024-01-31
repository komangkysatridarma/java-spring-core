package hexaonbusinessmitrasindo.core;
import hexaonbusinessmitrasindo.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class PrimaryBean {

    @Primary
    @Bean
    public Foo foo1(){
        Foo foo = new Foo();
        return foo;
    }
    @Bean
    public Foo foo2(){
        Foo foo = new Foo();
        return foo;
    }
}
