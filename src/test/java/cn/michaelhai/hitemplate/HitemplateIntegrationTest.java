package cn.michaelhai.hitemplate;

import cn.michaelhai.hitemplate.resulttarget.StringResultTarget;
import cn.michaelhai.hitemplate.templatesource.StringTemplateSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by MichaelHai on 2017/6/4.
 * <p>
 * Test the overall function of the hitemplate engine.
 */
class HitemplateIntegrationTest {
    private HitemplateEngine engine;

    @BeforeEach
    void setup() {
        engine = new HitemplateEngineImpl();
    }

    @Test
    void testOriginalText() {
        engine.setTemplateSource(new StringTemplateSource("This is a template."));
        StringResultTarget result = new StringResultTarget();
        engine.setResultTarget(result);

        assertEquals("This is a template.", result.getResult());
    }
}
