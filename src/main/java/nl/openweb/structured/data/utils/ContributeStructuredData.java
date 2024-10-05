package nl.openweb.structured.data.utils;

import jakarta.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.List;

import org.hippoecm.hst.core.component.HstRequest;


import static nl.openweb.structured.data.tag.StructuredDataPlaceholderTag.STRUCTURED_DATA_AS_JSON;

public class ContributeStructuredData {

    private ContributeStructuredData() {
        // private constructor
    }

    public static void contributeBean(Object bean, HstRequest request) {
        contributeBean(bean, null, request);
    }

    public static void contributeBean(Object bean, String mapperId, ServletRequest request) {
        contributeJson(ConversionUtils.beanToJson(bean, mapperId), request);
    }

    @SuppressWarnings("unchecked")
    public static void contributeJson(String json, ServletRequest servletRequest) {
        ServletRequest request = servletRequest instanceof HstRequest hstRequest? hstRequest.getRequestContext().getServletRequest() : servletRequest;
        Object attribute = request.getAttribute(STRUCTURED_DATA_AS_JSON);
        if (attribute instanceof List list) {
            list.add(json);
        } else {
            List<String> list = new ArrayList<>();
            list.add(json);
            request.setAttribute(STRUCTURED_DATA_AS_JSON, list);
        }
    }


}
