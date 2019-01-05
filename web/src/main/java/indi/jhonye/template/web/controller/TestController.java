/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author jhonye
 * @version $Id: TestController.java, v 0.1 2019-01-03 10:28 PM jhonye Exp $$
 */
@Controller
public class TestController {

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public String home() {
        return "index.html";
    }

}