package io.github.rjsharma95.ingest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class IngestApiApplicationTests {

	@Test
	void contextLoads() {
	}

}
