package siit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import siit.service.StudentService;

@Controller
@RequestMapping(path = "/students/search")
public class SearchController{

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView renderCustomerList() {
        ModelAndView mav = new ModelAndView("student-list");
        mav.addObject("students", studentService.getAllCustomers());
        return mav;
    }
}
