package com.spring.annotation;

import com.model.Sim;

public interface ISimDao {

	public void persistSim(Sim sim);
	public void deleteSimBySid(String sid);

}
