package bootcamp;

import bootcamp.api.v1.model.ArtistDTO;
import bootcamp.api.v1.model.ArtistListDTO;
import bootcamp.api.v1.model.SongDTO;
import bootcamp.api.v1.model.SongListDTO;
import bootcamp.services.SongService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/songs")
public class SongController {

    public SongController(SongService songService) {
        this.songService = songService;
    }

    private final SongService songService;

    @GetMapping("/getall")
    public ResponseEntity<SongListDTO> getAllSongs(){
       return new ResponseEntity<SongListDTO>(
        new SongListDTO(songService.getAllSongs()), HttpStatus.OK);

    }

    @GetMapping("name")
    public ResponseEntity<SongDTO> getSongByName(String name){
        return new ResponseEntity<SongDTO>(
                songService.getSongByName(name), HttpStatus.OK);

    }



}
