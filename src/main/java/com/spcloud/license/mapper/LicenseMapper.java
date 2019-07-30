package com.spcloud.license.mapper;

import com.spcloud.license.model.License;
import org.apache.ibatis.annotations.Param;

public interface LicenseMapper {
    /**
     * 根据id获取
     *
     * @return
     * @author welkin
     */
    License selectById(@Param("id") Integer id);
}
