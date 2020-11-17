package bootcamp.mapper;

import bootcamp.api.v1.model.ArtistDTO;
import bootcamp.api.v1.model.SongDTO;
import bootcamp.domain.Artist;
import bootcamp.domain.Song;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SongMapper {

    SongMapper INSTANCE = Mappers.getMapper(SongMapper.class);

    @Mapping(source = "id", target = "id")
    SongDTO songToSongDTO(Song song);
}
