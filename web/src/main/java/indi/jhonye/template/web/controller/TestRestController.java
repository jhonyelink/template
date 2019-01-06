/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import indi.jhonye.template.biz.service.TestEchoService;
import indi.jhonye.template.biz.service.TestMysqlService;
import indi.jhonye.template.dao.mapper.UserMapper;
import indi.jhonye.template.dao.mapperobject.TestUserMO;

/**
 * @author jhonye
 * @version $Id: TestRestController.java, v 0.1 2019-01-03 10:36 PM jhonye Exp $$
 */
@RestController
public class TestRestController {

    @Autowired
    private TestEchoService testEchoService;

    @Autowired
    private TestMysqlService testMysqlService;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/echo", method = {RequestMethod.GET})
    public String echo() {
        return "template home!";
    }

    @RequestMapping(value = "/echoString", method = {RequestMethod.GET})
    public String echoString(@RequestParam String message) {
        return testEchoService.echoString(message);
    }

    @RequestMapping(value = "/select", method = {RequestMethod.GET})
    public String select() {
        TestUserMO testUserMO = new TestUserMO();
        testUserMO.setUserName("jhonye");
        testUserMO.setAge(22);
        testUserMO.setExtension("extension ...");
        return JSON.toJSONString(testMysqlService.getUser(1L));
    }

}