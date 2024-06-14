package main;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class FlowLoggerImpl extends FlowLogger {
    @Override
    public String toString() {
        // store group of log as array
        List<String> logFormetteds = new ArrayList<>();

        // store group of data kay value word ("key: value")
        StringBuilder flowBuilder = new StringBuilder();

        // loop for get all logs
        for (LoggerData log : logs) {
            // get key of of log
            String logKey = log.getKey();

            // get values of log (group of variable)
            Hashtable<String, Object> logValues = log.getValues();

            // get group of key store variable name as key
            Enumeration<String> keysGroup = logValues.keys();

            // append name of flow
            flowBuilder.append(logKey);

            // append braces open
            flowBuilder.append('{');
            
            // store group of variable (variables store data used in flow)
            List<String> variables = new ArrayList<>();

            // loop all key of hashtable for store kay and value as variable
            while (keysGroup.hasMoreElements()) {
                // get key
                String key = keysGroup.nextElement(); 
                
                // get value
                Object value = logValues.get(key); 

                // store variable with value to variable group
                variables.add(key + ": " + value);
            }   
            
            // join variable group to flow builder
            flowBuilder.append(String.join(",", variables));

            // append braces close
            flowBuilder.append('}');

            // convert flow builder to log formatter
            logFormetteds.add(flowBuilder.toString());

            // set flow builder to empty
            flowBuilder.setLength(0);
        }

        // join log formatted for result
        return String.join("\n", logFormetteds);
    }
}
