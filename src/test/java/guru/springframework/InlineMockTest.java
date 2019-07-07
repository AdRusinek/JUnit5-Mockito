package guru.springframework;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by Adrian Rusinek on 06.07.2019
 **/
public class InlineMockTest {

    @Test
    void testInlineMock() {
        Map mapMock = mock(Map.class);

        assertEquals(mapMock.size(),0);

    }
}
