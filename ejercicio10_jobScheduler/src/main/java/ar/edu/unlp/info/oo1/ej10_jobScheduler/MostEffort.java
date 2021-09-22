package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public class MostEffort extends Strategy{
	
	public MostEffort(String name) {
		super(name);
	}
	
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.stream()
				.max((j1, j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
				.orElse(null);
	}

}
