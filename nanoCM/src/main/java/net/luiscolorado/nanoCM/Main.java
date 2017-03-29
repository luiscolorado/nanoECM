package net.luiscolorado.nanoCM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import net.luiscolorado.nanoCM.storage.*;


@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
