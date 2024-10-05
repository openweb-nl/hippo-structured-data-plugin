package nl.openweb.structured.data.utils;

import static nl.openweb.structured.data.tag.StructuredDataPlaceholderTag.STRUCTURED_DATA_AS_JSON;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import nl.openweb.structured.data.AbstractStructuredDataTest;
import nl.openweb.structured.data.mock.MockRequest;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.request.HstRequestContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ContributeStructuredDataTest extends AbstractStructuredDataTest {

  private HstRequest hstRequest;
  private HttpServletRequest servletRequest = new MockRequest();

  @BeforeEach
  public void init() {
    super.init();
    hstRequest = Mockito.mock(HstRequest.class);
    HstRequestContext requestContext = Mockito.mock(HstRequestContext.class);
    Mockito.when(hstRequest.getRequestContext()).thenReturn(requestContext);
    Mockito.when(requestContext.getServletRequest()).thenReturn(servletRequest);
  }

  @Test
  void test() {
    ContributeStructuredData.contributeJson("First Bean", hstRequest);
    ContributeStructuredData.contributeJson("Second Bean", servletRequest);

    Object attribute = servletRequest.getAttribute(STRUCTURED_DATA_AS_JSON);
    Assertions.assertTrue(attribute instanceof List);
    assertArrayEquals(new String[]{"First Bean", "Second Bean"},
        ((List<String>) attribute).toArray());
  }
}
