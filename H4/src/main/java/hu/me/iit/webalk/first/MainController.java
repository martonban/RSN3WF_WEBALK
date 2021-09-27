package hu.me.iit.webalk.first;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping(path="/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    ResponseDto gyoker(){
        ResponseDto rd= new ResponseDto();
        rd.setId(123);
        rd.setMessage("hello");
        return rd;
    }
}
