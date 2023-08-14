package co.com.tcpay.service;

import java.util.List;

import co.com.tcpay.dto.TestDto;
import co.com.tcpay.model.Test;

public interface TestService {

	List<TestDto> findAll(); // <Test>

	int save(Test book);

}
