package hexaonbusinessmitrasindo.core.data;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

@Slf4j
public class Server {

    @PostConstruct
    public void start(){
        log.info("server start");
    }

    @PreDestroy
    public void stop(){
        log.info("server stop");
    }

}
