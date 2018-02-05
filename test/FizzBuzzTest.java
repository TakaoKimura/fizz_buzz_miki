import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {
	
	@Test
	public void 三の倍数はfizz(){
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertThat(fizzbuzz.fizzbuzz(3), is("fizz"));
	}
}

