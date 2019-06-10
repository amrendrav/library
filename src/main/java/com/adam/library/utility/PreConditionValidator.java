package com.adam.library.utility;

import com.adam.library.exceptionHandler.BusinessException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PreConditionValidator {

        public static <T> T checkFound(T resource) {
            if (resource == null) {
                log.error("Invalid Parameter : {}", resource.toString());
                throw new BusinessException(String.format("Invalid Input Data : %s", resource.toString()));
            }
            return resource;
        }
}
