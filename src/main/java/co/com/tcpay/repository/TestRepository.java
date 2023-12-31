package co.com.tcpay.repository;

import java.util.List;

import co.com.tcpay.dto.TestDto;
import co.com.tcpay.model.Test;

public interface TestRepository {

	// JDBC Repository
	// a repository to interact with Tests from the database.

	List<TestDto> findAll(); // <Test>

	int save(Test book);

}
