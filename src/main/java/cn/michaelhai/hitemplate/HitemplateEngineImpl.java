package cn.michaelhai.hitemplate;

/**
 * Created by MichaelHai on 2017/6/4.
 *
 * The basic implementation of the engine
 */
public class HitemplateEngineImpl implements HitemplateEngine {
    private String template;

    @Override
    public void setTemplateSource(TemplateSource templateSource) {
        this.template = templateSource.getTemplate();
    }

    @Override
    public void setResultTarget(ResultTarget result) {
        result.setResult(template);
    }
}
