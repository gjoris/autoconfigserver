package autoconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AutoconfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoconfigserverApplication.class, args);
    }
}
