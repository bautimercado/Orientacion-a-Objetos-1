package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public class Lifo extends Strategy{

	public Lifo(String name) {
		super(name);
	}

	public JobDescription next(List<JobDescription> jobs) {
		return jobs.remove(jobs.size()-1);
	}
}
