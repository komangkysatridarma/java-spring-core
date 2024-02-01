package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.client.PaymentGatewayClient;
import hexaonbusinessmitrasindo.core.factory.PaymentGetwayClientFactoryBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testFactory(){
        PaymentGatewayClient client = context.getBean(PaymentGatewayClient.class);
        Assertions.assertEquals("https://example", client.getEndpoint());
        Assertions.assertEquals("PRIVATE KEY", client.getPrivatekey());
        Assertions.assertEquals("PUBLIC KEY", client.getPublickey());
    }
}
