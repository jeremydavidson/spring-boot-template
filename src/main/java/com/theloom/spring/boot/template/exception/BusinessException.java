package com.theloom.spring.boot.template.exception;

import java.io.Serial;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -2582819800646135357L;

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(String message) {
        super(message);
    }

}
