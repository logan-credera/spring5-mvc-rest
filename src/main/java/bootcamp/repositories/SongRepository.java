package bootcamp.repositories;

import bootcamp.domain.Artist;
import bootcamp.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jt on 9/24/17.
 */
@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

    Song findByName(String name);
}

