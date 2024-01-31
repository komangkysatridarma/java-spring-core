package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DepensOnTest {
    private ApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void testDepensOn(){
        context.getBean(Foo.class);
    }
}
