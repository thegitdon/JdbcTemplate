package co.com.tcpay.mapper;

import co.com.tcpay.dto.TestDto;
import co.com.tcpay.model.Test;

public class TestMapper {

	// Convert Entity into Dto
	public static TestDto mapToTestDto(Test user) {
		TestDto userDto = new TestDto(user.getId(), user.getUname(), user.getWeight(), user.isPublished());
		return userDto;
	}

	// Convert Dto into Entity
	public static Test mapToTest(TestDto userDto) {
		Test user = new Test(userDto.getId(), userDto.getUname(), userDto.getWeight(), userDto.isPublished());
		return user;
	}
}
