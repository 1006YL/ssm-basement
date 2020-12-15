import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class selectTest {
    @Test
    public void selectUser() throws IOException {

        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        List<User> userList = mapper.selectUser();
        for (User user : userList) {
            System.out.println(user.toString());
        }

        sqlSession.close();
    }
    @Test
    public void TestaddUser() throws IOException{
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        User user1=new User(5,"王五","zxcvbn");

        mapper.addUser(user1);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void TestdeleteUser() throws IOException{
        String resource="mybatis.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        UserDao mapper=sqlSession.getMapper(UserDao.class);

        mapper.deleterUser(5);

        sqlSession.commit();

        sqlSession.close();

    }

    @Test
    public void TestupdateUser() throws IOException{
        String resource="mybatis.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        UserDao mapper=sqlSession.getMapper(UserDao.class);

        User user4=new User(6,"王五","hjhjhj");

        mapper.updateUser(user4);

        sqlSession.commit();

        sqlSession.close();

    }
    @Test
    public void TestselectmoreUser() throws IOException
    {
        String resource="mybatis.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        UserDao mapper=sqlSession.getMapper(UserDao.class);

        Map<String,Object> idna=new HashMap<String,Object>();

        idna.put("id",1);
        idna.put("name","idea");

        mapper.selectmoreUser(idna);


        sqlSession.close();

    }}
