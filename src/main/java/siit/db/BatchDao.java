package siit.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import siit.model.Batch;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BatchDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Batch> getAllBatch(Integer customerId){
        String sql = "SELECT * FROM BATCH WHERE batchid:: int = ?";
        List<Batch> batch = jdbcTemplate.query(sql, this::extractBatch, customerId);
        return batch;
    }


    private Batch extractBatch(ResultSet rs, int rowNumb) throws SQLException{
        int batchid = rs.getInt("batchid");
        int bstrength = rs.getInt("bstrength");
        return new Batch(batchid, bstrength);
    }
}
