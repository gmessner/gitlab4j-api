package org.gitlab4j.api.models;

import org.gitlab4j.api.utils.JacksonJson;

import java.util.Date;
import java.util.List;

public class Link {

    private Integer id;
    private String name;
    private String url;
    private Boolean external;
    private String linkType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getExternal() {
        return external;
    }

    public void setExternal(Boolean external) {
        this.external = external;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    @Override
    public String toString() {
        return (JacksonJson.toJsonString(this));
    }
}