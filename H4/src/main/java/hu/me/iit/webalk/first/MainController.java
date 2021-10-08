package hu.me.iit.webalk.first;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="article")
public class MainController  {
    //Cikkeket akarunk kezelni. Kell egy metódus amire tudunk hivatkozni
    @GetMapping(path="/", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ArticelDto> allArticels(){
        return articels;
    }

    @PostMapping(path="/")
    public void newArticle(@RequestBody @Valid ArticelDto articelDto){
        articels.add(articelDto);
    }

    private int findArticelByID(String id){
        int found = -1;
        for (int i=0; i<articels.size(); i++){
            if (articels.get(i).getTitle().equals(id)){
                found = i;
                break;
            }
        }
        return found;
    }


    @PutMapping(path="/{id}")
    public void replaceArticle(@PathVariable("id") String id, @RequestBody @Valid ArticelDto articelDto){

        int found = findArticelByID(id);

        if(found != -1){
            ArticelDto foundArticle = articels.get(found);
            foundArticle.setAuthor(articelDto.getAuthor());
            foundArticle.setPages(articelDto.getPages());
        }

    }

    @DeleteMapping(path="/{id}")
    public void deleteArticle(@PathVariable ("id") String id){
        int found = -1;
        for (int i=0; i<articels.size(); i++){
            if (articels.get(i).getTitle().equals(id)){
                found = i;
                break;
            }
        }

        if(found != -1){
            articels.remove(found);
        }
    }






}
