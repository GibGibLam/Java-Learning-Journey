package com.fdmgroup.collection_exercise;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Qn3_HashMap {
//	3)	Use a HashMap to create a reusable class for choosing one of the 13 predefined colors in class Color. 
//The names of the colors should be used as keys, and the predefined Color objects should be used as values. 
//It should return the HashMap .
	
	public  Object colorFinder(String color) {

	
		
		Map<String, Color> colorHashmap = new HashMap<>();
		colorHashmap.put("Magenta", Color.MAGENTA);
        colorHashmap.put("Yellow", Color.YELLOW);
        colorHashmap.put("Cyan", Color.CYAN);
//        colorHashmap.put(DarkGray, DarkGray);  
//        colorHashmap.put(Orange, Orange);
//        colorHashmap.put(Gray, Gray);
//        colorHashmap.put(White, White);
//        colorHashmap.put(Blue, Blue);
//        colorHashmap.put(Green, Green);
//        colorHashmap.put(Red, Red);
//        colorHashmap.put(Pink, Pink);
//        colorHashmap.put(LightGray, LightGray);
//        colorHashmap.put(Black, Black);
        
		System.out.println("HashMap size: " + colorHashmap.size());
		 colorHashmap.forEach((k,v) -> System.out.println(k + ":" + v));
		 return colorHashmap;
	}
}
