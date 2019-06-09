package com.adam.library.utility;

import com.adam.library.exceptionHandler.ResourceNotFoundException;

public class PreConditionValidator {

        public static <T> T checkFound(T resource) {
            if (resource == null) {
                throw new ResourceNotFoundException();
            }
            return resource;
        }
}
