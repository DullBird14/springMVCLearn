package spittr.dataBase.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

import spittr.Spittle;
import spittr.dataBase.SpittleRepository;



@Component
public class JdbcSpittleRepository implements SpittleRepository {

	@Override
	public Spittle findOne(long id) {
		System.out.println("create" + id);
		return  new Spittle("only ONE", new Date());
	}


}
