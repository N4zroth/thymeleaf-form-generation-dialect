package org.thymeleaf.dialect.formgeneration.model;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.thymeleaf.dialect.formgeneration.exception.FormCreationException;

public enum FormType {
    ADD("add"),
    EDIT("edit");

    private String value;

    FormType(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static FormType fromString(String value) {
        for (FormType formType : FormType.values()) {
            if (formType.value.equalsIgnoreCase(value)) {
                return formType;
            }
        }
        throw new FormCreationException(
                "Invalid attribute type '" + value + "', allowed are " + Arrays.stream(FormType.values())
                        .map(FormType::getValue).collect(Collectors.toList()));
    }
}
