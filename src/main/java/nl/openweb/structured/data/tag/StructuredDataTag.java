package nl.openweb.structured.data.tag;

import jakarta.servlet.jsp.JspException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StructuredDataTag extends StructuredDataTagSupport {
    private static final Logger LOG = LoggerFactory.getLogger(StructuredDataTag.class);

    private static final long serialVersionUID = -4685336583926691092L;
    private transient Object bean;

    @Override
    public void release() {
        super.release();
        this.bean = null;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            Object targetBean = getBean();
            printBean(targetBean);
        } catch (Exception e) {
            LOG.error("Error mapping a bean to JSON: " + e.getMessage(), e);
        }
        return SKIP_BODY;
    }

    public Object getBean() {
        return bean != null ? bean : getBeanFromContext();
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

}
