package com.jungle.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : jungle
 * @Title : SecretService
 * @Package : com.jungle.service
 * @Description: 咪咪服务.
 * @Date : 2018/5/2-18:15
 */
@FeignClient("application-eureka-client-provider")
@Service
public interface SecretService {
    @RequestMapping("/getSecret")
    String getSecret();
}
