package com.allinpaly.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/8/7.
 */
@Controller
public class test {
    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String x() {
        return "1111";
    }

}
