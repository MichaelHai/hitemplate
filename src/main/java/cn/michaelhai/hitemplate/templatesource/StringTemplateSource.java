package cn.michaelhai.hitemplate.templatesource;

import cn.michaelhai.hitemplate.TemplateSource;

/**
 * Created by MichaelHai on 2017/6/4.
 *
 * Use the String object as the source of the template
 */
public class StringTemplateSource implements TemplateSource {
    private String template;

    public StringTemplateSource(String template) {
        this.template = template;
    }

    @Override
    public String getTemplate() {
        return template;
    }
}
