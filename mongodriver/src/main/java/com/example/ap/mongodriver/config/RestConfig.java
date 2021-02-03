package com.example.ap.mongodriver.config;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.provider.JAXBElementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.ap.mongodriver.api.interfaces.TodoInterface;
import com.example.ap.mongodriver.commons.exception.StandardExceptionMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Configuration
@ComponentScan({ "com.example.ap.mongodriver.api" })
public class RestConfig {
    @Autowired
    private TodoInterface todoInterface;

    @Autowired
    private Bus bus;

    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    public Server server() {
        List<Object> services = new LinkedList<>();
        services.add(todoInterface);

        JAXRSServerFactoryBean jaxrsServerFactoryBean= new JAXRSServerFactoryBean();
        jaxrsServerFactoryBean.setBus(bus);
        jaxrsServerFactoryBean.setServiceBeans(services);
        jaxrsServerFactoryBean.setAddress("/");

        List<Object> providers = new LinkedList<>();
        providers.add(new JacksonJsonProvider(objectMapper));
        // exception mapper
        providers.add(new StandardExceptionMapper());
        //providers.add(getJAXBElementProvider());
        jaxrsServerFactoryBean.getProviders().clear();
        jaxrsServerFactoryBean.getProviders().addAll((Collection) providers);
        return jaxrsServerFactoryBean.create();
    }

    private static JAXBElementProvider<Object> getJAXBElementProvider() {
        JAXBElementProvider<Object> jaxbElementProvider = new JAXBElementProvider<>();
        List<String> mediaTypes = Arrays.asList(MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON);
        jaxbElementProvider.setConsumeMediaTypes(mediaTypes);

        return jaxbElementProvider;
    }
}
