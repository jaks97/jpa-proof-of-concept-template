package paddle;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="reservas")
public class Reserva {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime inicio_partido;
    private LocalDateTime fin_partido;

    @ManyToOne
    private Cancha cancha;

    @ManyToOne
    private Jugador responsable;
}
