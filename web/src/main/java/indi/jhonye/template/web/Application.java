/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.web;

import java.util.Objects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author jhonye
 * @version $Id: Application.java, v 0.1 2019-01-03 10:02 PM jhonye Exp $$
 */
@ImportResource("classpath:ApplicationContext.xml")
@SpringBootApplication(
        exclude = {DataSourceAutoConfiguration.class})
public class Application {

    // system env project name, Linux env
    private static final String PROJECT_NAME = "project.name";

    // system env project run environment, Linux env
    private static final String PROJECT_RUN_ENV = "project.run.env";

    // system env project log output type, Linux env
    private static final String PROJECT_LOG = "project.log";

    // init the system properties, use to publish project to test/staging/online
    private static void initSystemProperties() {
        if(Objects.isNull(System.getProperty(PROJECT_NAME))) {
            System.setProperty(PROJECT_NAME, "template");
        }

        if(Objects.isNull(System.getProperty(PROJECT_RUN_ENV))) {
            System.setProperty(PROJECT_RUN_ENV, "dev");
        }
    }

    public static void main(String[] args) throws Exception {
        initSystemProperties();

        SpringApplication.run(Application.class, args);
        System.out.println("template web started ...");
    }

}