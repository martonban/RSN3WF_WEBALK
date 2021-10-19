package hu.me.iit.webalk.Third;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MainController {
    @ResponseBody
    @GetMapping("/a")
    public int getRoot(){
        return service.getValue();
    }
}
