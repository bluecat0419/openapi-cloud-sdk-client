package com.openapi.sdk.test.model;

import com.openapi.sdk.common.BaseModel;

import java.util.HashMap;

/**
 * 测试API返回参数
 * @author ZhangTianYou
 */
public class TestResponse extends BaseModel {

    /**
     * 请求 ip
     */
    private String ip;

    /**
     * 随机名称
     */
    private String name;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    protected void map(HashMap<String, String> map) {
        this.setParam(map,"ip",this.ip);
        this.setParam(map,"name",this.name);
    }
}
