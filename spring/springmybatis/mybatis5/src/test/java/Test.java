import com.dao.UserDao;
import com.user.User;
import com.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class Test {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtil.getSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> users = mapper.selectUser();
//        List<User> users= mapper.selectUserById(1);
       User user1= new User(50,"liuliu","123");
        mapper.addUser(user1);
        for (User user : users) {
            System.out.println(user.toString());
        }
        sqlSession.close();
    }


}
