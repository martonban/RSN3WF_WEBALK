package hu.me.iit.webalk.first;

import java.util.List;

// CRUD (Create, Read, Update, Delete) Műveleteket kell implementálni a Repository interfacben
public interface ArticelRepository {
    List<ArticelDto> findAll();
    ArticelDto getById();
    Long save(Long id);
    void deleteById(Long id);
}
