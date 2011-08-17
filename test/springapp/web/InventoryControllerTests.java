package springapp.web;

import java.util.*;

import junit.framework.*;

import org.springframework.web.servlet.*;

import springapp.service.*;

public class InventoryControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception {
        InventoryController controller = new InventoryController();
        controller.setProductManager(new SimpleProductManager());
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map modelMap = (Map) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }
}
