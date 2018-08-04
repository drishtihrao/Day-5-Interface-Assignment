package com.cg.interfaceassignment.vehicle.test;
/*
 * This class implements the method defined in Vehicle Interface
 * Each class implementing Vehicle interface overrides the method written in it
 * The start method can be called using any one of the leaf classes
 */
import com.cg.interfaceassignment.vehicle.FourWheeler;
import com.cg.interfaceassignment.vehicle.ThreeWheeler;
import com.cg.interfaceassignment.vehicle.TwoWheeler;
import com.cg.interfaceassignment.vehicle.Vehicle;

public class VehicleDemo {
	public static void main(String[] args) {
		Vehicle vehicle[] = new Vehicle[3];
		
		vehicle[0] = new TwoWheeler();
		vehicle[1] = new ThreeWheeler();
		vehicle[2] = new FourWheeler();
		
		for(int i=0; i<3; i++) {
			if(vehicle[i].getClass().getName().equals("ThreeWheeler")) {
				vehicle[i].start();
			}
		}
	}
}
