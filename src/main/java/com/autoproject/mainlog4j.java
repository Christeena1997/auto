package com.autoproject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class mainlog4j {
	static Logger log = Logger.getLogger(mainlog4j.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");
		log.info("Information");

	}
}
