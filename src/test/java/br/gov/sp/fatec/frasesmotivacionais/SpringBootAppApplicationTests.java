package br.gov.sp.fatec.frasesmotivacionais;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback
class SpringBootAppApplicationTests {

	@Test
	void contextLoads() {
	}

}
