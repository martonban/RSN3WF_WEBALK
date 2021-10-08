package hu.me.iit.webalk.first;


import java.util.List;

// CRUD (Create, Read, Update, Delete) Műveleteket kell implementálni a Repository interfacben

public interface ArticleRepository {
    List<ArticleDto> findAll();
    ArticleDto getById(Long id);
    Long save(ArticleDto articleDto);
    void deleteById(Long id);
}
