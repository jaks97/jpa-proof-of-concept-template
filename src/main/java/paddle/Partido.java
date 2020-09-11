package paddle;

import javax.persistence.*;

@Entity
@Table(name="partidos")
public class Partido {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Cancha cancha;

    @ManyToOne
    private Color colorCancha;

    @OneToOne
    private Reserva reserva;

}
