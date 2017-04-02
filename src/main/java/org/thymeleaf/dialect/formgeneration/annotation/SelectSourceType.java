/*
 * SelectSourceType.java
 *
 * Created on 02.04.2017
 */
package org.thymeleaf.dialect.formgeneration.annotation;

/**
 * Enum to define the value source for a select element.
 */
public enum SelectSourceType {
    /**
     * The possible values will be taken from a model attribute.
     */
    MODEl_ATTRIBUTE,

    /**
     * The possible values will be taken from a static method.
     */
    STATIC_METHOD;
}
