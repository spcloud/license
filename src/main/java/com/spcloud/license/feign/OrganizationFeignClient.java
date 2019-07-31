package com.spcloud.license.feign;

import com.spcloud.license.bean.OrganizationVO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 组织服务
 *
 * @author welkin
 * @create 20190731
 */
@FeignClient("organization")
@RequestMapping(value = "organization")
public interface OrganizationFeignClient {

    /**
     * 根据id获取组织
     *
     * @param id
     * @return
     * @author welkin
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    OrganizationVO get(@PathVariable(value = "id") Integer id);

}
