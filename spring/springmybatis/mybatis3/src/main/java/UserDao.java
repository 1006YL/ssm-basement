import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface UserDao {
    public List<User> selectUser();

    public List<User> selectUserByLimit(Map<String,Integer> map);

    public List<User> queryBlogIf(Map<String,Object> map);

    public List<User> queryBlogChoose(Map<String,Object> map);

    public void updateBlog(Map<String,Object> map);

    public List<User> queryBlogTrim(Map<String,Object> map);

    public List<User> queryBlogForch(Map<String,Object> map);

    }