package cn.michaelhai.hitemplate;

import java.util.Map;

/**
 * Created by MichaelHai on 2017/6/4.
 * <p>
 * The basic implementation of the engine
 */
public class HitemplateEngineImpl implements HitemplateEngine {
    private String template;
    private ResultTarget result;
    private Map<String, String> model;

    @Override
    public void setTemplateSource(TemplateSource templateSource) {
        this.template = templateSource.getTemplate();
    }

    @Override
    public void setResultTarget(ResultTarget result) {
        this.result = result;
    }

    @Override
    public void setModel(Map<String, String> model) {
        this.model = model;
    }

    @Override
    public void generateResult() {
        int variableStart = template.indexOf("[[");
        int variableEnd = template.indexOf("]]", variableStart);

        if (variableStart != -1 && variableEnd != -2) {
            String before = template.substring(0, variableStart);
            String end = template.substring(variableEnd + 2);
            String variable = template.substring(variableStart + 2, variableEnd).trim();
            String value = model.get(variable);
            result.setResult(before + value + end);
        } else {
            result.setResult(template);
        }
    }
}
