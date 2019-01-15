/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.web.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author jhonye
 * @version $Id: TestController.java, v 0.1 2019-01-03 10:28 PM jhonye Exp $$
 */
@Controller
public class TestController {

    @RequestMapping(value = {"/", "/index"}, method = {RequestMethod.GET})
    public String home(Model model) {
        model.addAttribute("hello", Arrays.asList("1", "2", "3"));
        return "index";
    }

    @RequestMapping(value = "/error", method = {RequestMethod.GET})
    public String error() {
        return "error";
    }

}