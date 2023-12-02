package com.autoproject.Controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.autoproject.Entity.Auto;
import com.autoproject.Exception.PriceNotFoundException;
import com.autoproject.Service.AutoService;

@RestController
public class AutoController {
	@Autowired
	AutoService as;
	static Logger log = Logger.getLogger(AutoController.class);

	@PostMapping(value = "/store")
	public String getStore(@RequestBody List<Auto> l) {
		return as.getStore(l);
	}

	@GetMapping(value = "/getvalue")
	public Auto getMax() throws PriceNotFoundException {
		PropertyConfigurator.configure("log4j.properties");
		log.info(as.getMax());
		return as.getMax();
	}
}
