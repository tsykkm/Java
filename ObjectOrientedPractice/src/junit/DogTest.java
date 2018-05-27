package junit;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Before;
import org.junit.Test;

public class DogTest {
	Dog dg;
	@Before
	public void init() {
		dg = new Dog("ポチ", 3);
	}

	@Test
	public void testRun() {
		assertThat(dg.run(), is("ポチ is running"));
	}
}
