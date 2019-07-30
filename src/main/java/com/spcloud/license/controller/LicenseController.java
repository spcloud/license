package com.spcloud.license.controller;

import com.spcloud.license.model.LicenseVO;
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

    @Value("${custom.name}")
    private String name;

    /**
     * 根据id获取许可证
     *
     * @param id
     * @return
     * @author welkin
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public LicenseVO get(@PathVariable(value = "id") String id) {
        LicenseVO licenseVO = new LicenseVO();
        licenseVO.setId(id);
        licenseVO.setName("你好," + name);
        return licenseVO;
    }

}
