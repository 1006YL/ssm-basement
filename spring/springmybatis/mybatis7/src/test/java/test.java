import com.dao.StudentMapper;
import com.user.Student;
import com.user.Teacher;
import com.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class test {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();
        for (Student student : students) {
            System.out.println(student.getName());
            System.out.println(student.getTeacher().getName());
        }

        sqlSession.close();
        Teacher te=new Teacher();
        System.out.println("ok");
    }
}
