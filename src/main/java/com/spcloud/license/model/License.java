package com.spcloud.license.model;

import java.io.Serializable;

/**
 * @description: 许可证
 * @author: chenyk25600
 * @create: 2019-07-30 15:13
 **/
public class License implements Serializable {
    private static final long serialVersionUID = -7913547970734323258L;
    /**
     * id
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 组织id
     */
    private Integer orgId;

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

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
}
