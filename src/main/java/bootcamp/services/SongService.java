package bootcamp.services;

import bootcamp.api.v1.model.ArtistDTO;
import bootcamp.api.v1.model.SongDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SongService {

public List<SongDTO> getAllSongs();

SongDTO getSongByName(String name);


}
