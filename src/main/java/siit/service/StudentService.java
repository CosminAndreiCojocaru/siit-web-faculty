package siit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import siit.db.StudentRepository;
import siit.model.Student;

import java.util.List;

@Service
public class StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private EnrollmentService enrollmentService;
    @Autowired
    private BatchService batchService;
    @Autowired
    private StudentGradePointService studentGradePointService;


    public void update(Student customer) {
        studentRepository.update(customer);
    }

    public List<Student> getAllCustomers() {
        return studentRepository.getAllCustomers();
    }

    public Student getBy(int id) {
        Student customer = studentRepository.getBy(id); // fara orders
        customer.setEnrollments(enrollmentService.getBy(id));
        customer.setBatches(batchService.getBy(id));
        customer.setStudentGradePoints(studentGradePointService.getBy(id));
        return customer;
    }

    public Student getById(int id) {
        Student student = studentRepository.getBy(id);
        if (student != null) {
            student.setEnrollments(enrollmentService.getBy(id));
            student.setBatches(batchService.getBy(id));
            student.setStudentGradePoints(studentGradePointService.getBy(id));
        }
        return student;
    }
    }


