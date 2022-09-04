package siit.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import siit.model.Teacher;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Repository
public class TeacherDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Teacher> getAllTeacher(){
        return jdbcTemplate.query("SELECT * FROM TEACHER", this::extractTeacher);
    }

    public Teacher getBy(int id){
        String sql = "SELECT * FROM TEACHER WHERE id:: int = ?";
        return jdbcTemplate.queryForObject(sql, this::extractTeacher, id);
    }

    private Teacher extractTeacher(ResultSet rs, int rowNumb) throws SQLException{
        String name = rs.getString("name");
        Date birthday = rs.getDate("birthday");
        String department = rs.getString("department");
        Date dateofojoin = rs.getDate("dateofjoin");
        int salary = rs.getInt("salary");
        String sex = rs.getString("sex");
        return new Teacher(name, birthday, department, dateofojoin, salary, sex);
    }


}
