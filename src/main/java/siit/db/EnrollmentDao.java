package siit.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import siit.model.Enrollment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Repository
public class EnrollmentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Enrollment> getAllEnrollments(Integer customerId) {
        String sql = "SELECT * FROM ENROLLMENT WHERE id:: int = ?";
        List<Enrollment> enrollment = jdbcTemplate.query(sql, this::extractEnrollment, customerId);
        return enrollment;
    }

    public Enrollment getBy(int id) {
        String sql = "SELECT * FROM ENROLLMENT WHERE id:: int = ?";
        return jdbcTemplate.queryForObject(sql, this::extractEnrollment, id);
    }

    private Enrollment extractEnrollment(ResultSet rs, int rowNumb) throws SQLException {
        int batchid = rs.getInt("batchid");
        int id = rs.getInt("id");
        Date edate = rs.getDate("edate");
        return new Enrollment(batchid, id, edate);
    }

}