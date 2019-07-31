package com.spcloud.license.bean;

import java.io.Serializable;

/**
 * @description:许可证 VO
 * @author: chenyk25600
 * @create: 2019-07-29 15:29
 **/
public class LicenseVO implements Serializable {
    private static final long serialVersionUID = 7671418819256082391L;
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
    /**
     * 组织名称
     */
    private String orgName;

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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
}
