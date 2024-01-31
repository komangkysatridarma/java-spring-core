package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.configuration.BarConfiguration;
import hexaonbusinessmitrasindo.core.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {

}
