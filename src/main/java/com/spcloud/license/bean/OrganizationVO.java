package com.spcloud.license.bean;

import java.io.Serializable;

/**
 * @description:组织 VO
 * @author: chenyk25600
 * @create: 2019-07-29 15:29
 **/
public class OrganizationVO implements Serializable {
    private static final long serialVersionUID = 7671418819256082391L;
    /**
     * id
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;

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
}
