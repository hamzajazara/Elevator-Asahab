package com.asahab.elevators;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.asahab.elevators.model.Elevator;
import com.asahab.elevators.model.request.ElevatorClickRequest;
import com.asahab.elevators.service.ElevatorService;
import com.asahab.elevators.service.impl.ElevatorServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElevatorsApplicationTests {

	@Autowired
	private ElevatorService elevatorService;

	@Test
	public void elevator_goUp() {
		// Arrange
		ElevatorClickRequest clickRequest = ElevatorClickRequest.builder().currentFloor(0).nextFloor(2).build();
		elevatorService.initElevators(4);

		// Act
		elevatorService.goUp(clickRequest);

		// Assert
		assertEquals(Elevator.instance.getElevators().get(0).size(), 1);
	}

	@Test
	public void elevator_goDown() {
		// Arrange
		ElevatorClickRequest clickRequest = ElevatorClickRequest.builder().currentFloor(0).nextFloor(2).build();
		elevatorService.initElevators(4);

		// Act
		elevatorService.goDown(clickRequest);

		// Assert
		assertEquals(Elevator.instance.getElevators().get(0).size(), 1);
	}
}
