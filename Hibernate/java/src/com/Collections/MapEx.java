package com.Collections;
import java.text.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapEx {
public static void main(String[] args) {
	
	Map map=new HashMap();
	map.put(4,5);
	map.put(3, 'a');
	Date date=new Date();
	Date date2=new Date();
	LocalDateTime date1=LocalDateTime.now();
   LocalDate date4=LocalDate.now();
   LocalTime time=LocalTime.now();
   System.out.println(time);
   
}
}
