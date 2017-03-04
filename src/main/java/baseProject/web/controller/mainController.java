package baseProject.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: Maciej Cyrka maciej.cyrka@gmail.com
 * Date: 04.03.17
 * Time: 17:00
 */

@Controller
public class mainController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
