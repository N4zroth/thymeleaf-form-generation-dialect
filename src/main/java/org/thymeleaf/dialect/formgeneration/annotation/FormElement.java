package org.thymeleaf.dialect.formgeneration.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * General annotation to indicate that the annotated field should be used as an element in a form.
 * Will try to generate an element based on field type.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FormElement {

    /**
     * The text to be displayed by the label associated with this element.
     * Can be anything that th:text would accept, including a reference to an i18n text.
     */
    String labelText();

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
