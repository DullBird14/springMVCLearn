package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spittr.data.SpitterRepository;
import spittr.data.SpitterRepositoryImp;
import spittr.data.SpittleRepository;
import spittr.data.SpittleRepositoryImp;

@Configuration
public class TestConfig {
	@Bean
	public SpittleRepository spittleRepository(){
		return new SpittleRepositoryImp();
	}
	
	@Bean
	public SpitterRepository spitterRepository(){
		return new SpitterRepositoryImp();
	}
}
