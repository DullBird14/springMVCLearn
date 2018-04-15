package spittr.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class DBConfig {
	@Bean
	public DataSource dataSource(){
//		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//		driverManagerDataSource.setDriverClassName("oracle.jdbc.OracleDriver");
//		driverManagerDataSource.setUrl("jdbc:oracle:thin:@192.168.3.253:1521:orcl");
//		driverManagerDataSource.setUsername("accept");
//		driverManagerDataSource.setPassword("123456");
//		return driverManagerDataSource;
		return new EmbeddedDatabaseBuilder()
			.setType(EmbeddedDatabaseType.H2)
			.addScript("classpath:scherma.sql")
			.addScript("classpath:test-data.sql")
			.build();
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	
	
}
