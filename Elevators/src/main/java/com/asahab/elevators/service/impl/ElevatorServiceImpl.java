package com.asahab.elevators.service.impl;

import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.asahab.elevators.model.Elevator;
import com.asahab.elevators.model.request.ElevatorClickRequest;
import com.asahab.elevators.service.ElevatorService;

@Service
public class ElevatorServiceImpl implements ElevatorService {

	@Override
	public void goUp(ElevatorClickRequest elevatorClickRequest) {
		List<Queue<Integer>> elevators = Elevator.instance.getElevators();
		elevators
			.stream()
			.filter(elevator -> elevator.size() - 1 == elevatorClickRequest.getCurrentFloor())
			.filter(elevator -> elevator.peek() > elevatorClickRequest.getNextFloor())
			.map(elevator -> elevator.add(elevatorClickRequest.getNextFloor()))
			.forEach(System.out::println);
	}

	@Override
	public void goDown(ElevatorClickRequest elevatorClickRequest) {
		List<Queue<Integer>> elevators = Elevator.instance.getElevators();
		elevators
			.stream()
			.filter(elevator -> elevator.size() - 1 == elevatorClickRequest.getCurrentFloor())
			.filter(elevator -> elevator.peek() < elevatorClickRequest.getNextFloor())
			.map(elevator -> elevator.add(elevatorClickRequest.getNextFloor()))
			.forEach(System.out::println);
		}

	@Override
	public Elevator initElevators(int numOfElevators) {
		return new Elevator(numOfElevators);
	}
}