package baseProject;

import org.junit.Test;
import baseProject.web.controller.mainController;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by IntelliJ IDEA.
 * User: Maciej Cyrka maciej.cyrka@gmail.com
 * Date: 04.03.17
 * Time: 17:37
 */


public class mainControllerTest {

    @Test
    public void testMainPage() throws Exception {
        mainController mainController = new mainController();
        MockMvc mockMvc = standaloneSetup(mainController).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}
