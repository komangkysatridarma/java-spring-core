package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.service.MerchantServiceImpl;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {
}
