package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import spittr.data.SpitterRepositoryImp;
import spittr.rmiService.SpitterService;
import spittr.rmiService.SpitterServiceImp;

@Configuration
public class RmiAndMoreCongfig {
	
	@Bean
	public RmiServiceExporter rimExport(SpitterService spitterService){
		RmiServiceExporter exporter = new RmiServiceExporter();
		exporter.setService(spitterService);
		exporter.setServiceName("spitterService");
		exporter.setServiceInterface(SpitterService.class);
		return exporter;
	}
	
	@Bean
	public SpitterService spitterService(){
		return new SpitterServiceImp();
	}
	
}
