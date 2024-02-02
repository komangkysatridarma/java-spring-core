package hexaonbusinessmitrasindo.core.processor;

import hexaonbusinessmitrasindo.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix Id generator processor for bean ", beanName );
        if(bean instanceof IdAware){
            log.info("Prefix set id generator for bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("Prefix-" + idAware.getId());
        }
        return bean;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
