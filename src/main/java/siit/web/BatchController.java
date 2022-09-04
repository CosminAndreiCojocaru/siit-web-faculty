package siit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import siit.model.Student;
import siit.service.BatchService;
import siit.service.StudentService;

@Controller
@RequestMapping("")
@RestController
public class BatchController {

    @Autowired
    private StudentService customerService;

    @Autowired
    private BatchService batchService;

    @RequestMapping(method = RequestMethod.GET, path = "/students/{studentId}/batches")
    public ModelAndView renderBatchPage(@PathVariable Integer studentId){
        ModelAndView mav = new ModelAndView("student-batch");
        Student dbCustomer = customerService.getBy(studentId);
        mav.addObject("student", dbCustomer);
        return mav;
    }
}
