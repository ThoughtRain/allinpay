package com.allinpaly.service;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/8/7.
 */
@Controller
public class test {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String x() {
        String sql = "select * from table_uers";
        List map = jdbcTemplate.queryForList(sql);
        Gson gson = new Gson();
        return gson.toJson(map);
    }

}
