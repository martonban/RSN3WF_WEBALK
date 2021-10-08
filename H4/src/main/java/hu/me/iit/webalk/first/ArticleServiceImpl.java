package hu.me.iit.webalk.first;


import java.util.List;

public class ArticleServiceImpl implements ArticleService {

    private final int MAXIMUM_ARTICLE_COUNT = 10;
    private ArticleRepository articleRepository;


    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<ArticleDto> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public ArticleDto getById(Long id) {
        return articleRepository.getById(id);
    }

    @Override
    public Long save(ArticleDto articleDto){
        if(articleRepository.findAll().size() >= MAXIMUM_ARTICLE_COUNT){
            throw new TooMuchArticleException();
        }
        return articleRepository.save(articleDto);
    }

    @Override
    public void deleteById(Long id) {
        articleRepository.deleteById(id);
    }
}
