import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String []args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello h1 =(Hello)context.getBean("h");
        System.out.println(h1.getMessage());

        Hello h2 = (Hello)context.getBean("h");
        h2.setMessage("Hello");
        System.out.println(h2.getMessage());
        System.out.println(h1.getMessage());
    }

}
