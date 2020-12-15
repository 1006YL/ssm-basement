import com.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] arg)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student student=(Student) context.getBean("student");
        System.out.println(student.toString());
    }
}
