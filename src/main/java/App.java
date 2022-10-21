import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        //creating Application Context

        /////////////////////////////////////////////////////////////////
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        /////////////////////////////////////////////////////////////////

        //creating two of Helloworld and Cat objects

        /////////////////////////////////////////////////////////////////
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat wiskas = (Cat) applicationContext.getBean("cat");
        Cat kityCat = (Cat) applicationContext.getBean("cat");
        /////////////////////////////////////////////////////////////////

        //and checking in equality of them

        /////////////////////////////////////////////////////////////////
        boolean ifItEqual = bean1 == bean2;
        LOGGER.log(Level.INFO,"If the bean1 and bean2 are equal? --{0}",new Object[]{ifItEqual});
        boolean ifCatsEqual = wiskas == kityCat;
        LOGGER.log(Level.INFO,"If the wiskas and kityCat are equal? --{0}",new Object[]{ifCatsEqual});
    }
}