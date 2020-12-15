import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public void selectUserByLimit() throws IOException {

        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Map<String,Integer> map=new HashMap<>();
        map.put("startindex",0);
        map.put("long",1);
        List<User> userList = mapper.selectUserByLimit(map);
        for (User user : userList) {
            System.out.println(user.toString());
        }

        sqlSession.close();
    }
    @Test
    public void queryBlogIf() throws IOException {

        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Map<String,Object> map=new HashMap<>();
        map.put("name","王五");

        List<User> userList = mapper.queryBlogIf(map);
        for (User user : userList) {
            System.out.println(user.toString());
        }

        sqlSession.close();
    }
    @Test
    public void queryBlogChoose() throws IOException {

        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Map<String,Object> map=new HashMap<>();
        map.put("name","王五");

        List<User> userList = mapper.queryBlogChoose(map);
        for (User user : userList) {
            System.out.println(user.toString());
        }

        sqlSession.close();
    }
    @Test
    public void updateBlog() throws IOException {

        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Map<String,Object> map=new HashMap<>();
        map.put("password","niubila");
        map.put("id","1");
        mapper.updateBlog(map);

        sqlSession.commit();
        sqlSession.close();
    }
    //注意大小写
    @Test
    public void queryBlogTrim() throws IOException {

        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Map<String,Object> map=new HashMap<>();
        map.put("id",1);
        List<User> userList = mapper.queryBlogChoose(map);
        for (User user : userList) {
            System.out.println(user.toString());
        }
        sqlSession.close();
    }
    @Test
    public void queryBlogForch() throws IOException {

        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<Integer> ids=new ArrayList<Integer>();
        ids.add(2);
        ids.add(3);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("ids",ids);
        List<User> userList = mapper.queryBlogForch(map);
        for (User user : userList) {
            System.out.println(user.toString());
        }
        sqlSession.close();
    }
}
