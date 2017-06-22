package cn.michaelhai.hitemplate;

import java.util.Map;

/**
 * Created by MichaelHai on 2017/6/4.
 *
 * Engine interface
 */
public interface HitemplateEngine {
    void setTemplateSource(TemplateSource stringTemplateSource);

    void setResultTarget(ResultTarget result);

    void setModel(Map<String, String> model);

    void generateResult();
}
