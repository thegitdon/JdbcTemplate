package co.com.tcpay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.tcpay.dto.TestDto;
import co.com.tcpay.service.TestService;

@CrossOrigin(origins = "*")
@RestController // used to define a controller and to indicate that the return
				// value of the methods should be be bound to the web response body.
@RequestMapping("/api") // declares that all Apis’ url in the controller will start with /api.
public class TestController {

	// controller that provides APIs for creating, retrieving,
	// updating, deleting and finding.

	@Autowired // to inject TestRepository bean to local variable.
	// TestRepository testRepository;
	TestService testService;

	/*
	 * @GetMapping("/tests") public ResponseEntity<List<TestDto>> getAllTutorials()
	 * { List<TestDto> users = testRepository.findAll();
	 * 
	 * if (users.isEmpty()) { return new ResponseEntity<>(HttpStatus.NO_CONTENT); }
	 * return new ResponseEntity<>(users, HttpStatus.OK); //
	 * testRepository.findAll() }
	 */
	@GetMapping("/tests")
	public ResponseEntity<List<TestDto>> getAll() {
		List<TestDto> users = testService.findAll();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

}
