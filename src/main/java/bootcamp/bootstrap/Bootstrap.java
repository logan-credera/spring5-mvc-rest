package bootcamp.bootstrap;

import bootcamp.domain.Artist;
import bootcamp.repositories.ArtistRepository;
import bootcamp.repositories.SongRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private ArtistRepository artistRepository;
    private SongRepository songRepository;

    public Bootstrap(ArtistRepository artistRepository, SongRepository songRepository) {
        this.artistRepository = artistRepository;
        this.songRepository = songRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Artist bono = new Artist();
        bono.setName("Bono");

        Artist lil_wayne = new Artist();
        lil_wayne.setName("Lil Wayne");

        artistRepository.save(lil_wayne);
        artistRepository.save(bono);

        System.out.println("Artist count " + artistRepository.count());
        System.out.println("Song count " + songRepository.count());
    }
}
