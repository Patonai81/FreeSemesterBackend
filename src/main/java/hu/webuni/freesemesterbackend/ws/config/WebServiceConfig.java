package hu.webuni.freesemesterbackend.ws.config;

import hu.webuni.freesemesterbackend.ws.remote.RemainingFreeSemesterIF;
import hu.webuni.freesemesterbackend.ws.service.RemainingFreeSemesterAsyncService;
import lombok.RequiredArgsConstructor;
import org.apache.cxf.Bus;

import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
@RequiredArgsConstructor
public class WebServiceConfig {

    private final Bus bus;
    private final RemainingFreeSemesterIF remainingFreeSemester;
    private final RemainingFreeSemesterAsyncService remainingFreeSemesterAsyncService;

    @Bean
    Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus, remainingFreeSemester);
        endpoint.publish("/remaining");
        return endpoint;
    }

    @Bean
    Endpoint endpoint2(){
        EndpointImpl endpoint = new EndpointImpl(bus, remainingFreeSemesterAsyncService);
        endpoint.publish("/remainingA");
        return endpoint;
    }
}
