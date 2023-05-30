package com.openapi.sdk.common;

import java.util.HashMap;

/**
 * 公共模型
 * @author ZhangTianYou
 */
public abstract class BaseModel {

    protected abstract void map(HashMap<String, String> var1);

    protected <V> void setParam(HashMap<String, String> map, String key, V value) {
        if (value != null) {
            map.put(key, String.valueOf(value));
        }
    }

}
