import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConf
{
@Bean(name = "hellobean")
    public Hello printHello()
{
    Hello h = new Hello();
    h.setMessage("Hello World!!!");
    return h;
}
}
