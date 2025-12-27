package com;

import java.util.ArrayList;
import java.util.Locale.Category;

public class Travel {

	public boolean isCarDriver(Driver d1) {
		return d1.getCategory().equalsIgnoreCase("bus");
	}
	public String retrivebyDriver(ArrayList<Driver> d, int driverId) {
		for(Driver driver : d) {
			if(driver.getDriverId() == driverId) {
				return "Driver name is "+driver.getDriverName()+" belongs to the "+driver.getCategory()+" traveled "+driver.getTotalDistance()+"KM";
			}
		}
		return "not found";
		
	}
	public int retriveCountOfDriver(ArrayList<Driver> d, String category) {
		int count =0;
		for(Driver driver : d) {
			if(driver.getCategory().equalsIgnoreCase(category)) {
				count++;
			}
		}
		return count;
	}
	public ArrayList<Driver> retriveDriver(ArrayList<Driver> d, String driverName){
		ArrayList<Driver> result = new ArrayList<>();
		for(Driver driver: d) {
			if(driver.getDriverName().equalsIgnoreCase(driverName)) {
				result.add(driver);
			}
		}
		return result;
	}
	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> d) {
		Driver maxDriver = d.get(0);
		for(Driver driver : d) {
			if(driver.getTotalDistance()>maxDriver.getTotalDistance()) {
				maxDriver = driver;
			}
		}
		
		return maxDriver;
		
	}

}
