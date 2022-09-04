package siit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import siit.service.TeacherService;

@Controller
@RequestMapping(path = "/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView renderTeacherList(){
        ModelAndView mav = new ModelAndView("teacher-list");
        mav.addObject("teachers", teacherService.getAllTeacher());
        return mav;
    }



}
