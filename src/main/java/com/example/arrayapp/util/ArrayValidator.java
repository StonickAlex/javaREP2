package com.example.arrayapp.model;

import com.example.arrayapp.exception.InvalidDataException;
import java.util.regex.Pattern;

public class ArrayValidator {
    private static final Pattern VALID_DATA_PATTERN = Pattern.compile("\\d+");

    public static void validateData(String[] dataArray) throws InvalidDataException {
        for (String data : dataArray) {
            if (!VALID_DATA_PATTERN.matcher(data).matches()) {
                throw new InvalidDataException("Invalid data: " + data);
            }
        }
    }
}
