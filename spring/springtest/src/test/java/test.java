import com.Hello;
import com.HelloT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test{
    
    public static void main(String[] arg){
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //getBean : 参数即为spring配置文件中bean的id .
        Hello hello=(Hello)context.getBean("hello");
        HelloT helloT=(HelloT)context.getBean("helloT");
        hello.show();
        helloT.show();
        }
}
