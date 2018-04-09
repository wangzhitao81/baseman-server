package com.ecologydata.baseman.controller;

import com.ecologydata.baseman.common.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping(value="/ping",method= RequestMethod.GET)
    public RestResult<String> ping(){
        RestResult<String> r = new RestResult<String>();
        r.setMsg("接口调用成功");
        r.setSuccess(true);
        return r;
    }
}
