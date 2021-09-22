package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public class Fifo extends Strategy{
	
	public Fifo(String name) {
		super(name);
	}
	
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.remove(0);
	}

}
