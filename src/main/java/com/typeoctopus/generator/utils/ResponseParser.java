package com.typeoctopus.generator.utils;

public class ResponseParser {
    public static String extractText(String response) {
        int startIndex = response.indexOf(",") + 1;
        int endIndex = response.lastIndexOf(",");
        
        if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) {
            return response.substring(startIndex, endIndex);
        } else {
            return null;
        }
    }
}
