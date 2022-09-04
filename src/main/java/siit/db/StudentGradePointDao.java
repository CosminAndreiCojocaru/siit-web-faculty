package siit.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import siit.model.StudentGradePoint;
import siit.model.Teacher;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentGradePointDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<StudentGradePoint> getAllPoint(Integer customerId){
        String sql = "SELECT * FROM studentGRADEPOINT WHERE id:: int = ?";
        List<StudentGradePoint> point = jdbcTemplate.query(sql, this::extractPoint, customerId);
        return point;
    }

    public List<Teacher> getAllTeachers(Integer customerId){
        String sql = "select name from teacher, studentgradepoint where studentgradepoint.subject = teacher.department";
        List<Teacher> points = jdbcTemplate.query(sql, this::extractTeach, customerId);
        return points;
    }

    private Teacher extractTeach(ResultSet rs, int rowNumb) throws SQLException{
        String name = rs.getString("name");
        return new Teacher(name);
    }

    private StudentGradePoint extractPoint(ResultSet rs, int rowNumb) throws SQLException{
        int gradpointaverage = rs.getInt("gradpointaverage");
        String subject = rs.getString("subject");
        int id = rs.getInt("id");

        return new StudentGradePoint(gradpointaverage, subject, id);
    }

}
