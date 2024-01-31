package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.data.Bar;
import hexaonbusinessmitrasindo.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Lazy
    @Bean
    @DependsOn(value = {"bar"})
    public Foo foo(){
        log.info("Membuat objek foo");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Membuat objek bar");
        return new Bar();
    }
}
