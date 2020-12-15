import com.mapper.UserMapper;
import com.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
        SqlSessionTemplate sqlSession = (SqlSessionTemplate) context.getBean("sqlSession");
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        List<User> user = mapper.selectUser();
        System.out.println(user);
    }
}
