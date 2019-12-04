package uk.ac.ox.it.lti.ltidemo;

import edu.ksu.lti.launch.oauth.LtiPrincipal;
import edu.ksu.lti.launch.service.SimpleLtiLoginService;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class FixedLtiLoginService extends SimpleLtiLoginService {

    public String getInitialView(LtiPrincipal principal) {
            HttpServletRequest request =
                    ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes())
                            .getRequest();
            return request.getContextPath() + "/";
        }
}
