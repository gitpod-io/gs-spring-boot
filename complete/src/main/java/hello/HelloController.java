package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    public static final String RESULT = "gitpod DEMO for QARIK!";
    
    @RequestMapping("/")
    public String index() {
        return RESULT;
    }
    
}
