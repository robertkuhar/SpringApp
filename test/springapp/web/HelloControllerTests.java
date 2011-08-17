package springapp.web;

import junit.framework.*;

import org.springframework.web.servlet.*;

public class HelloControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception {
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);

        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
    }
}
