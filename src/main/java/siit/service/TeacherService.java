package siit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import siit.db.TeacherDao;
import siit.model.Teacher;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public List<Teacher> getAllTeacher(){
        return teacherDao.getAllTeacher();
    }

    public Teacher getBy(int id){
        Teacher teacher = teacherDao.getBy(id);
        return teacher;
    }
}
