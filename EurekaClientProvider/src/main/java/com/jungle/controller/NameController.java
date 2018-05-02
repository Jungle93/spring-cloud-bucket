package com.jungle.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : jungle
 * @Title : NameController
 * @Package : com.jungle.controller
 * @Description: .
 * @Date : 2018/4/8-10:42
 */
@RestController
public class NameController {
    /**
     * 日志。
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(NameController.class);

    @Value("${jungle.secret:not found secret ,check check}")
    private String secretMessage;

    /**
     * .
     *
     * @return Object
     */
    @RequestMapping("/getName")
    @ResponseBody
    public Object getName() {
        return "jungle 93 year";
    }

    /**
     * get secret.
     *
     * @return Object
     */
    @RequestMapping("/getSecret")
    @ResponseBody
    public Object getSecret() {

        return secretMessage;
    }
}
