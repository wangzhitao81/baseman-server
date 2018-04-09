package com.ecologydata.baseman.controller;

import com.ecologydata.baseman.common.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录页
 */
@RestController
public class LoginController {

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value="/login",method= RequestMethod.POST)
    public RestResult<String> ping(){
        RestResult<String> r = new RestResult<String>();
        r.setMsg("登录成功");
        r.setSuccess(true);
        return r;
    }
}
