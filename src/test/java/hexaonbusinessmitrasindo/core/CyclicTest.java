package hexaonbusinessmitrasindo.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicTest {

    private ApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(Cyclic.class);
    }

    @Test
    void test(){
        Assertions.assertThrows(Throwable.class, () -> {
           ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cyclic.class);
        });

    }

}
