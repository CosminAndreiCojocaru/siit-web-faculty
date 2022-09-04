package siit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import siit.db.StudentGradePointDao;
import siit.model.StudentGradePoint;
import siit.model.Teacher;

import java.util.List;

@Service
public class StudentGradePointService {

    @Autowired
    private StudentGradePointDao studentGradePointDao;

    public List<StudentGradePoint> getBy(Integer id){
        return studentGradePointDao.getAllPoint(id);
    }

    public List<Teacher> getall(Integer id){
        return studentGradePointDao.getAllTeachers(id);
    }
}
