package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.factory.PaymentGetwayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        PaymentGetwayClientFactoryBean.class
})
public class FactoryConfiguration {
}
