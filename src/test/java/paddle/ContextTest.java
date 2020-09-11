package paddle;

import org.junit.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import static org.junit.Assert.assertNotNull;

public class ContextTest extends AbstractPersistenceTest implements WithGlobalEntityManager {


	@Test
	public void test() {
		Cancha cancha = new Cancha();
		entityManager().persist(cancha);
		Partido partido = new Partido();
		entityManager().persist(partido);
		Reserva reserva = new Reserva();
		entityManager().persist(reserva);

	}
}
