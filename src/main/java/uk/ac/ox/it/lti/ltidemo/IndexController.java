package uk.ac.ox.it.lti.ltidemo;

import edu.ksu.lti.launch.model.LtiSession;
import edu.ksu.lti.launch.oauth.LtiPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView index(@ModelAttribute LtiPrincipal ltiPrincipal, LtiSession ltiSession) {
        Map<String, Object> model = new HashMap<>();
        model.put("principal", ltiPrincipal.getName());
        model.put("contextTitle", ltiSession.getLtiLaunchData().getContextTitle());
        return new ModelAndView("index", model);
    }
}
