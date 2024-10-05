package nl.openweb.structured.data.tag;

import java.util.Calendar;
import java.util.TimeZone;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.jsp.PageContext;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import nl.openweb.structured.data.AbstractStructuredDataTest;
import nl.openweb.structured.data.domain.EventBean;
import nl.openweb.structured.data.domain.LocationBean;
import nl.openweb.structured.data.utils.StringWriter;
import nl.openweb.structured.data.utils.TextFileUtils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StructuredDataPlaceholderTagTest extends AbstractStructuredDataTest {
    private StructuredDataPlaceholderTag tag = new StructuredDataPlaceholderTag();
    private StructuredDataContributionTag contributionTag = new StructuredDataContributionTag();
    private ServletRequest servletRequest = createMockHstRequest();
    private StringWriter out = new StringWriter();

    @Mock
    private PageContext pageContext;

    @BeforeEach
    public void init() {
        super.init();
        tag.setPageContext(pageContext);
        contributionTag.setPageContext(pageContext);

        when(pageContext.getRequest()).thenReturn(servletRequest);
        when(pageContext.getOut()).thenReturn(out);
    }

    private EventBean createEvent(String name, String url, LocationBean location, Calendar calendar) {
        return new EventBean(name, url, location, calendar, null);
    }

    private Calendar createCalendar(int year, int month, int day) {
        Calendar startDate = Calendar.getInstance();
        startDate.setTimeZone(TimeZone.getTimeZone("CET"));
        startDate.set(year, month, day, 0, 0);
        return startDate;
    }

    @Test
     void doStartTag() throws Exception {

        contributionTag.release();
        contributionTag.setBean(createEvent("Pizza Night", "http://openweb.nl/pizza-night", new LocationBean("Openweb Office", "Nevelgaarde 40, 3436 ZZ Nieuwegein"), createCalendar(2016, Calendar.FEBRUARY, 10)));
        contributionTag.doStartTag();
        contributionTag.release();
        contributionTag.setBean(createEvent("Team building", "http://openweb.nl/team-building", new LocationBean("Openweb Office", "Nevelgaarde 40, 3436 ZZ Nieuwegein"), createCalendar(2016, Calendar.JUNE, 17)));
        contributionTag.doStartTag();

        tag.doStartTag();
        String string = out.getAsString();
        assertEquals(TextFileUtils.getFileAsString("expected/StructuredDataPlaceholderTagTest.txt"), string);
    }
}
