package com.upol;

public enum Environment
{
    PROD("https://prod.domain.com:1088/"),
    SIT("https://sit.domain.com:2019/"),
    CIT("https://cit.domain.com:8080/"),
    DEV("https://dev.domain.com:21323/");

    private String url;

    Environment(String envUrl) {
        this.url = envUrl;
    }

    public String getUrl() {
        return url;
    }
}
