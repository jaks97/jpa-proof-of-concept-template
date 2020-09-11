package paddle;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="jugadores")
public class Jugador {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String apellido;
    private String domicilio;
    private LocalDateTime nacimiento;

    @OneToOne
    private Paleta paleta;
}
