package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.data.Connection;
import hexaonbusinessmitrasindo.core.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {
    //jadi ini awalnya memakai interface si ApplicationContext, tapi saya ingin menggunakan method close(), di interface itu tidak ada methodnya, adanya di turunannya yaitu ConfigurableApplicationContext
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        //atau bisa juga memakai method ini untuk close
        context.registerShutdownHook();
    }

    //setelah selesai maka akan di close databasenya
    @AfterEach
    void tearDown(){
//        context.close();
    }

    @Test
    void testLifeCycle(){
        Connection connection = context.getBean(Connection.class);
    }

    @Test
    void testServer(){
        Server server = context.getBean(Server.class);
    }
}
