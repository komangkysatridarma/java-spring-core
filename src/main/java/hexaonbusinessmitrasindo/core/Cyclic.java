package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.cyclic.A;
import hexaonbusinessmitrasindo.core.cyclic.B;
import hexaonbusinessmitrasindo.core.cyclic.C;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Cyclic {

    @Bean
    public A a(B b){
        return new A(b);
    }

    @Bean
    public B b(C c){
        return new B(c);
    }

    @Bean
    public C c(A a){
        return new C(a);
    }

}
