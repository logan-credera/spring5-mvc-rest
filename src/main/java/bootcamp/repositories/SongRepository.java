package bootcamp.repositories;

import bootcamp.domain.Artist;
import bootcamp.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

    Song findByName(String name);
}

