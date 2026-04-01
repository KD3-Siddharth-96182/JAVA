package com.sunbeam;

enum TrafficLight {
    RED(35), GREEN(50), YELLOW(6);

    private int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}


public class Que04 {
	 public static void main(String[] args) {
	        for (TrafficLight t : TrafficLight.values()) {
	            System.out.println(t + " " + t.getDuration());
	        }
	    }
}
