package uk.ac.ox.it.lti.ltidemo.mvc;

import edu.ksu.lti.launch.exception.NoLtiSessionException;
import edu.ksu.lti.launch.model.LtiSession;
import edu.ksu.lti.launch.service.LtiLoginService;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 *  This allows the LTI Session to be easily injected into a method.
 */
public class LtiSessionArgumentResolver implements HandlerMethodArgumentResolver {

  private LtiLoginService ltiLoginService;

  public LtiSessionArgumentResolver(LtiLoginService ltiLoginService) {
    this.ltiLoginService = ltiLoginService;
  }

  @Override
  public boolean supportsParameter(MethodParameter parameter) {
    return (parameter.getParameterType().isAssignableFrom(LtiSession.class));
  }

  @Override
  public Object resolveArgument(
      MethodParameter parameter,
      ModelAndViewContainer mavContainer,
      NativeWebRequest webRequest,
      WebDataBinderFactory binderFactory)
      throws Exception {
    try {
      return ltiLoginService.getLtiSession();
    } catch (NoLtiSessionException e) {
      return null;
    }
  }
}
