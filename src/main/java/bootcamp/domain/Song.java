package bootcamp.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by jt on 9/24/17.
 */
@Data
@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
