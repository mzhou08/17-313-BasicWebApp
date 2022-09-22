import java.util.*;

package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "Imperial";
        }
        String[] splitQuery = query.split(":");
        String question = splitQuery[1];
        String vals = splitQuery[splitQuery.length() - 1];
        
        if (question.toLowerCase().contains("which of the following numbers is the largest")) {
            vals = vals.strip();
            Integer[] nums = vals.split(", ");
            return Collections.max(Arrays.asList(nums));
        }
        
        return "";
    }
}
