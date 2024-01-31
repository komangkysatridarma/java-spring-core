package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryBeanTest {
    private ApplicationContext context = new AnnotationConfigApplicationContext(PrimaryBean.class);

    @Test
    void primaryBean() {
        Foo foo = context.getBean(Foo.class);
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo, foo2);
        Assertions.assertNotSame(foo1, foo2);

    }
}
