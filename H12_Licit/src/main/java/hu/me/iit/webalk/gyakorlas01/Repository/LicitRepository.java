package hu.me.iit.webalk.gyakorlas01.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

public interface LicitRepository extends PagingAndSortingRepository<Licit, Long> {

    Optional<Licit> findTopByOrderByLicitDesc();

    Optional<Licit> findTopByUseridAndOrderByLicitDesc(Integer userid);

}