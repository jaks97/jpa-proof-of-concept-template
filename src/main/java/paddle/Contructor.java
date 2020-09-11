package paddle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="constructores")
public class Contructor {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String domicilio;

}
