package bootcamp.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by jt on 9/24/17.
 */
@Data
@Entity
@Table(name = "artists")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
