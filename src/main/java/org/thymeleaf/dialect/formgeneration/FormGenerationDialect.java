/*
 * FormGenerationDialect.java
 *
 * Created on 02.04.2017
 */
package org.thymeleaf.dialect.formgeneration;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.processor.StandardXmlNsTagProcessor;
import org.thymeleaf.templatemode.TemplateMode;

/**
 * Dialect used to automatically generate forms for given classes.
 */
public class FormGenerationDialect extends AbstractProcessorDialect {

    /**
     * The name of the dialect.
     */
    private static final String DIALECT_NAME = "Form Generation Dialect";

    /**
     * Call super constructor, setting the name and prefix as well as precedence.
     */
    public FormGenerationDialect() {
        super(DIALECT_NAME, "fg", 500);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<IProcessor> getProcessors(final String dialectPrefix) {
        final Set<IProcessor> processors = new HashSet<>();
        processors.add(new StandardXmlNsTagProcessor(TemplateMode.HTML, dialectPrefix));
        return processors;
    }
}
