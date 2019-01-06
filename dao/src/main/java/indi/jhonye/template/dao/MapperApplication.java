/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

/**
 * @author jhonye
 * @version $Id: MapperApplication.java, v 0.1 2019-01-06 10:54 PM jhonye Exp $$
 */
@SpringBootConfiguration
public class MapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapperApplication.class);
    }
}