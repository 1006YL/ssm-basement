import java.util.List;
import java.util.Map;

public interface UserDao {
    public List<User> selectUser();

    public int addUser(User user);

    public int deleterUser(int id);

    public int updateUser(User user);

    public List<User> selectmoreUser(Map<String,Object> idna);
    }