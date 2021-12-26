package eu.emundo.replacehttpinvoker.server.modulea.impl;

import eu.emundo.replacehttpinvoker.server.modulea.api.ModuleAQueryFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

@Configuration
public class ModuleAFacadeHttpInvokerConfig {

    @Bean(name = "/invoker/modulea/query")
    public HttpInvokerServiceExporter moduleAQueryFacadeExporter(
            ModuleAQueryFacade moduleAQueryFacade) {
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setService(moduleAQueryFacade);
        exporter.setServiceInterface(ModuleAQueryFacade.class);
        return exporter;
    }
}
