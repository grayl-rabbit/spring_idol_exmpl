import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Performer;

public class AppContext {
    public static void main(String[] args) {
        ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Performer performer =(Performer) applicationContext.getBean("duke");
        performer.perform();
    }
}
