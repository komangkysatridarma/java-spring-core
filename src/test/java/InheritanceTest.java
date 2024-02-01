import hexaonbusinessmitrasindo.core.InheritanceConfiguration;
import hexaonbusinessmitrasindo.core.service.MerchantService;
import hexaonbusinessmitrasindo.core.service.MerchantServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testInherinatce(){
        MerchantServiceImpl merchantService = context.getBean(MerchantServiceImpl.class);
        MerchantService merchantService1 = context.getBean(MerchantService.class);

        Assertions.assertEquals(merchantService1, merchantService);
    }
}
