package siit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import siit.db.EnrollmentDao;
import siit.model.Enrollment;
import java.util.List;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentDao enrollmentDao;


    public List<Enrollment> getBy(Integer id) {
        return enrollmentDao.getAllEnrollments(id);
    }
}
