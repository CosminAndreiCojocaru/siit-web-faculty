package siit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import siit.model.Student;
import siit.service.StudentService;

@Controller
@RequestMapping(path = "/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView renderCustomerList() {
        ModelAndView mav = new ModelAndView("student-list");
        mav.addObject("students", studentService.getAllCustomers());
        return mav;
    }

    //    /customers/variabila/edit GET
    @RequestMapping(method = RequestMethod.GET, path = "/{id}/edit")
    public ModelAndView renderCustomerEdit(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView("student-enrollments");
        mav.addObject("student", studentService.getBy(id));
        return mav;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/{id}/edit")
    public ModelAndView performCustomerEdit(@ModelAttribute Student customer) {
        ModelAndView mav = new ModelAndView("student-enrollments");
        studentService.update(customer);
        mav.setViewName("redirect:/students");
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{studentId}/search")
    public ModelAndView renderSearch(@PathVariable("studentId") int id){
        ModelAndView mav = new ModelAndView("search-result");
        mav.addObject("student", studentService.getBy(id));
        return mav;
    }
}
