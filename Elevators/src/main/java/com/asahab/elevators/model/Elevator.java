package com.asahab.elevators.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Elevator {

	public static Elevator instance;

	private List<Queue<Integer>> elevators;

	public Elevator(int numOfElevators) {
		if (instance == null) {
			elevators = new ArrayList<>();
			while (numOfElevators > 0) {
				elevators.add(new LinkedList<>());
			}
		}
	}
}
