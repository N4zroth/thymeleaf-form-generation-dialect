/*
 * InputElement.java
 *
 * Created on 02.04.2017
 */
package org.thymeleaf.dialect.formgeneration.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used for form inputs.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InputElement {

    /**
     * The text to be displayed by the label associated with this element.
     * Can be anything that th:text would accept, including a reference to an i18n text.
     */
    String labelText();

    /**
     * Type of the input element.
     */
    InputType type();

    /**
     * Defines the state of this element in a form for adding.
     */
    StateType add() default StateType.PRESENT;

    /**
     * Defines the state of this element in a form for editing.
     */
    StateType edit() default StateType.PRESENT;

    /**
     * Indicates whether or not the 'required' attribute will be present.
     */
    boolean required() default true;

    /**
     * Can be used to set custom values for the input element.
     * Anything that would be accepted by th:value is possible here.
     */
    String value() default "";

}
