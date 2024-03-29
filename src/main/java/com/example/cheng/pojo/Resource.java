package com.example.cheng.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author chengchenrui
 * @version Id: Resource.java, v 0.1 2018/7/1 11:09 chengchenrui Exp $$
 */
@Configuration
@ConfigurationProperties(prefix = "com.cheng.opensource")
@PropertySource(value = "classpath:resource.properties")
public class Resource {

    private String name;
    private String website;
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}