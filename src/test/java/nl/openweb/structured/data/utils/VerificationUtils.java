package nl.openweb.structured.data.utils;

import java.text.DateFormat;

import com.fasterxml.jackson.databind.JsonNode;

import nl.openweb.structured.data.domain.BreadcrumbItem;
import nl.openweb.structured.data.domain.EventBean;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificationUtils {

    private VerificationUtils() {
    }

    public static void verifyEventFields(EventBean bean, JsonNode jsonNode, DateFormat dateFormat) {
        assertEquals("http://schema.org", getProperty(jsonNode, "@context"));
        assertEquals("Event", getProperty(jsonNode, "@type"));
        assertEquals(bean.getName(), getProperty(jsonNode, "name"));
        assertEquals(bean.getUrl(), getProperty(jsonNode, "url"));
        assertEquals(dateFormat.format(bean.getStartDate().getTime()), getProperty(jsonNode, "startDate"));
        if (bean.getEndDate() != null) {
            assertEquals(dateFormat.format(bean.getEndDate().getTime()), getProperty(jsonNode, "endDate"));
        }

        JsonNode location = jsonNode.get("location");

        assertEquals("http://schema.org", getProperty(location, "@context"));
        assertEquals("Place", getProperty(location, "@type"));
        assertEquals(bean.getLocation().getName(), getProperty(location, "name"));
        assertEquals(bean.getLocation().getAddress(), getProperty(location, "address"));
    }

    public static void verifyBreadcrumbFields(BreadcrumbItem bean, JsonNode jsonNode, int position) {
        assertEquals("ListItem", getProperty(jsonNode, "@type"));
        assertEquals(position, jsonNode.get("position").asInt());
        JsonNode item = jsonNode.get("item");
        assertEquals(bean.getName(), getProperty(item, "name"));
        assertEquals(bean.getUrl(), getProperty(item, "@id"));
    }

    private static String getProperty(JsonNode jsonNode, String propertyName) {
        return jsonNode.get(propertyName) == null ? "NULL" : jsonNode.get(propertyName).asText();
    }
}
