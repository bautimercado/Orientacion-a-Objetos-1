package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public class HighestPriority extends Strategy{
	
	public HighestPriority(String name) {
		super(name);
	}
	
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.stream()
				.max((j1, j2) -> Integer.compare(j1.getPriority(), j2.getPriority()))
				.orElse(null);
	}

}
