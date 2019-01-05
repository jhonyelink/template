/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author jhonye
 * @version $Id: Application.java, v 0.1 2019-01-03 10:02 PM jhonye Exp $$
 */
@SpringBootApplication(
        scanBasePackages = {"indi.jhonye.template.web"},
        exclude = {DataSourceAutoConfiguration.class})
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        System.out.println("template web started ...");
    }

}