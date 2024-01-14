package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.LoadsDAO;
import com.springrest.springrest.entities.load;


@Service
public class LoadServiceimpl implements Loadservices{

	@Autowired
	private LoadsDAO loadsDao;
	
	
	
	List<load>list;
	
	public LoadServiceimpl() {
		
		//list =new ArrayList<>();
		//list.add(new load("delhi","jaipur","chemicals","canter","1","100",123,"10-01-2024"));
	
	}
	
	@Override
	public List<load> getLoads() {
		
		return loadsDao.findAll();
	}

	@Override
	public load getLoad(long shipperId) {
		//load c=null;
		//for(load load: list) {
		//	if(load.getShipperId()==shipperId)
		//	{
		//		c=load;
		//		break;
		//	}
		 //}
		return loadsDao.getOne(shipperId);
	}

	@Override
	public load addLoad(load load) {
		//list.add(load);
		loadsDao.save(load);
		return load;
	}

	@Override
	public load upateLoad(load load) {
		//list.forEach(e -> {
			//if(e.getShipperId()==load.getShipperId()) {
			//	e.setLoadingPoint(load.getLoadingPoint());
			//	e.setUnloadingPoint(load.getUnloadingPoint());
			//	e.setProductType(load.getProductType());
			//	e.setTruckType(load.getTruckType());
			//	e.setNoOfTrucks(load.getNoOfTrucks());
			//	e.setWeight(load.getWeight());
			//	e.setDate(load.getDate());
			//}
		//});
		
		
		loadsDao.save(load);
		return load;
	}

	@Override
	public void deleteLoad(long parseLong) {
		//list=this.list.stream().filter(e -> e.getShipperId()!=parseLong).collect(Collectors.toList());
	 load entity=loadsDao.getOne(parseLong);
	 loadsDao.delete(entity);
	
	}

	

}
