package hexaonbusinessmitrasindo.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import hexaonbusinessmitrasindo.core.data.Foo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {

    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
    }

    @Test
    void testBeanFoo(){

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);

        Assertions.assertSame(foo1, foo2);

    }

    @Test
    void testDuplicateBean() {
        context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo1 = context.getBean(Foo.class);
        });
    }
}
