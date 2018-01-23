import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

    @Configuration
    public class HelloWorldConf
    {
        @Bean(name = "pbean")
        @Scope("prototype")
        public Hello printHello()
        {
            Hello h = new Hello("Contents of Hello's Prototype bean");
            return h;

        }
    }

