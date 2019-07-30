package com.spcloud.license.controller;

import com.spcloud.license.bean.LicenseVO;
import com.spcloud.license.mapper.LicenseMapper;
import com.spcloud.license.model.License;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 许可证服务
 * @author: chenyk25600
 * @create: 2019-07-29 15:25
 **/
@RestController
@RequestMapping(value = "license")
public class LicenseController {

    @Autowired
    private LicenseMapper licenseMapper;

    /**
     * 根据id获取许可证
     *
     * @param id
     * @return
     * @author welkin
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public LicenseVO get(@PathVariable(value = "id") Integer id) {
        License license = licenseMapper.selectById(id);
        LicenseVO licenseVO = new LicenseVO();
        BeanUtils.copyProperties(license, licenseVO);
        return licenseVO;
    }

}
