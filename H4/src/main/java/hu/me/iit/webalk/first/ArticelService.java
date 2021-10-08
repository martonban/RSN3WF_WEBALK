package hu.me.iit.webalk.first;

import java.util.List;

public interface ArticelService {
    List<ArticelDto> findAll();
    ArticelDto getById();
    Long save(Long id);
    void deleteById(Long id);
}
