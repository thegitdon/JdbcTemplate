package co.com.tcpay.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.com.tcpay.model.Test;

@Repository
public class JdbcTutorialRepository implements TestRepository {

	/*
	 * JdbcTutorialRepository uses JdbcTemplate object for executing SQL queries or
	 * updates to interact with PostgreSQL Database.
	 */

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Test> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM TEST", BeanPropertyRowMapper.newInstance(Test.class));
		// converts a table row into a new instance of the specified mapped target class.
	}

	@Override
	public int save(Test book) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT INTO TEST(UNAME, PESO, published) VALUES(?, ?, ?)",
				new Object[] { book.getUname(), book.getWeight(), book.isPublished() });
	}

}
