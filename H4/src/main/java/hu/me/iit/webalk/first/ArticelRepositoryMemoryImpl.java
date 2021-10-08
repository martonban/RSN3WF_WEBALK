package hu.me.iit.webalk.first;

import java.util.List;

public class ArticelRepositoryMemoryImpl implements ArticelRepository{

    private final


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


    @Override
    public List<ArticelDto> findAll() {
        return articles;
    }

    @Override
    public ArticelDto getById() {
        return null;
    }

    @Override
    public Long save(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
