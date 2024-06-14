package main;

import java.util.ArrayList;
import java.util.List;

public abstract class FlowLogger {  
    protected List<LoggerData> logs = new ArrayList<>(); 

    public List<LoggerData> getFlows() {
        return this.logs;
    }

    public void clearFlows() {
        this.logs.clear();
    }

    public void append(LoggerData logger) {
        this.logs.add(logger);
    }
}
