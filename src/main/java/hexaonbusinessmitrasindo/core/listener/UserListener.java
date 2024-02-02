package hexaonbusinessmitrasindo.core.listener;

import hexaonbusinessmitrasindo.core.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event){
        log.info("Success login for user {}", event.getUser());
    }

}
