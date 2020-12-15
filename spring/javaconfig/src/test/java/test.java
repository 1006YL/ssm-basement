import com.User;
import com.javacon;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] arg) {
        ApplicationContext context=new AnnotationConfigApplicationContext("javacon.class");
        User user=context.getBean("user",User.class);
        System.out.println(user.toString());

    }
    }
