import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String []args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConf.class);
        Hello h1 = (Hello)context.getBean("sbean");
        System.out.println(h1.getMessage());

        Hello h2 = (Hello)context.getBean("sbean");
        h2.setMessage("Hello");
        System.out.println(h2.getMessage());
        System.out.println(h1.getMessage());


    }


}
