package camisetastematicas.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.util.Collections;


@SpringBootApplication
public class Lanzador extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Lanzador.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8590"));
        app.run(args);
    }
}
