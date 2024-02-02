package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.application.FooAplication;
import hexaonbusinessmitrasindo.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest( classes = FooAplication.class)
public class SpringApplicationTest {

    @Autowired
    Foo foo;

    @Test
    void testSpringBoot(){
        Assertions.assertNotNull(foo);
    }

}
