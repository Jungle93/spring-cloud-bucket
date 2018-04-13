package com.jungle.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : jungle
 * @Title : NameService
 * @Package : com.jungle.service
 * @Description: 名称服务.
 * @Date : 2018/4/8-10:33
 */
@FeignClient("application-eureka-client-provider")
@Service
public interface NameService {
    @RequestMapping("/getName")
    String getName();
}
