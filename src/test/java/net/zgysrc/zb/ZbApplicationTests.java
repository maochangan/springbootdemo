package net.zgysrc.zb;

import net.zgysrc.zb.util.VerificationCode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = VerificationCode.class)
public class ZbApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println(VerificationCode.getVerificationCode());
	}

}
