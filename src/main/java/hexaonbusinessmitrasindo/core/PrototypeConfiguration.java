package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class PrototypeConfiguration {

    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("Create new object");
        return new Foo();
    }

}
