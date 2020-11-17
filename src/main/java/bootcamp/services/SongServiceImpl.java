package bootcamp.services;

import bootcamp.api.v1.model.ArtistDTO;
import bootcamp.api.v1.model.SongDTO;
import bootcamp.mapper.SongMapper;
import bootcamp.repositories.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SongServiceImpl implements SongService {
    public SongServiceImpl(SongMapper songMapper, SongRepository songRepository) {
        this.songMapper = songMapper;
        this.songRepository = songRepository;
    }

    private final SongMapper songMapper;
    private final SongRepository songRepository;

    @Override
    public List<SongDTO> getAllSongs() {
       return songRepository.findAll().stream().map(songMapper::songToSongDTO).collect(Collectors.toList());

    }

    @Override
    public SongDTO getSongByName(String name) {
        return null;
    }
}
