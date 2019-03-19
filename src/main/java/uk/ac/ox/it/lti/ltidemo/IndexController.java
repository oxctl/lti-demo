package uk.ac.ox.it.lti.ltidemo;

import edu.ksu.lti.launch.model.LtiSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView index(LtiSession ltiSession) {
        return new ModelAndView("index");
    }
}
