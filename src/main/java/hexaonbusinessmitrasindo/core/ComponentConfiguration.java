package hexaonbusinessmitrasindo.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "hexaonbusinessmitrasindo.core.service",
        "hexaonbusinessmitrasindo.core.repository",
        "hexaonbusinessmitrasindo.core.configuration",

})
public class ComponentConfiguration {
}
