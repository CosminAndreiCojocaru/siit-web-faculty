package siit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import siit.db.StudentDao;
import siit.model.Student;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao customerDao;
    @Autowired
    private EnrollmentService enrollmentService;
    @Autowired
    private BatchService batchService;
    @Autowired
    private StudentGradePointService studentGradePointService;

    public void update(Student customer) {
//        phone number Validation -> phone sa contina doar cifre, un anumit numar de caractere
        customerDao.update(customer);
    }

    public List<Student> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    public Student getBy(int id) {
        Student customer = customerDao.getBy(id); // fara orders
        customer.setEnrollments(enrollmentService.getBy(id));
        customer.setBatches(batchService.getBy(id));
        customer.setStudentGradePoints(studentGradePointService.getBy(id));
        customer.setSearch(customerDao.getSearch(id));
        return customer;
    }

    public List<Student> search(int keyword){
        return customerDao.getSearch(keyword);
    }

}
