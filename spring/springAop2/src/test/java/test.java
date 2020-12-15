import com.UserImplement;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aopxml.xml");
        UserImplement userService = (UserImplement) context.getBean("userdao");
        userService.search();
    }
}

