package eu.emundo.replacehttpinvoker.client;

import eu.emundo.replacehttpinvoker.server.modulea.api.ModuleAQueryFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
public class ClientHttpInvokerConfig {

    @Bean
    public HttpInvokerProxyFactoryBean moduleAQueryFacade() {
        final HttpInvokerProxyFactoryBean proxyBean = new HttpInvokerProxyFactoryBean();
        proxyBean.setServiceUrl("http://localhost:8080/invoker/modulea/query");
        proxyBean.setServiceInterface(ModuleAQueryFacade.class);
        return proxyBean;
    }

}
