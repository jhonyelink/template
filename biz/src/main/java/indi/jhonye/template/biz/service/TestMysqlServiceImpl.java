/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.biz.service;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

/**
 * @author jhonye
 * @version $Id: TestMysqlServiceImpl.java, v 0.1 2019-01-06 9:36 PM jhonye Exp $$
 */
@Service
public class TestMysqlServiceImpl implements TestMysqlService{

    //@Autowired
    //private TestUserMapper testUserMapper;

    @Override
    public String getUser(Long id) {
        return JSON.toJSONString(id);
    }

}