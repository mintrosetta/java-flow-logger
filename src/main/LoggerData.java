package main;

import java.util.Hashtable;

public class LoggerData {
    private String key;
    private Hashtable<String, Object> values = new Hashtable<>();;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Hashtable<String, Object> getValues() {
        return values;
    }

    public void append(String key, Object value) {
        this.values.put(key, value);
    }
}
