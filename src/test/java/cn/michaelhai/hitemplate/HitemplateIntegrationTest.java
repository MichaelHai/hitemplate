package cn.michaelhai.hitemplate;

import cn.michaelhai.hitemplate.resulttarget.StringResultTarget;
import cn.michaelhai.hitemplate.templatesource.StringTemplateSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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

        engine.generateResult();

        assertEquals("This is a template.", result.getResult());
    }

    @Test
    void testSimpleVariableReplace() {
        engine.setTemplateSource(new StringTemplateSource("This is a [[ variable ]] template"));
        Map<String, String> model = new HashMap<>();
        model.put("variable", "wonderful");
        engine.setModel(model);
        StringResultTarget result = new StringResultTarget();
        engine.setResultTarget(result);

        engine.generateResult();

        assertEquals("This is a wonderful template", result.getResult());
    }
}
