package siit.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import siit.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Repository
public class StudentRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Student> getAllCustomers() {
        return jdbcTemplate.query("SELECT * FROM STUDENT", this::extractCustomer);

    }

    public Student getBy(int id) {
        String sql = "SELECT * FROM STUDENT WHERE id:: int = ?";

        List<Student> students = jdbcTemplate.query(sql, this::extractCustomer, id);
        if (students.isEmpty()) {
            return null; // Return null if student with given ID doesn't exist
        }
        return students.get(0);
    }

    private Student extractCustomer(ResultSet rs, int rowNumb) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String phone = rs.getString("phone");
        String email = rs.getString("email");
        Date date = rs.getDate("birthday");
        String city = rs.getString("city");
        String qualification = rs.getString("qualification");
        return new Student(id, name, phone, email, date, city, qualification);
    }

    public void update(Student customer) {
        String sql = "UPDATE STUDENT SET name=?, phone=?, email=?, birthday=?, city=?, qualification=?  WHERE id =?";
        jdbcTemplate.update(sql, customer.getName(), customer.getPhone(), customer.getEmail(), customer.getDate(), customer.getCity(), customer.getQualification(), customer.getId());
    }



}
