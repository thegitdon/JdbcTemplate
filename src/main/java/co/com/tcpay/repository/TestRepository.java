package co.com.tcpay.repository;

import java.util.List;

import co.com.tcpay.model.Test;

public interface TestRepository {

	// JDBC Repository
	// a repository to interact with Tests from the database.

	List<Test> findAll();

	int save(Test book);

}
