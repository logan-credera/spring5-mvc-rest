package bootcamp.repositories;

import bootcamp.domain.Artist;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class ArtistRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private ArtistRepository artistRepository;

    @Test
    public void testSaveProduct() {
        Artist bono = new Artist();
        bono.setName("Bono");
        testEntityManager.persist(bono);
        testEntityManager.flush();

        Artist found = artistRepository.findByName(bono.getName());

        assertEquals(found.getName(), bono.getName());

    }
}