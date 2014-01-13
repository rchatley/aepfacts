package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.contains("hi")) {
            return "hello";
        }
        return "";
    }

}
