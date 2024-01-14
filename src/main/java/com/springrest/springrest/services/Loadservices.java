package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.load;

public interface Loadservices {
	
public List<load> getLoads();

public load getLoad(long shipperId);

public load addLoad(load load);

public load upateLoad(load load);

public void deleteLoad(long parseLong);


}
