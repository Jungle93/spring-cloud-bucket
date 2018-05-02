package com.jungle.controller;

import com.jungle.service.NameService;
import com.jungle.service.SecretService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : jungle
 * @Title : HelloController
 * @Package :
 * @Description: .
 * @Date :
 */
@Controller
public class HelloController {



    /**
     * log.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private NameService nameService;

    @Autowired
    private SecretService secretService;

    /**
     * say hello .
     *
     * @return Object
     */
    @RequestMapping("/hello")
    @ResponseBody
    public Object sayHello() {
        return nameService.getName();
    }

    /**
     * get secret message.
     *
     * @return Object
     */
    @RequestMapping("/secret")
    @ResponseBody
    public Object getSecret() {
        return secretService.getSecret();
    }
}
