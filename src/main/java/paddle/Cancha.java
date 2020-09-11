package paddle;

import javax.persistence.*;

@Entity
@Table(name="canchas")
public class Cancha {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private Boolean estaIluminada;

    @ManyToOne
    private Color color;
}