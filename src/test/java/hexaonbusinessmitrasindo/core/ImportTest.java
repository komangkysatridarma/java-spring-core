package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.data.Bar;
import hexaonbusinessmitrasindo.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testImport(){
        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);
    }

}
