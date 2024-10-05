package nl.openweb.structured.data.tag;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;

import nl.openweb.structured.data.utils.ConversionUtils;

public class StructuredDataTagSupport extends TagSupport {


    private static final long serialVersionUID = 3222122322391092L;

    protected transient String mapperId;

    protected void printBean(Object bean) throws IOException {
        if (bean != null) {
            printString(ConversionUtils.beanToJson(bean, mapperId));
        }
    }

    protected void printString(String json) throws IOException {
        if (StringUtils.isNotBlank(json)) {
            JspWriter out = pageContext.getOut();
            out.write("<script type=\"application/ld+json\">");
            out.write(json);
            out.write("</script>");
        }
    }

    protected HippoBean getBeanFromContext() {
        HippoBean result = null;
        ServletRequest request = pageContext.getRequest();
        if (request instanceof HstRequest hstRequest) {
            result = hstRequest.getRequestContext().getContentBean();
        }
        return result;
    }

    @Override
    public void release() {
        super.release();
        this.mapperId = null;
    }

    public void setMapper(String mapperName) {
        this.mapperId = mapperName;
    }
}
