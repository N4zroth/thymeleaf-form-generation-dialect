package org.thymeleaf.dialect.formgeneration;

import org.apache.commons.lang3.StringUtils;
import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.dialect.formgeneration.exception.FormCreationException;
import org.thymeleaf.dialect.formgeneration.model.FormType;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractElementTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

public class FormCreationProcessor extends AbstractElementTagProcessor {

    private static final String TAG_NAME = "form";
    private static final int PRECEDENCE = 500;

    public FormCreationProcessor(final String dialectPrefix) {
        super(TemplateMode.HTML, dialectPrefix, TAG_NAME, true, null, false, PRECEDENCE);
    }

    @Override
    protected void doProcess(final ITemplateContext iTemplateContext,
            final IProcessableElementTag iProcessableElementTag,
            final IElementTagStructureHandler iElementTagStructureHandler) {
        String type = iProcessableElementTag.getAttributeValue("type");

        if (StringUtils.isBlank(type)) {
            throw new FormCreationException("Type attribute not found!");
        }

        final FormType formType = FormType.fromString(type);

        final String entityClass = iProcessableElementTag.getAttributeValue("target");
        // TODO: Find class and throw exception if not present

        iElementTagStructureHandler.replaceWith("<form></form>", true);
    }
}
