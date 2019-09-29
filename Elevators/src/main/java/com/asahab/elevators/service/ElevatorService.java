package com.asahab.elevators.service;

import com.asahab.elevators.model.Elevator;
import com.asahab.elevators.model.request.ElevatorClickRequest;

public interface ElevatorService {

	/**
	 * 
	 * @param numOfElevators
	 * @return
	 */
	Elevator initElevators(int numOfElevators);

	/**
	 * 
	 * @param elevatorClickRequest
	 */
	void goUp(ElevatorClickRequest elevatorClickRequest);

	/**
	 * 
	 * @param elevatorClickRequest
	 */
	void goDown(ElevatorClickRequest elevatorClickRequest);
}
