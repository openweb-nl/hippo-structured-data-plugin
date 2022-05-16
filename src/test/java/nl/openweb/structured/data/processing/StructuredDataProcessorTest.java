package nl.openweb.structured.data.processing;

import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

import com.fasterxml.jackson.databind.JsonNode;

import nl.openweb.structured.data.AbstractStructuredDataTest;
import nl.openweb.structured.data.domain.EventBean;
import nl.openweb.structured.data.domain.LocationBean;
import nl.openweb.structured.data.domain.TrainingEventBean;
import nl.openweb.structured.data.domain.UnknownBean;
import nl.openweb.structured.data.utils.VerificationUtils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StructuredDataProcessorTest extends AbstractStructuredDataTest {

    private static final Logger LOG = LoggerFactory.getLogger(StructuredDataProcessorTest.class);

    @Test
    public void smokeTest() throws IOException {
        Calendar startDate = Calendar.getInstance();
        startDate.setTimeZone(TimeZone.getTimeZone("CET"));
        startDate.set(2016, Calendar.FEBRUARY, 10, 14, 43);

        EventBean bean = new EventBean("Pizza Night", "http://openweb.nl/pizza-night", new LocationBean("Openweb Office", "Nevelgaarde 40, 3436 ZZ Nieuwegein"), startDate, null);
        String jsonString = structuredDataProcessor.getStructuredDataAsJsonString(bean);

        JsonNode jsonNode = objectMapper.readValue(jsonString, JsonNode.class);
        LOG.debug("\n" + prettyPrint(jsonNode));

        VerificationUtils.verifyEventFields(bean, jsonNode, dateFormat);
    }

    @Test
    public void inheritanceTest() throws IOException {
        Calendar startDate = Calendar.getInstance();
        startDate.setTimeZone(TimeZone.getTimeZone("CET"));
        startDate.set(2016, Calendar.FEBRUARY, 4, 18, 45);

        TrainingEventBean bean = new TrainingEventBean("Stream API", "http://openweb.nl/pizza-night/steaming-api", new LocationBean("Openweb Office", "Nevelgaarde 40, 3436 ZZ Nieuwegein"), startDate, null);
        String jsonString = structuredDataProcessor.getStructuredDataAsJsonString(bean);

        JsonNode jsonNode = objectMapper.readValue(jsonString, JsonNode.class);
        LOG.debug("\n" + prettyPrint(jsonNode));

        VerificationUtils.verifyEventFields(bean, jsonNode, dateFormat);
    }

    @Test
    public void unknownBeanTest() {
        String jsonString = structuredDataProcessor.getStructuredDataAsJsonString(new UnknownBean());
        assertEquals("", jsonString);
    }

    @Test
    public void unknownMapperTest() {
        assertThrows(NoSuchBeanDefinitionException.class, ()->{
            structuredDataProcessor.getMapperByName("unknown");
        });
    }
}
