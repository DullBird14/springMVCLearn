package spittr.dataBase;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcSpitterRepository {
	private JdbcOperations jdbcOperations;
	
	@Inject
	public JdbcSpitterRepository(JdbcOperations jdbcOperations){
		this.jdbcOperations = jdbcOperations; 
	}
	
	public void findOne(String id){
		System.out.println(jdbcOperations.queryForList("select * from spitter"));
	}
}
