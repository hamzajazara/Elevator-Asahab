package com.asahab.elevators.model.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ElevatorClickRequest {

	private int currentFloor;

	private int nextFloor;
}
