package org.thymeleaf.dialect.formgeneration.annotation;

/**
 * Enum used to declare the state of an element.
 */
public enum StateType {
    /**
     * The element will be fully present and editable.
     */
    PRESENT,

    /**
     * The element will be present but read-only.
     */
    READ_ONLY,

    /**
     * The element won't be present at all.
     */
    NOT_PRESENT;
}
