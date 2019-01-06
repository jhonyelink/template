/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.biz.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jhonye
 * @version $Id: TestEchoServiceImpl.java, v 0.1 2019-01-06 5:07 PM jhonye Exp $$
 */
@Slf4j
@Service
public class TestEchoServiceImpl implements TestEchoService {

    @Override
    public String echoString(String message) {
        log.info(message);
        log.error(message);
        return message;
    }

}