package paddle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="participaciones")
public class Participacion implements Serializable {
    @Id
    @ManyToOne
    private Partido partido;

    @Id
    @ManyToOne
    private Jugador jugador;

    @ManyToOne
    private Paleta paleta;
}
