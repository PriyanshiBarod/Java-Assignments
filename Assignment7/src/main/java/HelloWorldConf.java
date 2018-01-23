import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloWorldConf
{
@Bean(name = "sbean")
@Scope("singleton")
public Hello printHello()
        {
        Hello h = new Hello("Contents of Hello's Singleton bean");
        return h;

        }
        }
