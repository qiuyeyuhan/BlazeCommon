package blazeTest;

import org.junit.Before;
import org.junit.Test;

import com.bsb.consume.finance.blaze.invoke.BlazeCommInvoke;

public class BlazeTest {
	@Before
	public void init(){
		
	}
	@Test
	public void test() throws Exception{
		String sourceCode = "";
		String blazeBom = "";
		BlazeCommInvoke blazeInvoke = new BlazeCommInvoke();
		blazeInvoke.invoke(sourceCode, blazeBom);
	}
}
