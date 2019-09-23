package uk.ac.ox.it.lti.ltidemo;

import edu.ksu.lti.launch.service.LtiLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import uk.ac.ox.it.lti.ltidemo.mvc.LtiSessionArgumentResolver;

import java.util.List;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private LtiLoginService ltiLoginService;


    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new LtiSessionArgumentResolver(ltiLoginService));
    }
}
