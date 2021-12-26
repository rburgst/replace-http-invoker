package eu.emundo.replacehttpinvoker.server;

import eu.emundo.replacehttpinvoker.server.modulea.api.ItemDto;
import eu.emundo.replacehttpinvoker.server.modulea.api.ModuleAQueryFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;

@SpringBootApplication
public class ServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
