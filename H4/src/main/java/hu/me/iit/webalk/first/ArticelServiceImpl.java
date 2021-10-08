package hu.me.iit.webalk.first;

import java.util.List;

public class ArticelServiceImpl implements ArticelService {

    private ArticelRepository articelRepository;
    private final int MAXIMUM_ARTICLE_COUNT = 10;
    @Override
    public List<ArticelDto> findAll() {
        return articelRepository;
    }

    @Override
    public ArticelDto getById() {
        return articelRepository.getById(id);
    }

    @Override
    public Long save(Long id) {
        if(articelRepository.findAll().size() >= MAXIMUM_ARTICLE_COUNT){
            throw new TooMuchAricelExeption();
        }
        return articelRepository.save(id);
    }

    @Override
    public void deleteById(Long id) {

    }
}
