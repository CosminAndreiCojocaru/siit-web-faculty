package siit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import siit.model.Student;
import siit.service.StudentService;

import java.util.Collections;

@Controller
@RequestMapping(path = "/students")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView renderCustomerList() {
        ModelAndView mav = new ModelAndView("student-list");
        mav.addObject("students", studentService.getAllCustomers());
        return mav;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/{id}/edit")
    public ModelAndView performCustomerEdit(@ModelAttribute Student customer) {
        ModelAndView mav = new ModelAndView("student-enrollments");
        studentService.update(customer);
        mav.setViewName("redirect:/students");
        return mav;
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/search")
    public ModelAndView searchStudentById(@RequestParam("id") int id) {
        ModelAndView mav = new ModelAndView("student-list");
        Student student = studentService.getById(id);
        if(student != null) {
            mav.addObject("students", Collections.singletonList(student));
        }else{
            mav.addObject("errorMessage", "Student with ID " + id + " not found.");
        }
        return mav;
    }

}