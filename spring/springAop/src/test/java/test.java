import com.UserDao;
import com.UserImplement;
import com.proxy;
import com.Interceptor;

import java.lang.reflect.Proxy;

public class test {
    public static void main(String[] arg)
    {
        UserDao user =new UserDao();
        proxy pro=new proxy();
        pro.setUser(user);
        pro.add();
        Interceptor pi=new Interceptor();
        pi.setTarget(user);
        UserImplement prx=(UserImplement) pi.getProxy();
        prx.delete();
    }
}
