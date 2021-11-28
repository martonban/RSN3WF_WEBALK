package hu.me.iit.webalk.gyakorlas01.Controller;


import hu.me.iit.webalk.gyakorlas01.Service.LicitService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/licit")
@ComponentScan({"hu.me.iit.webalk.gyakorlas01.Service"})
public class LicitController {

    private final LicitService licitService;

    public LicitController(LicitService licitService) {
        this.licitService = licitService;
    }

    @GetMapping("/licit/highest")
    public int getHighest() {
        return licitService.getHighest();
    }


    @GetMapping("/licit/highest/{userId}")
    public int getHighestForUser(@PathVariable("userId") int id) {
        return licitService.getHighestForUser(id);
    }

    @PostMapping
    public void saveNewLicit(@Valid @RequestBody SaveLicitDto saveLicitDto) {
        licitService.saveNewLicit(saveLicitDto.getLicit(), saveLicitDto.getUserId());
    }
}
