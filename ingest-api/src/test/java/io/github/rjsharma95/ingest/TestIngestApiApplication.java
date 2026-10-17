package io.github.rjsharma95.ingest;

import org.springframework.boot.SpringApplication;

public class TestIngestApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(IngestApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
