package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public abstract class Strategy {
	private String name;
	
	public Strategy(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract JobDescription next(List<JobDescription> jobs);
}
