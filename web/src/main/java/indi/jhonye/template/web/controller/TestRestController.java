/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import indi.jhonye.template.web.service.TestMysqlService;

/**
 * @author jhonye
 * @version $Id: TestRestController.java, v 0.1 2019-01-03 10:36 PM jhonye Exp $$
 */
@RestController
public class TestRestController {

    @Autowired
    private TestMysqlService testMysqlService;

    @RequestMapping(value = "/echo", method = {RequestMethod.GET})
    public String echo() {
        System.out.println(testMysqlService.echoJson("{1:1}"));
        return "velocity.template home!";
    }

}