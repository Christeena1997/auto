package com.autoproject.Service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autoproject.Dao.AutoDao;
import com.autoproject.Entity.Auto;
import com.autoproject.Exception.PriceNotFoundException;

@Service
public class AutoService {
@Autowired
AutoDao ad;
	public String getStore(List<Auto> l) {
		
		return ad.getStore(l);
	}
	public Auto getMax() throws PriceNotFoundException {
		List<Auto> li=ad.getDetails();
	Auto h=li.stream().max(Comparator.comparing(Auto::getPrice)).get();
	if(h.getPrice()<100000) {
		throw new PriceNotFoundException("price are costly");
	}
	else {
	return h;
	}
	}
}
