package co.com.tcpay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.tcpay.model.Test;
import co.com.tcpay.repository.TestRepository;

@CrossOrigin(origins = "*")
@RestController // used to define a controller and to indicate that the return
				// value of the methods should be be bound to the web response body.
@RequestMapping("/api") // declares that all Apis’ url in the controller will start with /api.
public class TestController {

	// controller that provides APIs for creating, retrieving,
	// updating, deleting and finding.

	@Autowired // to inject TestRepository bean to local variable.
	TestRepository testRepository;

	@GetMapping("/tests")
	public ResponseEntity<List<Test>> getAllTutorials() {
		if (testRepository.findAll().isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(testRepository.findAll(), HttpStatus.OK);
	}

}
