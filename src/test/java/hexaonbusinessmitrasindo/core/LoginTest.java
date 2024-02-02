package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.event.LoginSuccessEvent;
import hexaonbusinessmitrasindo.core.listener.LoginSuccessListener;
import hexaonbusinessmitrasindo.core.listener.UserListener;
import hexaonbusinessmitrasindo.core.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class LoginTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            UserListener.class,
    })
    public static class LoginConfiguration{
    }

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(LoginConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testLogin(){
        UserService userService = context.getBean(UserService.class);
        userService.login("Komeng", "Komeng");
    }

}
