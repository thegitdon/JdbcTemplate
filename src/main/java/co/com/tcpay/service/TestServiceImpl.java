package co.com.tcpay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.tcpay.dto.TestDto;
import co.com.tcpay.model.Test;
import co.com.tcpay.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestRepository testRepository;

	@Override
	public List<TestDto> findAll() {
		// TODO Auto-generated method stub
		return testRepository.findAll();
	}

	@Override
	public int save(Test book) {
		// TODO Auto-generated method stub
		return 0;
	}

}
