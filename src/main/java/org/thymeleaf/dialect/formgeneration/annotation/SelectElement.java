package org.thymeleaf.dialect.formgeneration.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used for form selects.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SelectElement {

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
     * The size of the displayed select element.
     */
    int size() default 10;

    /**
     * The type of source used for the options of this select (static method or model attribute).
     */
    SelectSourceType sourceType();

    /**
     * Identifier of the source to be used for this select.
     * Can either be the FQDN of a static method, or the name of a model attribute.
     */
    String source();

    /**
     * Name of the field used referenced via th:value.
     */
    String valueField();

    /**
     * (Optional) Name of the iterator variable used in th:each.
     */
    String iteratorName() default "";

    /**
     * (Optional) Text to be displayed on each element. Defaults to the valueField.
     */
    String text() default "";

}
