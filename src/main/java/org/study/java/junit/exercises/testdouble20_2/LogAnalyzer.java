package org.study.java.junit.exercises.testdouble20_2;

import java.io.IOException;
import java.util.Map;

public class LogAnalyzer {

    LogLoader logLoader = new LogLoader();
    
    public Object analyze(String file){
        
        try {
            Map<String, String> rawData = logLoader.load(file);
            return doAnalyze(rawData);
        } catch (IOException e) {
            throw new AnalyzeException(e);
        }
        
    }

    private Object doAnalyze(Map<String, String> rawData) {
        // TODO これは仮実装です
        return new Object();
    }
    
    static class AnalyzeException extends RuntimeException {
        public AnalyzeException(Throwable cause) {
            super(cause);
        }
    }
    
}
