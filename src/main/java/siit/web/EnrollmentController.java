package siit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import siit.model.Student;
import siit.service.StudentService;
import siit.service.EnrollmentService;

@Controller
@RequestMapping("")
@RestController
public class EnrollmentController {

    @Autowired
    private StudentService customerService;

    @Autowired
    private EnrollmentService enrollmentService;

    @RequestMapping(method = RequestMethod.GET, path = "/students/{studentId}/enrollments")
    public ModelAndView renderEnrollmentPage(@PathVariable Integer studentId) {
        ModelAndView mav = new ModelAndView("student-enrollments");
        Student dbCustomer = customerService.getBy(studentId);
        mav.addObject("student", dbCustomer);
        return mav;
    }
}
