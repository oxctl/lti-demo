package uk.ac.ox.it.lti.ltidemo;

import edu.ksu.lti.launch.oauth.LtiPrincipal;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * You can't use an ArgumentResolver for the custom LtiPrincipal.
 */
@ControllerAdvice
public class SecurityControllerAdvice {

    @ModelAttribute
    public LtiPrincipal customPrincipal(Authentication a) {
        return (LtiPrincipal)(a == null ? null : a.getPrincipal());
    }
}
