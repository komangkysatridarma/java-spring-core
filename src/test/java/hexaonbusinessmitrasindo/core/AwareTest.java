package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.service.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class AwareTest {

    @Configuration
    @Import({
            AuthService.class
    })
    public static class AwareConfiguration{
    }

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(AuthService.class);
        context.registerShutdownHook();
    }

    @Test
    void testAware(){
        AuthService authService = context.getBean(AuthService.class);

        Assertions.assertNotNull(authService.getApplicationContext());
        Assertions.assertSame(context, authService.getApplicationContext());
    }
}
