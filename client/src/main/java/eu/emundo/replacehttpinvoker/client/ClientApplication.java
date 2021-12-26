package eu.emundo.replacehttpinvoker.client;

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
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}

@Component
class ClientApplicationRunner implements ApplicationRunner {
    private static final Logger logger = LoggerFactory.getLogger(ClientApplicationRunner.class);

    private final ModuleAQueryFacade moduleAQueryFacade;

    ClientApplicationRunner(ModuleAQueryFacade moduleAQueryFacade) {
        this.moduleAQueryFacade = moduleAQueryFacade;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("starting runner");
        List<ItemDto> allItems = moduleAQueryFacade.findAll();
        logger.info("got items {}", allItems);
    }
}
