package deringo.business.person.boundary;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPersonManager {
	private PersonManager manager;

	@BeforeEach
	private void init() {
		manager = PersonManager.get();
	}

	@Test
	public void testPersonManagerInit() {
		assertNotNull(manager.getPersons());
		assertThat(manager.getPersons().size(), is(1000));
	}
	
	@Test
	public void testValuesStayTheSame() {
		assertEquals(manager.getPersons().get(0).getFirstName(), manager.getPersons().get(0).getFirstName());
		assertEquals(manager.getPersons().get(0), manager.getPersons().get(0));
	}
}
