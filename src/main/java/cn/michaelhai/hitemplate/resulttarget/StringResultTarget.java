package cn.michaelhai.hitemplate.resulttarget;

import cn.michaelhai.hitemplate.ResultTarget;

/**
 * Created by MichaelHai on 2017/6/5.
 *
 * Use the String object as the result target.
 */
public class StringResultTarget implements ResultTarget {
    private String result;

    public String getResult() {
        return result;
    }

    @Override
    public void setResult(String result) {
        this.result = result;
    }
}
