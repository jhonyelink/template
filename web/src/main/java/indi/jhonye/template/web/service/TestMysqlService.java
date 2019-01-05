/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.web.service;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

/**
 * @author jhonye
 * @version $Id: TestMysqlService.java, v 0.1 2019-01-03 11:08 PM jhonye Exp $$
 */
@Service
public class TestMysqlService {

    public String echoJson(String json) {
        return JSON.parse(json).toString();
    }

}