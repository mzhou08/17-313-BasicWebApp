package com.develogical;

import java.util.*;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("name")) {
            return "Imperial";
        } else if (query.toLowerCase().contains("which of the following numbers is the largest")) {
            String[] splitQuery = query.split(":");
            String vals = splitQuery[splitQuery.length - 1];

            vals = vals.trim();
            ArrayList <Integer> nums = new ArrayList<Integer>();
            for (String value : vals.split(", ")) {
                nums.add(Integer.parseInt(value));
            }
            
            Integer maxNum = Integer.MIN_VALUE;

            for (Integer num : nums) {
                maxNum = Integer.max(maxNum, num);
            }

            return String.valueOf(maxNum);
        } else if (query.toLowerCase().contains("what is") && query.toLowerCase().contains("multiplied by")) {
            return "";
        }
        
        return "";
    }
}
