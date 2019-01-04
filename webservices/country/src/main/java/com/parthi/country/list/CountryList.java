package com.parthi.country.list;

import java.util.ArrayList;
import java.util.List;

import com.parthi.country.dao.CountryDao;

public class CountryList
{

	
	public List<CountryDao> list()
	{
		List<CountryDao> list = new ArrayList<CountryDao>();
		
		list.add(new CountryDao("karnataka", "Bangalore", "India", 560036));
		list.add(new CountryDao("Maharastra", "Mumbai", "India", 401501));
		list.add(new CountryDao("Andra Pradesh", "Tirupati", "India", 517502));
		return list;
		
	}

}	