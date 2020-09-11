package paddle;

import javax.persistence.*;

@Entity
@Table(name="paletas")
public class Paleta {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private Integer grosor;

    @ManyToOne
    private Color color;

    @ManyToOne
    private Contructor constructor;
}
