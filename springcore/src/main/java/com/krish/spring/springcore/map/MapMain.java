package com.krish.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/krish/spring/springcore/map/MapConf.xml");
		
		Customer cu = (Customer) context.getBean("customer");
		System.out.println(cu);
	}

}
