package main;

import java.util.ArrayList;
import java.util.List;

public class LoggerDataBuilder {
	private List<LoggerData> loggers = new ArrayList<>();
	
	public LoggerDataBuilder append(LoggerData log) {
		this.loggers.add(log);
		
		return this;
	}
	
	public List<LoggerData> build() {
		return this.loggers;
	}
}
