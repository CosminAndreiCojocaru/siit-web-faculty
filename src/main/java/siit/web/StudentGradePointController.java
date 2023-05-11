package siit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import siit.model.Student;
import siit.model.Teacher;
import siit.service.StudentService;
import siit.service.StudentGradePointService;

@Controller
@RequestMapping("")
@RestController
public class StudentGradePointController {

    @Autowired
    StudentService customerService;

    @Autowired
    StudentGradePointService studentGradePointService;


    @RequestMapping(method = RequestMethod.GET, path = "/students/{studentId}/studentgradepoints")
    public ModelAndView renderPointPage(@PathVariable Integer studentId){
        ModelAndView mav = new ModelAndView("student-grade");
        Student dbCustomer = customerService.getBy(studentId);
        mav.addObject("student", dbCustomer);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/students/{studentId}/studentgradepoints/teacher")
    public ModelAndView renderPointPage1(@PathVariable String studentId){
        ModelAndView mav = new ModelAndView("teacher");
        Teacher dbteacer = (Teacher) studentGradePointService.getall(studentId);
        mav.addObject("teachers", dbteacer);
        return mav;
    }

}
